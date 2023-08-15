package com.company.books.backend.response;

import com.company.books.backend.models.Categoria;

import java.util.List;

public class CategoriaResponse {

    private List<Categoria> categorias;


    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}
