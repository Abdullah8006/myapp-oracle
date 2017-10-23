package com.appster.abdullah.module.api.registration;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.appster.abdullah.entity.User;
import com.appster.abdullah.util.ResponseEnvelope;

@RestController
@RequestMapping("/api/v1")
public class RegistrationController {

    private static final Logger LOG = Logger.getLogger(RegistrationController.class);

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ResponseEnvelope> registerUser(@RequestBody @Validated User userData) {
        LOG.info("Registering user." + userData);
        if (userData != null && userData.getUsername().equals("Abdullah") && userData.getPassword().equals("123abd")) {
            return new ResponseEntity<ResponseEnvelope>(new ResponseEnvelope(true, "Success"), HttpStatus.OK);
        } else {
            return new ResponseEntity<ResponseEnvelope>(new ResponseEnvelope(false, "Failure"),
                    HttpStatus.UNAUTHORIZED);
        }
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ResponseEnvelope> getUser(@RequestBody @Validated User userData) {
        LOG.info("Details of user." + userData);
        return new ResponseEntity<ResponseEnvelope>(new ResponseEnvelope(userData, "Success"), HttpStatus.OK);
    }
    
}
