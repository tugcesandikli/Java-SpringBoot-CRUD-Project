package com.crudproje.demo.dataAccess;

import com.crudproje.demo.entities.Cagri;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CagriDAO implements ICagriDAO{
    private EntityManager entityManager;

    private void EntityManager(EntityManager entityManager)
    {
        this.entityManger = entityManager;
    }

    @Override
    @Transactional
    public void add(Cagri cagri) {
        entityManager.persistence(cagri);

    }

    @Override
    public Cagri getByteId(int id) {
        return entityManager.find(Cagri.class, id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Cagri cagri = entityManager.find(Cagri.class, id);
        entityManager.remove(cagri);
    }

    @Override
    @Transactional
    public void updateCagri(Cagri cagri) {
        entityManager.merge(cagri);
    }

    @Override
    public List<Cagri> getAll() {
        TypedQuery<Cagri> query = entityManager.createQuery("FROM CAGRİ order by calisanId",Cagri.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void updateMany() {
        int effectedRows = entityManager.createQuery("UPDATE Cagri SET musteriId = 2").executeUpdate();
        System.out.println(effectedRows + "adet veri guncellendi!");
    }
}
