package com.esgis.jee.model.admin.service;

import com.esgis.jee.model.admin.entity.Client;
import java.util.List;

public interface IClientService {
    void create(Client client);
    Client find(Integer id);
    void update(Client client);
    void delete(Client client);
    List<Client> findAll();
}
