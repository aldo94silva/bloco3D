package com.blocos.impressao3d.service;


import com.blocos.impressao3d.entity.Pedido;
import com.blocos.impressao3d.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido criarPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
    public List<Pedido> listarPedidos(){
        return pedidoRepository.findAll();
    }
    public Optional<Pedido> obterPedidoPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public Pedido atualizarPedido(Long id, Pedido novoPedido) {
        return pedidoRepository.findById(id)
                .map(pedido -> {
                    pedido.setAndares(novoPedido.getAndares());
                    pedido.setCor1(novoPedido.getCor1());
                    pedido.setCor2(novoPedido.getCor2());
                    pedido.setCor3(novoPedido.getCor3());
                    pedido.setDesenho1(novoPedido.getDesenho1());
                    pedido.setDesenho2(novoPedido.getDesenho2());
                    pedido.setDesenho3(novoPedido.getDesenho3());
                    return pedidoRepository.save(pedido);
                }).orElse(null);
    }

    public void excluirPedido(Long id) {
        pedidoRepository.deleteById(id);
    }

}
