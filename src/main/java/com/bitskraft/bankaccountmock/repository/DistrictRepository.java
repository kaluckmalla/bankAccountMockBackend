package com.bitskraft.bankaccountmock.repository;

import com.bitskraft.bankaccountmock.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District,String> {
}
