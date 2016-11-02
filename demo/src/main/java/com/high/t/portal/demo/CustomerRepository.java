package com.high.t.portal.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by gibson.luo on 2016/11/2.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
