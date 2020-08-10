package com.prasun.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.prasun.entities.SsnMasterEntity;
import com.prasun.model.SsnEnrollmentRequest;
import com.prasun.repository.SsnMasterRepository;
import com.prasun.repository.StatesMasterRepository;

public class SsaServiceImpl implements SsaService {

	@Autowired
	private StatesMasterRepository statesRepo;
	@Autowired
	private SsnMasterRepository ssnRepo;
	
	@Override
	public List<String> getAllStatesNames() {
		
		return statesRepo.findStateNames();
	}

	@Override
	public Long ssnEnrollment(SsnEnrollmentRequest req) {
		
		SsnMasterEntity entity=new SsnMasterEntity();
		BeanUtils.copyProperties(req, entity);
		SsnMasterEntity savedEntity=ssnRepo.save(entity);
		if(savedEntity!=null)
		{
			return savedEntity.getSsn();
		}
		return null;
	}

	@Override
	public String checkEnrollment(Long ssn, String stateName) {
		
		SsnMasterEntity entity=ssnRepo.findBySsnAndStateName(ssn, stateName);
		if(entity!=null) {
			return "VALID";
		}
		return "IN-VALID";
	}

}
