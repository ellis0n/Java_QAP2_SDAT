package com.qap2.rest.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "vendor", path = "vendor")
public interface VendorAPI extends JpaRepository<Vendor, Long> {

    List<Vendor> findByName(@Param("name") String title);

    List<Vendor> findByOwner(@Param("owner") String owner);

    List<Vendor> findByCategory(@Param("category") String category);

    List<Vendor> findBySubcategory(@Param("subcategory") String subcategory);

    List<Vendor> findByCity(@Param("city") String city);

    List<Vendor> findByAddress(@Param("address") String address);

}

