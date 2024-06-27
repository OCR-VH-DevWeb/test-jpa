package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AnecdoticSecret;
import com.example.demo.repository.AnecdoticSecretRepository;

@Service
public class AnecdoticSecretService {

    @Autowired
    private AnecdoticSecretRepository anecdoticSecretRepository;

    public List<AnecdoticSecret> getAll() {
        List<AnecdoticSecret> anecdoticSecrets = this.anecdoticSecretRepository.findAll();
        return anecdoticSecrets;
    }

    public AnecdoticSecret getById(Long id) {
        AnecdoticSecret anecdoticSecret = this.anecdoticSecretRepository.findById(id).get();
        return anecdoticSecret;
    }
    
}
