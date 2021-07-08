//package com.imooc.miaosha.controller;
//
//import javax.servlet.http.HttpServletResponse;
//import javax.validation.Valid;
//
//import com.imooc.miaosha.service.AnalysisService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.imooc.miaosha.redis.RedisService;
//import com.imooc.miaosha.result.Result;
////import com.imooc.miaosha.service.MiaoshaUserService;
//import com.imooc.miaosha.vo.LoginVo;
//
//import java.io.IOException;
//
//@Controller
//@RequestMapping("/demo")
//public class LoginController {
//
//	private static Logger log = LoggerFactory.getLogger(LoginController.class);
//
////	@Autowired
////	MiaoshaUserService userService;
//    @Autowired
//    AnalysisService analysisService;
//
//	@Autowired
//	RedisService redisService;
//
//    @RequestMapping("/form")
//    public String toLogin() {
//        return "form";
//    }
//
//    @RequestMapping("/do_analysis")
//    @ResponseBody
//    public Result<Boolean> doAnalysis(HttpServletResponse response, @Valid LoginVo loginVo) throws IOException {
//    	log.info(loginVo.toString());
//        return analysisService.analysis(response, loginVo);
////    	return Result.success(true);
//    }
//}
