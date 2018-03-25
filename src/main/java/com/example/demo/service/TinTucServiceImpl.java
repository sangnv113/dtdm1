package com.example.demo.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TinTuc;
import com.example.demo.repository.TinTucRepository;

@Service
public class TinTucServiceImpl implements TinTucService {
	@Autowired
    private TinTucRepository employeeRepository;

 @Override
    public Iterable<TinTuc> findAll() {
        return employeeRepository.findAll();
    }
 /*  
    @Override
    public List<TinTuc> search(String q) {
        return employeeRepository.findByIdContaining(q);
    }
}*/
    @Override
    public TinTuc findOne(int id) {
        return ( employeeRepository).findOne(id);}
    

    @Override
    public void save(TinTuc contact) {
    	employeeRepository.save(contact);
    }

    @Override
    public void delete(int id) {
    	employeeRepository.delete(id);
    }
}