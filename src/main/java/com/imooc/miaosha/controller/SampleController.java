package com.imooc.miaosha.controller;

import com.imooc.miaosha.redis.RedisService;
import com.imooc.miaosha.service.AnalysisService;
import com.imooc.miaosha.vo.CommandsVo;
import com.imooc.miaosha.vo.CommandsVoString;
import com.imooc.miaosha.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imooc.miaosha.result.CodeMsg;
import com.imooc.miaosha.result.Result;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;

@Controller
@RequestMapping("/demo")
public class SampleController {

    private static Logger log = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    AnalysisService analysisService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/form")
    public String toLogin() {
        return "form";
    }

    @RequestMapping("/analysis_result")
    public String toAnalysisResult() {
        return "analysis_result";
    }

    @RequestMapping("/do_analysis")
    @ResponseBody
    public Result<Boolean> doAnalysis(HttpServletResponse response, @Valid CommandsVo commandsVo) throws IOException {
        log.info(commandsVo.toString());
        return analysisService.analysis(response, commandsVo);
    }

    @RequestMapping("/do_analysis_string")
    @ResponseBody
    public Result<String> doAnalysis_string(HttpServletResponse response, @Valid CommandsVoString commandsVoString) throws IOException {
        log.info(commandsVoString.toString());
        return analysisService.analysisString(response, commandsVoString);
    }

    @RequestMapping("/error")
    @ResponseBody
    public Result<String> error() {
        return Result.error(CodeMsg.SESSION_ERROR);
    }

}
