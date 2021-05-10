package com.kkbox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vendor-list")
public class VendorController {

	@GetMapping("/base")
	public String base() {

		return "vendor-info";
	}

}
