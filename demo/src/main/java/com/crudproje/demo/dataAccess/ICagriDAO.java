package com.crudproje.demo.dataAccess;

import com.crudproje.demo.entities.Cagri;

import java.util.List;

public interface ICagriDAO {
    void add(Cagri cagri);
    Cagri getByteId(int id);
    void deleteById(int id);
    void updateCagri(Cagri cagri);
    List<Cagri> getAll();
    void updateMany();
}
