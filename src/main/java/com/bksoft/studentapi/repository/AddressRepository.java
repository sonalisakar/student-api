package com.bksoft.studentapi.repository;

import com.bksoft.studentapi.model.Address;
import org.apache.commons.math3.analysis.function.Add;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {

    //public Set<Address> findAllByRollNo(int rollNo);
}
