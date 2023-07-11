package com.mtec.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mtec.model.Customer;
@Service
public interface ICustomerService {
	public List<Customer> findAll();
	public Customer save(Customer customer);
	public Customer findById(Integer id);
	public void delete(Integer id);
	public List<Customer> findByKeyword(String keyword);
	public List<Customer> findAll(String keyword);
	}