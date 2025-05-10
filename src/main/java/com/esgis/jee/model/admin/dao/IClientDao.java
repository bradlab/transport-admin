package com.esgis.jee.model.admin.dao;

import com.esgis.jee.model.admin.entity.Client;
import java.util.List;

public interface IClientDao {
    void create(Client client);
    Client find(Integer id);
    void update(Client client);
    void delete(Client client);
    List<Client> findAll();
}
