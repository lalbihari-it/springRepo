package com.vicky.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vicky.dao.StudentRep;
import com.vicky.model.Student;

//@Controller
public class StudentController {
	/*
	 * 
	 * @Autowired StudentRep stdRepo;
	 * 
	 * @RequestMapping("/") public String home() { return "home.jsp"; }
	 * 
	 * @RequestMapping("/addStudent") public String addStudentindb(Student std) {
	 * stdRepo.save(std); return "home.jsp"; }
	 * 
	 * @RequestMapping("/getStudent") public ModelAndView
	 * getStudentindb(@RequestParam int aid) { //stdRepo.get(std); ModelAndView mv =
	 * new ModelAndView("showStudent.jsp"); Student std =
	 * stdRepo.findById(aid).orElse(new Student()); mv.addObject("std", std);
	 * 
	 * System.out.println(stdRepo.findByAname("Vicky")); //case sensitive
	 * //System.out.println(stdRepo.getByAname('vicky"));
	 * 
	 * //System.out.println(stdRepo.findByAidGreaterThan(103));
	 * 
	 * System.out.println(stdRepo.findByNameSorted());
	 * 
	 * return mv; }
	 * 
	 * 
	 * @RequestMapping("/students")
	 * 
	 * @ResponseBody public String getStudents() {
	 * 
	 * return stdRepo.findAll().toString(); }
	 * 
	 * 
	 * 
	 * //@RequestMapping("/students")
	 * 
	 * @RequestMapping(path="/students", produces = "application/xml")
	 * 
	 * @ResponseBody public List<Student> getStudents() {
	 * 
	 * return stdRepo.findAll(); }
	 * 
	 * 
	 * 
	 * 
	 * @RequestMapping("/student/{aid}")
	 * 
	 * @ResponseBody public String getStudent(@PathVariable int aid) {
	 * 
	 * return stdRepo.findById(aid).toString(); }
	 * 
	 * 
	 * @RequestMapping("/student/{aid}")
	 * 
	 * @ResponseBody public Optional<Student> getStudent(@PathVariable int aid) {
	 * 
	 * return stdRepo.findById(aid); }
	 */}
