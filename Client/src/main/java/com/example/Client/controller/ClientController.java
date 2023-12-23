package com.example.Client.controller;

import com.example.Client.entities.Client;
import com.example.Client.repositories.ClientRepository;
import com.example.Client.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @GetMapping("/{id}")
    public Client findById(Long id) throws Exception {
        return clientService.findById(id);
    }

    @PostMapping
    public void addClient(Client client) {
        clientService.addClient(client);
    }

         }
