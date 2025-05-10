package com.esgis.jee.model.admin.controller;

import com.esgis.jee.model.admin.entity.Client;
import com.esgis.jee.model.admin.service.IClientService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Named
@SessionScoped
public class ClientController implements Serializable {
    private Client client;
    private List<Client> clients;

    @Inject
    private IClientService clientService;

    @PostConstruct
    public void init() {
        client = new Client();
        clients = clientService.findAll();
    }

    public void createClient() {
        client.setDateEnregistrement(new Date());
        clientService.create(client);
        clients = clientService.findAll();
        client = new Client();
    }

    public void updateClient() {
        clientService.update(client);
        clients = clientService.findAll();
    }

    public void deleteClient(Client clientToDelete) {
        clientService.delete(clientToDelete);
        clients = clientService.findAll();
    }

    public List<Client> getClients() {
        return clients;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Vérifie si l'utilisateur connecté a le rôle ADMIN
    public boolean isAdmin() {
        return jakarta.faces.context.FacesContext.getCurrentInstance()
            .getExternalContext().isUserInRole("ADMIN");
    }
}
