package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.noiDung;
import com.example.demo.repository.noidungRepository;

@Service
public class noidungserviceimpl implements noidungService {
	@Autowired
    private noidungRepository noidungndRepository;

 @Override
    public Iterable<noiDung> findAll() {
        return noidungndRepository.findAll();
    }
 /*  
    @Override
    public List<TinTuc> search(String q) {
        return employeeRepository.findByIdContaining(q);
    }
}*/
    @Override
    public noiDung findOne(int id) {
        return ( noidungndRepository).findOne(id);}
    

    @Override
    public void save(noiDung contact) {
    	noidungndRepository.save(contact);
    }

    @Override
    public void delete(int id) {
    	noidungndRepository.delete(id);
    }
}