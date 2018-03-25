package com.example.demo.service;


import java.util.List;
import com.example.demo.model.noiDung;

public interface noidungService {
	Iterable<noiDung> findAll();
	
	noiDung findOne(int id);

    void save(noiDung contact);

    void delete(int id);
}