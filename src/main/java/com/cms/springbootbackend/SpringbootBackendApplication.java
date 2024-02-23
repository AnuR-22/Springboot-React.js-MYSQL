package com.cms.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cms.springbootbackend.model.Student;
import com.cms.springbootbackend.repository.StudentRepository;

@SpringBootApplication
public class SpringbootBackendApplication  implements CommandLineRunner {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
		
		@Autowired
		private StudentRepository studentRepository;

		@Override
		public void run(String... args) throws Exception {
			
			// TODO Auto-generated method stub
			
//			Student student=new Student();
//		    
//		     student.setFirstName("Ramesh");
//		     student.setLastName("Fadatare");
//		     student.setEmailId("ramesh@gmail.com");
//			studentRepository.save(student);
//	
//			Student student1=new Student();
//			student1.setFirstName("John");
//			student1.setLastName("Cena");
//			student1.setEmailId("cena@gmail.com");
//			studentRepository.save(student1);
			
		}
		
		
		
	}

			
		
	


