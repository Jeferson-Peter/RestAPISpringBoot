package com.rest.test.restester.controller;

import com.rest.test.restester.model.Cliente;
import com.rest.test.restester.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar(){
        return  clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar (@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
    /*@GetMapping
    public String hello (){
        return "Olá de algum lugar";
    }*/
}
