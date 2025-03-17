package com.example.rentingapp.client.clientrepo;

import com.example.rentingapp.client.clientmodel.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<ClientModel,Long> {
    ClientModel findByEmail(String email);
}
