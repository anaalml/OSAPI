/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.anaalml.eti.OSApplication.api.controller;

import br.anaalml.eti.OSApplication.domain.service.ClienteService;
import br.anaalml.eti.OSApplication.domain.model.Cliente;
import br.anaalml.eti.OSApplication.domain.repository.ClienteRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aluno
 */
@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;
    
    @Autowired
    private ClienteService clienteService;
    


    @GetMapping("/clientes")
        @Operation(summary = "Lista os produtos pelo ID", description = "Retorna cada produto com base no seu proprio ID")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully retrieved"), 
        @ApiResponse(responseCode = "404", description = "Not found - Não foi encontrado")
 })
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }
    
    @GetMapping("/clientes/{clienteID}")
    @Parameter(name = "id", description = "Product id", example = "1")
    @Operation(summary = "Lista os clientes pelo ID", description = "Retorna cada cliente com base no seu proprio ID")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully retrieved"), 
        @ApiResponse(responseCode = "404", description = "Not found - Não foi encontrado")
 })
    public ResponseEntity<Cliente> buscar (@PathVariable Long ClienteID) {
        Optional<Cliente> cliente = clienteRepository.findById(ClienteID);

        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente.get());

        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@Valid @RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }
    
    @PutMapping("/clientes/{clienteID}") 
    public ResponseEntity<Cliente> atualizar(@Valid @PathVariable Long clienteID,
            @RequestBody Cliente cliente){
        if(!clienteRepository.existsById(clienteID)){
            return ResponseEntity.notFound().build();
            
        }
        cliente.setId(clienteID);
        cliente = clienteService.salvar(cliente);
        return ResponseEntity.ok(cliente);
    }
    
    @DeleteMapping("/clientes/{clienteID}")
    public ResponseEntity<Cliente> excluir(@PathVariable Long clienteID) {
        
        
        if(!clienteRepository.existsById(clienteID)){
            return ResponseEntity.notFound().build();
            
        }
       
       clienteService.excluir(clienteID);
        return ResponseEntity.noContent().build();
    }
    
    

}
