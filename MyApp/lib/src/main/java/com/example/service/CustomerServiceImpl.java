package com.example.service;

import java.util.List;

import com.example.entity.Customer;
import com.example.repository.CustomerRepository;
import com.example.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepository custRepo = new CustomerRepositoryImpl();
	
	@Override
	public Customer addCustomer(Customer customer) {
			return custRepo.addCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
			return custRepo.getAllCustomers();
	}

	@Override
	public List<Customer> getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(int id) {
		
		return custRepo.getCustomerById(id);
	}

	@Override
	public void deleteCustomerByName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer updateCustomerContactNo(String name, String contactNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomerEmail(String name, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(String name, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
