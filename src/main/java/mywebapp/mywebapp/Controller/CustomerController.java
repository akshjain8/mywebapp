package mywebapp.mywebapp.Controller;

import mywebapp.mywebapp.Entity.Customer;
import mywebapp.mywebapp.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private CustomerService service;
    @GetMapping("/get")
    public List<Customer> fetchAllCustomer (){
            return service.fetchAllCustomer();
    }
    @PostMapping("/create")
    public Customer createCustomer (@RequestBody Customer customer){
        service.createCustomer(customer);
        return (Customer) ResponseEntity.status(200);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Integer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer){
      service.updateCustomerById(id, customer);
        return ResponseEntity.ok(200);
    }
}
