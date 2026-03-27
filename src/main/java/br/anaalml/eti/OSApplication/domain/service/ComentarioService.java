/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.anaalml.eti.OSApplication.domain.service;

import br.anaalml.eti.OSApplication.domain.dto.ComentarioDTO;
import br.anaalml.eti.OSApplication.domain.exception.DomainException;
import br.anaalml.eti.OSApplication.domain.model.Comentario;
import br.anaalml.eti.OSApplication.domain.model.OrdemServico;
import br.anaalml.eti.OSApplication.domain.repository.ComentarioRepository;
import br.anaalml.eti.OSApplication.domain.repository.OrdemServicoRepository;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesi3dia
 */
//@Service
public class ComentarioService {
//    
//    @Autowired 
//    private OrdemServicoRepository ordemServicoRepository;
//
//    @Autowired
//    private ComentarioRepository comentarioRepository;
//    
//    public Comentario salvar(ComentarioDTO comentarioDTO){
//        
//        Optional<OrdemServico> optOrdemServico = ordemServicoRepository.findById(
//                comentarioDTO.ordemServicoId());
//
//        if (optOrdemServico.isEmpty()) {
//            throw new DomainException("Ordem de Servico não existe");
//            
//        }
//        '''''''''''''Comentario comentario = new Comentario();
//        comentario.setDescricao(comentarioDTO.descricao);
//        comentario.setDataEnvio(LocalDateTime.now());
//        comentario.setOrdemServico(optOrdemServico.get());
//        return comentarioRepository.save(comentario);
//        
//    }
//    
//    public void excluir(Long clienteId) {
//        comentarioRepository.deleteById(clienteId);
//    }
}
    

