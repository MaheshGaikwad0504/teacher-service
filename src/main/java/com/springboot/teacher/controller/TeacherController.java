package com.springboot.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.teacher.model.Teacher;
import com.springboot.teacher.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@GetMapping("/test")
	public String test() {
		return "Hello";
	}

	@GetMapping("/teachers/{teacherId}")
	public Teacher getTeacher(@PathVariable int teacherId) {
		return teacherService.getTeacher(teacherId);
	}

	/*
	 * @GET
	 * 
	 * @RequestMapping("/studentInfo") public Student getStudentsInformation(){
	 * return teacherService.getStudentsInformation(); }
	 */

	@GetMapping("/teachers")
	public List<Teacher> getAllTeachers() {
		return teacherService.getAllTeachers();
	}

}
