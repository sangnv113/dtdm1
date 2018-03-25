package com.example.demo.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.TinTuc;;

public interface TinTucRepository extends CrudRepository<TinTuc, Integer> {

    //List<TinTuc> findByIdContaining(String q);

	

}