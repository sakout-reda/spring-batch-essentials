package com.example.springbatchessentials.repository;

import com.example.springbatchessentials.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
    @Query(""+
            "select case when count(c)>0"+
            " then true else false END "+
            "from Customer c where c.email=?1"
    )
    Boolean verifyIfEmailExists(String email);
}
