package com.example;

import java.util.List;
import java.util.Scanner;

import com.example.entity.Customer;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;

public class MyApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Create CustomerServiceImpl obj

		CustomerService custService = new CustomerServiceImpl();

		int option;

		do {
			System.out.println("1. Add Customer");
			System.out.println("2. Get all customers");
			System.out.println("3. Get customer by id");
			System.out.println("4. Update Customer contact no");
			System.out.println("5. delete customer by name");
			System.out.println("99. exit application");
			System.out.println("Please select required option");

			option = sc.nextInt();
			if (option != 99) {
				switch (option) {

				case 1:
					// Get customer details from user
					System.out.println("Enter name: "); // Raj
					String name = sc.next();
					System.out.println("Enter Contact no."); // 9999911111
					String cNo = sc.next();
					System.out.println("Enter email:"); // raj@example.com
					String email = sc.next();

					// Create customer object
					Customer customer = new Customer();

					// initialize customer properties
					customer.setId((int)Math.round(Math.random()*1000000));
					customer.setName(name);
					customer.setContactNo(cNo);
					customer.setEmail(email);

					System.out.println("### new customer: " + customer);
					// Call service method to add customer obj in db.
					Customer newCustomer = custService.addCustomer(customer);

					// return db response
					System.out.println("newCustomer: " + customer);
					System.out.println(newCustomer.getContactNo()); // 999991111/nul;

					break;

				case 2:
					List<Customer> cList= custService.getAllCustomers();
					System.out.println(cList.size());
					//System.out.println(cList.get(0));
					System.out.println(cList);
					break;

				case 3:
					System.out.println("Enter Customer id: ");
					int cId = sc.nextInt();
					Customer customer2= custService.getCustomerById(cId);
					System.out.println();
					System.out.println("### find by id");
					System.out.println("customer: "+ customer2);
					break;

				case 4:
					// Update contact no.
					// get input from user
					System.out.println("Enter customer name: ");
					String name2 = sc.next();
					System.out.println("Enter new contact number: ");
					String cNo2 = sc.next();
					
					// Call service method to update contact no in db.
					String uCNo= custService.updateCustomerContactNo(name2, cNo2);
					
					// print response
					System.out.println(uCNo);
					break;

				case 5:
					// delete
					System.out.println("Enter customer name to delete");
					String cName = sc.next();
					
					// call service method to delete
					custService.deleteCustomerByName(cName);
					break;

				default:
					System.out.println("Choose any option between 1 to 5");

				}
				;// switch
			}
		} while (option != 99);
	};// main

}; // class
