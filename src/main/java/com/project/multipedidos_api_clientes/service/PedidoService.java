package com.project.multipedidos_api_clientes.service;

import com.multipedidos.OperacionesNegocio;
import com.project.multipedidos_api_clientes.entity.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    public double calcularTotal(Pedido pedido) {
        double totalConIva = OperacionesNegocio.calcularTotalConIVA(pedido.getSubtotal());
        return OperacionesNegocio.aplicarDescuento(totalConIva, 5);
    }
}