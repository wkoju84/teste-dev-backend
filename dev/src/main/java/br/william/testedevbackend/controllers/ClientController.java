package br.william.testedevbackend.controllers;

import br.william.testedevbackend.dtos.ClientDto;
import br.william.testedevbackend.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping
    public ResponseEntity<List<ClientDto>> searchAllCustomers(){
        List<ClientDto> list = clientService.searchAll();
        return ResponseEntity.ok().body(list);
    }
}
