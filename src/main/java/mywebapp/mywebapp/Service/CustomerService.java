package mywebapp.mywebapp.Service;


import mywebapp.mywebapp.Entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer createCustomer (Customer customer);
    List<Customer> fetchAllCustomer ();
//  Customer deleteCustomerById (Long id);
    Customer updateCustomerById(Long id, Customer customer);
}
