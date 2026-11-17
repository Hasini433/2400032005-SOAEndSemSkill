package soa.service;

import org.springframework.stereotype.Service;

import soa.model.Student;

@Service
public class StudentService {

	//Get Student
	public Student getStudent(Long id)
	{
		if(id != 1)
			throw new RuntimeException("Student not found");
		
		Student S = new Student();
		S.setId(1L);
		S.setName("XXXX");
		
		return S;
	}
}
