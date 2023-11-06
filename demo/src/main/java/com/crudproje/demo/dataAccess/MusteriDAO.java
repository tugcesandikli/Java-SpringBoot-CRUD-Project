package com.crudproje.demo.dataAccess;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MusteriDAO {
    private EntityManager entityManager;

    @Autowired
    public MusteriDAO(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }
}
