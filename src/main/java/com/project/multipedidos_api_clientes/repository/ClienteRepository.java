package com.project.multipedidos_api_clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.multipedidos_api_clientes.entity.Cliente;

//Repository de Clientes
public interface ClienteRepository extends JpaRepository<Cliente, Long> {}