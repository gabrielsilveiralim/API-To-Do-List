package br.com.gabriellima.jav.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/primeiraRota")
// https://localhost:8080/primeiraRota ----

public class PrimeiroController {
    
    /**
     *  GET - buscar informação
     *  POST - adiciona um dado
     *  PUT - altera um dado
     *  DELETE - remove um dado
     *  PATCH - alterar somente uma parte do dado
     * 
    */
    @GetMapping("/")
    public String primeiraMensagem() {
            return "Bem vindo ao Cabaré";
    }
}
