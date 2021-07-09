package com.imooc.miaosha.service;

import com.imooc.miaosha.result.Result;
import com.imooc.miaosha.vo.CommandsVo;
import com.imooc.miaosha.vo.CommandsVoString;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


@Service
public class AnalysisService {

    public Result<Boolean> analysis(HttpServletResponse response, CommandsVo commandsVo) throws IOException {
        String[] cmds = commandsVo.getCommands();
        Process ps;
        StringBuffer sb = new StringBuffer();
        for(String cmd : cmds){
            ps = Runtime.getRuntime().exec(new String[]{"cmd","/c",cmd}); // windows
            // Process ps = Runtime.getRuntime().exec(new String[]{"/bin/sh","-c","ps -ef"}); // linux
            // 获取脚本命令的输出
            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream(),"gbk"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sb.append(line).append("\n");
            }
        }
        String result = sb.toString();
        return Result.success(true);
    }

    public static void main(String[] args) throws IOException {
        AnalysisService template = new AnalysisService();
//        template.analysis();
    }

    public Result<String> analysisString(HttpServletResponse response, CommandsVoString commandsVoString) throws IOException {
        String cmd =  commandsVoString.getCommand1();
        Process ps;
        StringBuffer sb = new StringBuffer();
        ps = Runtime.getRuntime().exec(new String[]{"cmd","/c",cmd}); // windows
        // Process ps = Runtime.getRuntime().exec(new String[]{"/bin/sh","-c","ps -ef"}); // linux
        // 获取脚本命令的输出
        BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream(),"gbk"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            sb.append(line).append("\n");
        }
        String result = sb.toString();
        return Result.success(result);
    }
}
