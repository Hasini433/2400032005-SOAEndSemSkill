package soa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.model.Student;
import soa.service.StudentService;

@RestController
@RequestMapping("api")
public class StudentController {

	StudentService SS;
	public StudentController(StudentService SS)
	{
		this.SS = SS;
	}
	
	@GetMapping("student/{id}")
	public Student getStudent(@PathVariable Long id)
	{
		return SS.getStudent(id);
	}
}
