package com.high.t.portal.console.dao;

import com.high.t.portal.console.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gibson.luo on 2016/11/2.
 */
public interface DomainRepository extends CrudRepository<Customer, Long> {
}
