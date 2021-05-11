package com.kkbox.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kkbox.dto.ContactDto;
import com.kkbox.dto.SaveDto;
import com.kkbox.dto.VendorDto;
import com.kkbox.entity.Contact;
import com.kkbox.entity.Vendor;
import com.kkbox.repository.ContactRepository;
import com.kkbox.repository.VendorRepository;
import com.kkbox.service.AjaxService;

@Service
@Transactional
public class AjaxServiceImpl implements AjaxService {

	@Autowired
	private VendorRepository vendorRepo;

	@Autowired
	private ContactRepository contactRepo;

	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public String getInitData() throws JsonProcessingException {
		List<Map<String, Object>> dataList = new LinkedList<>();
		List<Vendor> vendorList = vendorRepo.findAll();
		vendorList.forEach(vendor -> {
			Map<String, Object> dataMap = new HashMap<>();
			dataMap.put("taxId", vendor.getTaxId());
			dataMap.put("address", vendor.getAddress());
			dataMap.put("corpName", vendor.getCorpName());
			dataMap.put("fax", vendor.getFax());
			dataMap.put("filler", vendor.getFiller());
			dataMap.put("inCharge", vendor.getInCharge());
			dataMap.put("memo", vendor.getMemo());
			dataMap.put("phone", vendor.getPhone());
			dataMap.put("updateTime", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(vendor.getUpdateTime()));
			dataList.add(dataMap);
		});

		return objectMapper.writeValueAsString(dataList);
	}

	@Override
	public void save(SaveDto saveDto) {

		List<ContactDto> contacts = saveDto.getContacts();
		VendorDto vendorDto = saveDto.getVendor();
		String taxId = vendorDto.getTaxId();

		Vendor vendor = new Vendor();
		vendor.setTaxId(taxId);
		vendor.setCorpName(vendorDto.getCorpName());
		vendor.setPhone(vendorDto.getPhone());
		vendor.setFiller(vendorDto.getFiller());
		vendor.setUpdateTime(new Date());
		vendor.setInCharge(vendorDto.getInCharge());
		vendor.setFax(vendorDto.getFax());
		vendor.setMemo(vendorDto.getMemo());
		vendor.setAddress(vendorDto.getAddress());

		vendorRepo.save(vendor);

		contacts.forEach(contactDto -> {
			Contact contact = new Contact();
			contact.setTaxId(taxId);
			contact.setName(contactDto.getName());
			contact.setJob(contactDto.getJob());
			contact.setPhone(contactDto.getContactPhone());
			contact.setEmail(contactDto.getEmail());

			contactRepo.save(contact);
		});

	}

	@Override
	public void delete(String taxId) {
		contactRepo.deleteByTaxId(taxId);
		vendorRepo.deleteById(taxId);
	}

}
