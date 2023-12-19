package br.william.testedevbackend.services;

import br.william.testedevbackend.dtos.ClientDto;
import br.william.testedevbackend.entities.Client;
import br.william.testedevbackend.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientDto> searchAll(){
        List<Client> list = clientRepository.findAll();
        return list.stream().map(ClientDto::new).collect(Collectors.toList());
    }

    public ClientDto searchById(Long id){
        Optional<Client> object = clientRepository.findById(id);
        Client entity = object.get();
        return new ClientDto(entity);
    }
}
