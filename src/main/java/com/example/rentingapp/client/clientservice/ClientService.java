package com.example.rentingapp.client.clientservice;

import com.example.rentingapp.client.clientmodel.ClientModel;
import com.example.rentingapp.client.clientrepo.ClientRepo;
import com.example.rentingapp.exeption.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepo clientRepo;

    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }
    public void addClient(ClientModel clientModel){
        if(clientRepo.findByEmail(clientModel.getEmail())!=null){
            throw new ResourceNotFoundException("Client with email "+clientModel.getEmail()+" already exists");
        }
        clientRepo.save(clientModel);
    }
    public void deleteClient(Long id){
        clientRepo.deleteById(id);
    }
    public List<ClientModel> getAllClients(){
        return clientRepo.findAll();
    }
    public void updateClient(Long id, ClientModel clientModel){
        ClientModel clientModel1 = clientRepo.getById(id);
        clientModel1.setName(clientModel.getName());
        clientModel1.setLastName(clientModel.getLastName());
        clientModel1.setEmail(clientModel.getEmail());
        clientModel1.setPassword(clientModel.getPassword());
        clientModel1.setCity(clientModel.getCity());
        clientModel1.setCountry(clientModel.getCountry());

        clientModel1.setRole(clientModel.getRole());
    //    clientModel1.setCars(clientModel.getCars());
        clientRepo.save(clientModel1);
    }
    public ClientModel getClientById(Long id){
        ClientModel clientModel = clientRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Client with id "+id+" does not exist"));
        return clientModel;
    }
    public ClientModel getClientByEmail(String email){
        return clientRepo.findByEmail(email);
    }

}
