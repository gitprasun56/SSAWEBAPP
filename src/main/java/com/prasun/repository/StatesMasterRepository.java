package com.prasun.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prasun.entities.StatesMasterEntity;

public interface StatesMasterRepository extends JpaRepository<StatesMasterEntity, Serializable> {

	@Query(value = "Select stateName from StatesMasterEntity")
	public List<String> findStateNames();
	
}
