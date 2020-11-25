package com.springboot.teacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.teacher.config.ServerProperties;
import com.springboot.teacher.model.Teacher;
import com.springboot.teacher.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	TeacherRepository teacherRepository;

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	DiscoveryClient discoveryClient;

	@Autowired
	ServerProperties serverProperties;

	public Teacher getTeacher(int teacherId) {
		return teacherRepository.getTeacher(teacherId);
	}

	/*
	 * public Student getStudentsInformation() { HttpHeaders header = new
	 * HttpHeaders(); HttpEntity<String> entity = new
	 * HttpEntity<String>(header);
	 * 
	 * List<ServiceInstance> instance =
	 * discoveryClient.getInstances("student-service");
	 * System.out.println("instance name: " +
	 * instance.get(0).getUri().toString()); String getStudentsInfoUrl =
	 * instance.get(0).getUri().toString() +
	 * serverProperties.getStudentsInfoUrl() + "/101"; ResponseEntity<Student>
	 * responseEntity = restTemplate.exchange(getStudentsInfoUrl,
	 * HttpMethod.GET, entity, Student.class); return responseEntity.getBody();
	 * }
	 */

	public List<Teacher> getAllTeachers() {
		return teacherRepository.getAllTeachers();
	}
}
