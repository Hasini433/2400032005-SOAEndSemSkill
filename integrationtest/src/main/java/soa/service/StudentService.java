package soa.service;

import org.springframework.stereotype.Service;

import soa.model.Student;
import soa.repository.StudentRepository;

@Service
public class StudentService {

	StudentRepository SR;
	
	public StudentService(StudentRepository SR)
	{
		this.SR = SR;
	}
	
	//Get Student
	public Student getStudent(Long id)
	{
		if(id != 1)
			throw new RuntimeException("Student not found");
		
		Student S = SR.findById(id).get();
		
		return S;
	}
}
