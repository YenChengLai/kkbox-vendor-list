package com.kkbox.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kkbox.entity.Vendor;
import com.kkbox.repository.VendorRepository;

@Controller
@RequestMapping("/vendor-list")
public class VendorController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private VendorRepository vendorRepo;

	@GetMapping("/base")
	public String greeting() {

		return "vendor-info";
	}

	@GetMapping("/hi")
	public String sayHi() {
		logger.info("Hello world");
		List<Vendor> vendorList = vendorRepo.findAll();
		logger.info(vendorList.toString());
		return "HI";
	}

}
