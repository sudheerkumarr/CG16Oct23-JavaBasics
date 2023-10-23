package com.example.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.entity.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {

	List<Customer> custList = new ArrayList<>();
	

	@Override
	public Customer addCustomer(Customer customer) {
		custList.add(customer);
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return custList;
	}

	@Override
	public List<Customer> getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(int id) {
		
		return custList.stream().filter(c->c.getId()==id).findFirst().get();
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
