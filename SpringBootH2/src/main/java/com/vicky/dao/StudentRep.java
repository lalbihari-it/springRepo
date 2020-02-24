package com.vicky.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.vicky.model.Student;
//public interface StudentRep extends CrudRepository<Student, Integer> {
public interface StudentRep extends JpaRepository<Student, Integer> {
	List<Student> findByTech(String tech);
	List<Student> getByTech(String tech);
	
	List<Student> findByAname(String aname);
	List<Student> getByAname(String n);
	
	List<Student> findByAidGreaterThan(int id);
	
	@Query("from Student order by aname")
	List<Student> findByNameSorted();
}
	