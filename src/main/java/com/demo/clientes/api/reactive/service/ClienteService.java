package com.demo.clientes.api.reactive.service;

import com.demo.clientes.api.reactive.model.Cliente;
import com.demo.clientes.api.reactive.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Flux<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public void create(Cliente cliente){
        clienteRepository.save(cliente).subscribe();
    }
}
