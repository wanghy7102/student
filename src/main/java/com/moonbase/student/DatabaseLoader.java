package com.moonbase.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.moonbase.student.dao.StudentRepository;
import com.moonbase.student.dto.Student;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final StudentRepository studentRepository;

	@Autowired
	public DatabaseLoader(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		{
			Student s = new Student();
			s.setStudentId(1L);
			s.setSalutation("Mr.");
			s.setFirstName("Hong-Yi");
			s.setLastName("Wang");
			this.studentRepository.save(s);
		}
	}

}
