package com.appster.abdullah.module.FileUpload;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.appster.abdullah.entity.User;
import com.appster.abdullah.module.FileUpload.service.FileUploadService;
import com.appster.abdullah.util.ResponseEnvelope;
import com.appster.abdullah.util.AppConstant.UserType;

@Controller
public class FileUploadController {

    private FileUploadService fileUploadService;

    @Autowired
    public FileUploadController(FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }

    @PostMapping("/users/service/upload")
    @ResponseBody
    public ResponseEntity<ResponseEnvelope> handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println("File : " + file);
        User user = new User();
        user.setId(23443);
        user.setUsername("Abdullah");
        user.setUserType(UserType.ADMIN);
        String path = fileUploadService.uploadFile(user, file);
        return new ResponseEntity<ResponseEnvelope>(new ResponseEnvelope(path, "Success"), HttpStatus.OK);
    }

}
