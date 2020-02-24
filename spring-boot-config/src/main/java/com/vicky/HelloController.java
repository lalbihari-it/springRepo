package com.vicky;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//@Value("${hello.vicky}") //if property is missing then application will not start. default value assign below
	@Value("${hello.vicky: default Value}")
	private String msg;
	
	@Value("${app.discription}") //in application.properties file itself we can read another property
	private String appName;
	
	@Value("Hello vicky") //everything under double quote is string
	private String msg1;
	
	@Value("${list.value}")
	private List<String> msgList; //read as list
	
	@Value("#{${my.dbvalue}}") //# indicate spring as this is spring expression language
	private Map<String,String> myMap;
	
	@Autowired
	private Dbsettings dbset;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/hello")
	public String greeting() {
		return dbset.getConnection() + " " + dbset.getHost() + " " + dbset.getPort(); 
	}

	@GetMapping("/envdetails")
	public String getEnvDetails() {
		return env.toString();
	}
	
}
