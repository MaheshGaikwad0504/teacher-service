package com.springboot.teacher.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.teacher.model.Teacher;

@Repository
public class TeacherRepository {

	List<Teacher> teacherList = Arrays.asList(new Teacher(101, "Mahesh", "SSC"), new Teacher(102, "Ashok", "HSC"),
			new Teacher(103, "Sachin", "BE"), new Teacher(104, "Rahul", "Diploma"));

	public Teacher getTeacher(int teacherId) {
		for (Teacher t : teacherList) {
			if (t.getId() == teacherId) {
				Teacher teacher = new Teacher();
				teacher.setId(t.getId());
				teacher.setName(t.getName());
				teacher.setStandard(t.getStandard());
				return teacher;
			}
		}
		return null;
	}

	public List<Teacher> getAllTeachers() {
		return teacherList;
	}
}