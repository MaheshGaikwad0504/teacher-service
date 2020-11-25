package com.springboot.teacher.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "server")
public class ServerProperties {

	private String studentsInfoUrl;

	public ServerProperties() {

	}

	public String getStudentsInfoUrl() {
		return studentsInfoUrl;
	}

	public void setStudentsInfoUrl(String studentsInfoUrl) {
		this.studentsInfoUrl = studentsInfoUrl;
	}

}
