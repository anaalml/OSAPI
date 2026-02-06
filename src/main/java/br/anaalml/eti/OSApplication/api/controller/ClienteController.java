/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.anaalml.eti.OSApplication.api.controller;

import br.anaalml.eti.OSApplication.domain.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aluno
 */
@RestController
public class ClienteController {
    
    @GetMapping("/clientes")
    public List<Cliente> listas(){
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1, "Ana Luiza", "ana.alml@teste.com", "11-95473-3244"));
        listaClientes.add(new Cliente(1, "Bruno Miranda", "bruninho@teste.com", "11-96732-4523"));
        listaClientes.add(new Cliente(1, "Mariana Mel", "mariana_ana@teste.com", "11-9763-9933"));
        
        return listaClientes;
    }
    
}
