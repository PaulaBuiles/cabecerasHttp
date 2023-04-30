package com.example.cabecerashttppractica2.service;

import com.example.cabecerashttppractica2.model.Producto;

import java.util.List;

public interface ProductService {
     List<Producto> listar();
     Producto getProductById(long id);
}

