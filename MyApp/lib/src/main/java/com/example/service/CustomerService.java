package com.example.service;

import java.util.List;

import com.example.entity.Customer;

public interface CustomerService {
	
	Customer addCustomer(Customer customer);
    List<Customer> getAllCustomers();
    List<Customer> getCustomerByName(String name);
    Customer getCustomerById(int id);
    void deleteCustomerByName(String name);
    String updateCustomerContactNo(String name, String contactNo);
    String updateCustomerEmail(String name, String email);
    Customer updateCustomer(String name, Customer customer);

}
