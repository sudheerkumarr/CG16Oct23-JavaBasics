package com.example.repository;

import java.util.List;

import com.example.entity.Customer;

public interface CustomerRepository {
	Customer addCustomer(Customer customer);
    List<Customer> getAllCustomers();
    List<Customer> getCustomerByName(String name);
    Customer getCustomerById(int id);
    void deleteCustomerByName(String name);
    Customer updateCustomerContactNo(String name, String contactNo);
    Customer updateCustomerEmail(String name, String email);
    Customer updateCustomer(String name, Customer customer);

}
