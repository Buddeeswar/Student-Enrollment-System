
package com.pack.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.model.Student;
import com.pack.service.StudentService;

@Controller
public class StudentController {	
	@Autowired
	private StudentService studentService;	
	@RequestMapping(value="/")
	public String studentEnrollmentPage(ModelMap map) {
		Student student=new Student();
		map.addAttribute("studentForm",student);
		
		return "StudentEnrollment";
	}	
	@RequestMapping(value="/insertSt",method=RequestMethod.POST)
	public String saveStudent(@Validated @ModelAttribute("studentForm")Student stu,BindingResult result,ModelMap map) {
		String response="";
	    if(result.hasErrors()) {
	    	response="StudentEnrollment";
	    }
	    else {
	    	 Random r=new Random();
	         int stid=r.nextInt(99999)+10000;
	         stu.setStid(stid);
	         studentService.insertStudent(stu);
	         List<Student> stList=studentService.fetchAllStudent();
	         map.addAttribute("stList",stList);
	         response="StudentSuccess";
	    }
		return response;
		
	}
	@RequestMapping(value="/deleteSt/{id}")
	public String deleteStudent(@PathVariable("id")Integer stid,ModelMap map) {
		
		studentService.deleteStudent(stid);
		 List<Student> stList=studentService.fetchAllStudent();
         map.addAttribute("stList",stList);
         
         return "StudentSuccess";
		
	}
	@RequestMapping(value="/fetchById/{sid}")
    public String fetchEmployeeById(@PathVariable("sid")Integer stid,ModelMap map) {
    	

   	 Student student=studentService.fetchStudentById(stid);
   	 map.addAttribute("editForm",student);
		return "StudentUpdate";
	}
	@RequestMapping(value="/updateSt", method=RequestMethod.POST)
    public String updateEmployee(@Validated @ModelAttribute("editForm")Student st, BindingResult result,ModelMap map) {

   	 String response="";
   	 if(result.hasErrors()) {
   		 response="StudentUpdate";
   		 
   	 }
   	 else {
   		 studentService.updateStudent(st);
   		 List<Student> stList=studentService.fetchAllStudent();
            map.addAttribute("stList",stList);
       	 return "StudentSuccess";
   		 
   	 }
   	 return response;
	}
}
