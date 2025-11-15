package com.project.multipedidos_api_clientes.entity;

import jakarta.persistence.*;
import lombok.Data;

//Clase Cliente
@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
}