package mywebapp.mywebapp.Service;

import mywebapp.mywebapp.Entity.Customer;
import mywebapp.mywebapp.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer createCustomer(Customer customer) {
        System.out.println(customer.getId());
       Customer existing = customerRepository.findById(customer.getId()).orElse(null);
        return customerRepository.save(customer);
    }
    @Override
    public List<Customer> fetchAllCustomer() {
       return customerRepository.findAll();
    }
//    @Override
//    public Customer deleteCustomerById(Long id) {
//        Optional<Customer> customer = customerRepository.findById(id);
//        customerRepository.delete(customer);
//        return null;
//    }
    @Override
    public Customer updateCustomerById(Long id, Customer customer) {
        Customer existingcustomer = customerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        if (existingcustomer != null){
            existingcustomer.setId(customer.getId());
            existingcustomer.setName (customer.getName());
            existingcustomer.setEmail (customer.getEmail());
            existingcustomer.setPhoneNumber (customer.getPhoneNumber());
            customerRepository.save(existingcustomer);
        };

        return existingcustomer;
    }
}
