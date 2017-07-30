package com.appster.abdullah.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appster.abdullah.entity.Institute;
import com.appster.abdullah.entity.InstituteClass;
import com.appster.abdullah.entity.Student;
import com.appster.abdullah.entity.User;
import com.appster.abdullah.repository.CourseRepository;
import com.appster.abdullah.repository.InstituteClassRepository;
import com.appster.abdullah.repository.InstituteRepository;
import com.appster.abdullah.repository.StudentRepository;
import com.appster.abdullah.repository.UserRepository;
import com.appster.abdullah.service.UserService;
import com.appster.abdullah.springIntegration.TestGateway;

@Controller
public class WelcomeController {

    private static final Logger LOG = Logger.getLogger(WelcomeController.class);
    private TestGateway gateway;
    private UserService userService;
    @Autowired
    private InstituteClassRepository instituteClassRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private InstituteRepository instituteRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    public WelcomeController(TestGateway gateway, UserService userService) {
        this.gateway = gateway;
        this.userService = userService;
    }

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        // gateway.updateUserStatistics(MessageBuilder.withPayload(getUsers()).build());
        model.put("message", "CONTROLLER_MESSAGE");
        return "welcome";
    }

    @RequestMapping("/addInstituteClasses")
    public String savaUser(Map<String, Object> model) {

        Institute institute = instituteRepository.findOne((long) 1);

        List<InstituteClass> classes = new ArrayList<>();

        InstituteClass classOne = new InstituteClass();
        classOne.setName("Class One");
        classOne.setInstitute(institute);
        classes.add(classOne);

        InstituteClass classTwo = new InstituteClass();
        classTwo.setName("Class Two");
        classTwo.setInstitute(institute);
        classes.add(classTwo);

        instituteClassRepository.save(classes);

        LOG.info("Persisting Customers and there associated addresses");
        return "welcome";
    }

    @RequestMapping("/testCriteria")
    public String testCriteria() {
        LOG.info("Persisting Customers and there associated addresses");
        userService.testCriteriaQuery();
        return "welcome";
    }

    private List<User> getUsers() {
        List<User> users = new ArrayList<>();

        User userOne = new User();
        userOne.setUsername("Aamir Arafat");

        User userTwo = new User();
        userTwo.setUsername("Arsalan Aslam");

        users.add(userOne);
        users.add(userTwo);

        return users;
    }

    @RequestMapping("/user")
    public String addUser() {
        List<User> users = getUsers();
        for (User user : users)
            userService.addUser(user);
        return "welcome";
    }

    @RequestMapping("/student-courses")
    @Transactional
    public String addStudentAndCourses() {
        User user = new User();
        user.setAge(28);
        user.setUsername("Abdullah");
        user.setPassword("7^&&@^*&@#&*&@#&@#!@#$%^&U");
        userRepository.save(user);
        return "welcome";
    }
}