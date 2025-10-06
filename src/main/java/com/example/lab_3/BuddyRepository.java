package com.example.lab_3;


import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface BuddyRepository extends CrudRepository<BuddyInfo, Integer>{
    List<BuddyInfo> findByName(String Name);

    BuddyInfo findById(int id);
}
