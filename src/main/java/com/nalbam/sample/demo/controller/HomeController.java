package com.nalbam.sample.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Map<String, Object> model) {
        String host;
        try {
            host = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            host = "Unknown";
            e.printStackTrace();
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));

        // host
	host += "my sample commit test";
        model.put("host", host);

        // date
        model.put("date", sdf.format(new Date()));

        return "index";
    }
    
    public String codeCoverageDummy() {
    	StringBuffer a = new StringBuffer();
    	a.append("hell");
    	a.append("o");
    	
    	return a.toString();
    	
    	
    }

}
