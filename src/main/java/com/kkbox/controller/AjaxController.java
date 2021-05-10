package com.kkbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kkbox.dto.SaveDto;

import com.kkbox.service.AjaxService;

@RestController
@RequestMapping("/vendor-list")
public class AjaxController {

	@Autowired
	private AjaxService ajaxSvc;

	@PostMapping("/getInitData")
	public String getInitData() throws JsonProcessingException {
		return ajaxSvc.getInitData();
	}

	@PostMapping("/save")
	public void save(@RequestBody SaveDto saveDto) {
		ajaxSvc.save(saveDto);
	}

}
