package com.hcl.ing.dao;

import com.hcl.ing.dto.CustomerRequestDto;
import com.hcl.ing.dto.CustomerResponseDto;
import com.hcl.ing.exception.BalanceNotEmptyExcpetion;
import com.hcl.ing.exception.MinimumBalanceException;

public interface CustomerDao {
	
	public CustomerResponseDto addCustomer(CustomerRequestDto requestDto) throws BalanceNotEmptyExcpetion, MinimumBalanceException;

	
}
