package com.example.cabecerashttppractica2.service;

import com.example.cabecerashttppractica2.model.Producto;
import com.example.cabecerashttppractica2.service.impl.ProductoServiceImpl;

import java.util.Arrays;
import java.util.List;

public class ProductoService implements ProductoServiceImpl {
    @Override
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L, "notebook", "computacion", 175000),
                new Producto(2L, "mesa escritorio", "oficina", 100000),
                new Producto(3L, "teclado mecanico", "computacion", 40000));

    }
}
