package com.company.books.backend.services;

import com.company.books.backend.dao.CategoriaDAO;
import com.company.books.backend.models.Categoria;
import com.company.books.backend.response.CategoriaResponse;
import com.company.books.backend.response.CategoriaResponseRest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

    private static final Logger log = LoggerFactory.getLogger(CategoriaServiceImpl.class);

    @Autowired
    private CategoriaDAO categoriaDAO;
    @Override
    @Transactional(readOnly = true)
    public CategoriaResponseRest buscarCategorias() {
        log.info("Inicio Metodo buscarCategorias()");
        CategoriaResponseRest responseRest = new CategoriaResponseRest();
        try{
            List<Categoria> categorias = (List<Categoria>) categoriaDAO.findAll();
            responseRest.setCategoriaResponse((CategoriaResponse) categorias);
            responseRest.setMetadata("Respuesta Ok","200","Respuesta exitosa");
        }catch (Exception e){
            responseRest.setMetadata("Respuesta No OK","-1","Respuesta oncorrecta");
            log.error("Error al consultar categorias :", e.getMessage());
            e.getStackTrace();
        }
        return responseRest;
    }
}
