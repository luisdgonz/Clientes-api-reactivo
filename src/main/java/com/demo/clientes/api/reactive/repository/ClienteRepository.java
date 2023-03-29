package com.demo.clientes.api.reactive.repository;

import com.demo.clientes.api.reactive.model.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, Integer> {
}
