package com.example.cabecerashttppractica2.service.impl;

import com.example.cabecerashttppractica2.model.Producto;
import com.example.cabecerashttppractica2.service.ProductService;

import java.util.*;

public class ProductServiceImpl implements ProductService {
    private  List<Producto> products = new ArrayList<>();
    @Override
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L, "notebook", "computacion", 175000),
                new Producto(2L, "mesa escritorio", "oficina", 100000),
                new Producto(3L, "teclado mecanico", "computacion", 40000));

    }

    /*private static Map<Long, String> products = new HashMap<Long, String>();*/


    /*static {
        products.add(new Producto(1L,"notebook", "computacion", 175000 ));
        products.add(new Producto(2L, "mesa escritorio", "oficina", 100000));
        products.add(new Producto(3L, "teclado mecanico", "computacion", 40000));
    }*/

    public Producto getProductById(long id) {
        products = listar();
        return products.stream()
                .filter(p->p.getId()==id)
                .findFirst()
                .orElse(null);

    }
}

    /*public Boolean validateExistence(Long id){
        products = listar();
        return  products.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .isPresent();
    }*/

