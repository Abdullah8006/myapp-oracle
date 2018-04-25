package com.appster.abdullah.module.api.student;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.appster.abdullah.entity.Student;
import com.appster.abdullah.module.api.registration.RegistrationController;
import com.appster.abdullah.module.api.student.service.StudentService;
import com.appster.abdullah.util.ResponseEnvelope;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RequestMapping("/api/v1")
public class StudentController {
    
    private static final Logger LOG = Logger.getLogger(RegistrationController.class);
    
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<ResponseEnvelope> getStudents() {
        List<Student> students = studentService.getStudents();
        return new ResponseEntity<ResponseEnvelope>(new ResponseEnvelope(students, "Success"), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public ResponseEntity<ResponseEnvelope> addStudent(@RequestBody @Validated Student student) {
        LOG.info("Details of student." + student);
        student = studentService.addStudent(student);
        return new ResponseEntity<ResponseEnvelope>(new ResponseEnvelope(student, "Success"), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public ResponseEntity<ResponseEnvelope> updateStudent(@RequestBody @Validated Student student) {
        LOG.info("Details of student." + student);
        Student existing = studentService.getStudentById(student.getId());
        if(existing != null){
            existing.setFirstName(student.getFirstName());
            existing.setLastName(student.getLastName());
            existing.setContactNumberPrimary(student.getContactNumberPrimary());
            existing = studentService.updateStudent(existing);
        }
        return new ResponseEntity<ResponseEnvelope>(new ResponseEnvelope(existing, "Success"), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<ResponseEnvelope> deleteStudent(@PathVariable("id") long Id) {
        LOG.info("Delete a student. Id : " + Id);
        Student student = studentService.getStudentById(Id);
        if(student != null){
            studentService.deleteStudent(student);
        }
        return new ResponseEntity<ResponseEnvelope>(new ResponseEnvelope(null, "Success"), HttpStatus.OK);
    }
}
