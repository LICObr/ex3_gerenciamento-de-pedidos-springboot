package com.example.ex3.ex3.service;

import com.example.ex3.ex3.entity.Pedidos;
import com.example.ex3.ex3.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidosService {

    @Autowired
    private PedidosService PedidosRepository;

    public List<Pedidos> findAll() {
        return PedidosRepository.findAll();
    }

    public Pedidos save(Pedidos pedido) {
        return PedidosRepository.save(pedido);
    }

    public void delete(Long id) {
        PedidosRepository.deleteById(id);
    }

    public Optional<Pedidos> findById(Long id) {
        return PedidosRepository.findById(id);
    }

    public Pedidos atualizar(Long id, Pedidos pedido) {
        pedido.setId(id);
        return PedidosRepository.save(pedido);
    }
}

