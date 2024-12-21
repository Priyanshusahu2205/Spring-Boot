package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Loginmodel;

@Repository
public interface Logininterface extends JpaRepository<Loginmodel,Integer> {

}
