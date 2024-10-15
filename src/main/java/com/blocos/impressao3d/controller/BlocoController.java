package com.blocos.impressao3d.controller;


import com.blocos.impressao3d.entity.Bloco;
import com.blocos.impressao3d.service.BlocoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bloco")
public class BlocoController {

    @Autowired
    private BlocoService pedidoService;

    @PostMapping
    public ResponseEntity<Bloco> criarPedido(@RequestBody Bloco pedido){
        Bloco novoPedido = pedidoService.criarPedido(pedido);
        return ResponseEntity.ok(novoPedido);
    }

    @GetMapping
    public List<Bloco> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bloco> obterPedidoPorId(@PathVariable Long id) {
        Optional<Bloco> pedido = pedidoService.obterPedidoPorId(id);
        return pedido.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bloco> atualizarPedido(@PathVariable Long id, @RequestBody Bloco novoPedido) {
        Bloco pedidoAtualizado = pedidoService.atualizarPedido(id, novoPedido);
        return pedidoAtualizado != null ? ResponseEntity.ok(pedidoAtualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPedido(@PathVariable Long id) {
        pedidoService.excluirPedido(id);
        return ResponseEntity.noContent().build();
    }
}
