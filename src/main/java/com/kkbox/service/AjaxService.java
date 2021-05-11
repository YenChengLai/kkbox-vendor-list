package com.kkbox.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kkbox.dto.SaveDto;

public interface AjaxService {

	String getInitData() throws JsonProcessingException;

	void save(SaveDto saveDto);

	void delete(String taxId);

}
