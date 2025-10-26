package com.example.lab_3;


import org.springframework.data.repository.CrudRepository;

import java.util.List;



public interface BuddyRepository extends CrudRepository<BuddyInfo, Integer>{
    List<BuddyInfo> findByName(String Name);

    BuddyInfo findById(int id);
}
