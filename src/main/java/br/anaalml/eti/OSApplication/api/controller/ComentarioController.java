/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.anaalml.eti.OSApplication.api.controller;

import br.anaalml.eti.OSApplication.domain.model.Cliente;
import br.anaalml.eti.OSApplication.domain.model.Comentario;
import br.anaalml.eti.OSApplication.domain.repository.ComentarioRepository;
import br.anaalml.eti.OSApplication.domain.service.ComentarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesi3dia
 */
//@RestController
//@RequestMapping("/comentario")
public class ComentarioController {
//
//    @Autowired
//    private ComentarioRepository comentarioRepository;
//
//    @Autowired
//    private ComentarioService comentarioService;
//
//    public List<Comentario> listar() {
//        return comentarioRepository.findAll();
//    }
//
//    @GetMapping("{clienteID}")
//    public ResponseEntity<Comentario> buscar(@PathVariable Long ClienteID) {
//        Optional<Comentario> comentario = comentarioRepository.findById(ClienteID);
//
//        if (comentario.isPresent()) {
//            return ResponseEntity.ok(comentario.get());
//
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

//    @PostMapping("/clientes")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Cliente adicionar(@Valid @RequestBody Cliente cliente) {
//        return clienteService.salvar(cliente);
//    }

//    @PutMapping("{comentarioID}")
//    public ResponseEntity<Cliente> atualizar(@Valid @PathVariable Long clienteID,
//            @RequestBody Cliente cliente) {
//        if (!clienteRepository.existsById(clienteID)) {
//            return ResponseEntity.notFound().build();
//
//        }
//        cliente.setId(clienteID);
//        cliente = clienteService.salvar(cliente);
//        return ResponseEntity.ok(cliente);
//    }

//    @DeleteMapping("{clienteID}")
//    public ResponseEntity<Cliente> excluir(@PathVariable Long clienteID) {
//
//        if (!clienteRepository.existsById(clienteID)) {
//            return ResponseEntity.notFound().build();
//
//        }
//
//        clienteService.excluir(clienteID);
//        return ResponseEntity.noContent().build();
//    }

}
