package com.cms.springbootbackend.controller;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cms.springbootbackend.exception.ResourceNotFoundException;
import com.cms.springbootbackend.model.Student;
import com.cms.springbootbackend.repository.StudentRepository;


	@CrossOrigin("*")
	@RestController
	@RequestMapping("/api/v1/students")
	public class StudentController {

	    @Autowired
	    private StudentRepository studentRepository;

	    @GetMapping
	    public List<Student> getAllStudents(){
	    	System.out.println(studentRepository.findAll());
	        return studentRepository.findAll();
	    }
	    
	

	    // build create employee REST API
	    @PostMapping
	    public Student createStudent(@RequestBody Student student) {
	        return studentRepository.save(student);
	    }
	

	    // build get employee by id REST API
	    @GetMapping("{id}")
	    public ResponseEntity<Student> getStudentById(@PathVariable  long id){
	        Student student = studentRepository.findById(id)
	        		.orElseThrow(() -> new ResourceNotFoundException ("Student not exist with id:" + id));
	        return ResponseEntity.ok(student);
	    }
	    
	    // build update employee REST API
	    @PutMapping("{id}")
	    public ResponseEntity<Student> updateStudent(@PathVariable long id,@RequestBody Student studentDetails) {
	        Student updateStudent = studentRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("Student not exist with id: " + id));

	        updateStudent.setFirstName(studentDetails.getFirstName());
	        updateStudent.setLastName(studentDetails.getLastName());
	        updateStudent.setEmailId(studentDetails.getEmailId());

	        studentRepository.save(updateStudent);

	        return ResponseEntity.ok(updateStudent);
	    }

	    // build delete employee REST API
	    @DeleteMapping("{id}")
	    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable long id){

	        Student student = studentRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("Student not exist with id: " + id));

	        studentRepository.delete(student);

	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
	    }
	


