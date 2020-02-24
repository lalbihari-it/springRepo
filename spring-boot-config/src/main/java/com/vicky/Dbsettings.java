package com.vicky;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
/*
 * @Profile("default") this profile is bydefault is active but we can speficy
 * @Profile("test")
 * @Profile("prod")
 * In this way we can write logic based on profile selected
 */

@Configuration
@ConfigurationProperties("db") //prefix
public class Dbsettings {
	private String connection;
	private String host;
	private int port;
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
