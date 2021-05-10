package com.kkbox.dto;

import java.util.List;

public class SaveDto {

	private List<ContactDto> contacts;

	private VendorDto vendor;

	public List<ContactDto> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactDto> contacts) {
		this.contacts = contacts;
	}

	public VendorDto getVendor() {
		return vendor;
	}

	public void setVendor(VendorDto vendor) {
		this.vendor = vendor;
	}

}
