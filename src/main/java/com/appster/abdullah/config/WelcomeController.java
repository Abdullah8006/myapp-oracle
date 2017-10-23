package com.appster.abdullah.config;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appster.abdullah.entity.User;

@Controller
public class WelcomeController {

    private static final Logger LOG = Logger.getLogger(WelcomeController.class);

    @RequestMapping(value = { "", "/", "index" })
    public String getWelcomePage(Map<String, Object> model) {
        LOG.info("Home page accessed.");
        model.put("message", "Airspace");
        return "index";
    }

    @RequestMapping("/contact")
    public String contact(Map<String, Object> model) {
        LOG.info("Contact page accessed.");
        model.put("message", "Salaam u alaikum!");
        return "contact";
    }

    @RequestMapping("/work")
    public String work(Map<String, Object> model) {
        LOG.info("Work page accessed.");
        model.put("message", "Salaam u alaikum!");
        return "work";
    }
}