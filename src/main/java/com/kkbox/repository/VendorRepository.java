package com.kkbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkbox.entity.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, String> {

}
