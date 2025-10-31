package com.project.multipedidos_api_clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.multipedidos_api_clientes.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {}