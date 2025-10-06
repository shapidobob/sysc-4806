package com.example.lab_3;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface AddressRepository extends CrudRepository<AddressBook, Integer>{
    Optional<AddressBook> findById(Long id);
}
