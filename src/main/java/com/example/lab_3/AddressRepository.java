package com.example.lab_3;

import com.example.lab_3.AddressBook;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface AddressRepository extends CrudRepository<AddressBook, Integer>{
    Optional<AddressBook> findById(Long id);
}
