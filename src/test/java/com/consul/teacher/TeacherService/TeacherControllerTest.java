package com.consul.teacher.TeacherService;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.springboot.teacher.controller.TeacherController;

@RunWith(SpringJUnit4ClassRunner.class)
public class TeacherControllerTest {

	private MockMvc mockMvc;

	@InjectMocks
	private TeacherController controller;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

}
