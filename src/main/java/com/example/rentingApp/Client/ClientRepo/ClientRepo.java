package com.example.rentingApp.Client.ClientRepo;

import com.example.rentingApp.Client.ClientModel.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<ClientModel,Long> {
    ClientModel findByEmail(String email);
}
