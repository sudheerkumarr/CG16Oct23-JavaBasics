package com.example.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import com.example.entity.Customer;

//@TestMethodOrder(OrderAnnotation.class)
class CustomerTest {

	private CustomerService custService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
		custService = new CustomerServiceImpl();

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
		custService = null;
	}

	@Test
	// @Order(1)
	@RepeatedTest(3)
	void addCustomerTest() {

		Customer c = new Customer();
		c.setId(1000);
		c.setName("Raj");
		c.setContactNo("9999912345");
		c.setEmail("raj@example.com");

		Customer newCustomer = custService.addCustomer(c);

		assertEquals(c, newCustomer);
		assertEquals(c.getName(), newCustomer.getName());

	}

	@Test
	// @Order(2)
	@Tag("sanity")
	@RepeatedTest(3)
	void getAllCustomersTest() {

		// Create customer obj
		Customer c = new Customer();
		c.setId(1000);
		c.setName("Raj");
		c.setContactNo("9999912345");
		c.setEmail("raj@example.com");

		// add customer to list
		Customer newCustomer = custService.addCustomer(c);

		// get all customers
		List<Customer> cList = custService.getAllCustomers();

		// validate
		assertEquals(1, cList.size());
		assertEquals(cList.get(0).getName(), "Raj");

	}

	@Test
	//@Disabled
	@Tag("sanity")
	void deleteCustomerByNameTest() {
		

		// Create customer obj
		Customer c = new Customer();
		c.setId(1000);
		c.setName("Raj");
		c.setContactNo("9999912345");
		c.setEmail("raj@example.com");

		// add customer to list
		Customer newCustomer = custService.addCustomer(c);

		// get all customers
		List<Customer> cList = custService.getAllCustomers();

		// validate
		assertEquals(1, cList.size());

		custService.deleteCustomerByName("Raj");
		

		// validate
		assertEquals(0, cList.size());

	}

}
