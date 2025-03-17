package com.example.rentingapp.client.clientcontroller;

import com.example.rentingapp.client.clientmodel.ClientModel;
import com.example.rentingapp.client.clientservice.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/getClient")
    public List<ClientModel> getAllClients(){
        return clientService.getAllClients();
    }

    @PostMapping("/addClient")
    public void addClient(@RequestBody ClientModel clientModel){
        clientService.addClient(clientModel);
    }
    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
    }
    @PutMapping("/updateClient/{id}")
    public void updateClient(@PathVariable Long id, @RequestBody ClientModel clientModel){
        clientService.updateClient(id, clientModel);
    }
}
