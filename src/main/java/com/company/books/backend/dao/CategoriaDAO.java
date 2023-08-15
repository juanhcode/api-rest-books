package com.company.books.backend.dao;

import com.company.books.backend.models.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDAO extends CrudRepository<Categoria,Long> {

}
