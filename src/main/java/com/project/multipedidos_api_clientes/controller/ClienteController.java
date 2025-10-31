package com.project.multipedidos_api_clientes.controller;

import com.project.multipedidos_api_clientes.entity.Cliente;
import com.project.multipedidos_api_clientes.entity.Pedido;
import com.project.multipedidos_api_clientes.repository.ClienteRepository;
import com.project.multipedidos_api_clientes.repository.PedidoRepository;
import com.project.multipedidos_api_clientes.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ClienteController {

    private final ClienteRepository clienteRepo;
    private final PedidoRepository pedidoRepo;
    private final PedidoService pedidoService;

    public ClienteController(ClienteRepository clienteRepo, PedidoRepository pedidoRepo, PedidoService pedidoService) {
        this.clienteRepo = clienteRepo;
        this.pedidoRepo = pedidoRepo;
        this.pedidoService = pedidoService;
    }

    @GetMapping("/")
    public String status() {
        return "✅ API de Clientes activa y conectada correctamente.";
    }

    @PostMapping("/clientes")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @GetMapping("/clientes")
    public List<Cliente> listarClientes() {
        return clienteRepo.findAll();
    }

    @PostMapping("/pedidos")
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        pedido.setTotal(pedidoService.calcularTotal(pedido));
        return pedidoRepo.save(pedido);
    }

    @GetMapping("/pedidos")
    public List<Pedido> listarPedidos() {
        return pedidoRepo.findAll();
    }
}