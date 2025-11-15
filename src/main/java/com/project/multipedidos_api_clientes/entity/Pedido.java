package com.project.multipedidos_api_clientes.entity;

import jakarta.persistence.*;
import lombok.Data;

//Clase Pedido
@Data
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long clienteId;
    private double subtotal;
    private double total;
}