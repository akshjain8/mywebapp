package mywebapp.mywebapp.Repository;

import mywebapp.mywebapp.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface CustomerRepository extends JpaRepository<Customer,Long > {
//    void delete(Optional<Customer> customer);
}

