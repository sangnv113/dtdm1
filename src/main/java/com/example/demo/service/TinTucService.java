package com.example.demo.service;


import java.util.List;
import com.example.demo.model.TinTuc;

public interface TinTucService {
	Iterable<TinTuc> findAll();
	/*
    List<TinTuc> search(String q);
*/
    TinTuc findOne(int id);

    void save(TinTuc contact);

    void delete(int id);
}