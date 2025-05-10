package com.esgis.jee.model.admin.service;

import com.esgis.jee.model.admin.dao.ClientDao;
import com.esgis.jee.model.admin.entity.Client;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.util.List;

@Stateless
public class ClientService implements IClientService {
    @Inject
    private ClientDao clientDao;

    public void create(Client client) {
        clientDao.create(client);
    }

    public Client find(Integer id) {
        return clientDao.find(id);
    }

    public void update(Client client) {
        clientDao.update(client);
    }

    public void delete(Client client) {
        clientDao.delete(client);
    }

    public List<Client> findAll() {
        return clientDao.findAll();
    }
}
