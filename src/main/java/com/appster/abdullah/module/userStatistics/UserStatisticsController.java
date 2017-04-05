package com.appster.abdullah.module.userStatistics;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userstats")
public class UserStatisticsController {

	@RequestMapping("/{id}")
	@ResponseBody
	public ResponseEntity testRest(Long id) {
		System.out.println("Webservice called successfully");
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
