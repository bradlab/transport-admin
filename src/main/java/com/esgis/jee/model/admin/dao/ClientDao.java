package com.esgis.jee.model.admin.dao;

import com.esgis.jee.model.admin.entity.Client;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ClientDao implements IClientDao {
    @PersistenceContext(unitName = "transportPU")
    private EntityManager em;

    public void create(Client client) {
        em.persist(client);
    }

    public Client find(Integer id) {
        return em.find(Client.class, id);
    }

    public void update(Client client) {
        em.merge(client);
    }

    public void delete(Client client) {
        em.remove(em.merge(client));
    }

    public List<Client> findAll() {
        return em.createQuery("SELECT c FROM Client c", Client.class).getResultList();
    }
}
