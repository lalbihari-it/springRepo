package com.vicky.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.dao.StudentRep;
import com.vicky.model.Student;

@RestController
public class StdController {
	@Autowired
	StudentRep std;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return std.findAll();
	}
	
	@PostMapping(path="/student", consumes={"application/xml","application/json"})
	public Student addStudent(@RequestBody Student s) { //for sending raw data eg. xml , json
		std.save(s);
		return s;
	}

	@GetMapping("/student")
	public Student addStudentbyget(Student s) {
		std.save(s);
		return s;
	}
	
	@DeleteMapping(path="/student/{id}")
	public String deleteStudent(@PathVariable int id) {
		Student s = std.getOne(id);
		std.delete(s);
		return "deleted";
	}
	
	@PutMapping("/student")
	public Student addorupdateStudent(@RequestBody Student st) {
		
		std.save(st);
		return st;
	}
}
