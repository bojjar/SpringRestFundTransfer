package com.hcl.ing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.ing.dao.CustomerDao;
import com.hcl.ing.dto.CustomerRequestDto;
import com.hcl.ing.dto.CustomerResponseDto;
import com.hcl.ing.exception.BalanceNotEmptyExcpetion;
import com.hcl.ing.exception.MinimumBalanceException;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;

	
	@Transactional
	public CustomerResponseDto addCustomer(CustomerRequestDto requestDto) throws BalanceNotEmptyExcpetion, MinimumBalanceException {
		return customerDao.addCustomer(requestDto);
	}

}
