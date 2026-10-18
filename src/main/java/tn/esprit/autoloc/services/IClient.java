package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entites.Client;

import java.util.List;

public interface IClient {

    Client updateClient(Client client);

    void deleteClient(Long id);

    Client addClient(Client client);

    List<Client> getAllClients();

    Client getClientById(Long id);
}