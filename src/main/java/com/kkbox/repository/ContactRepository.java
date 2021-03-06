package com.kkbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkbox.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
	void deleteByTaxId(String taxId);
}
