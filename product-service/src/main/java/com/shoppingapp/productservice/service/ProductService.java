package com.shoppingapp.productservice.service;

import org.springframework.stereotype.Service;

import com.shoppingapp.productservice.dto.ProductRequest;
import com.shoppingapp.productservice.model.Product;

//serviciu la care vom apela de fiecare data cand accesam un produs
@Service
public class ProductService {
    //cream un produs care preia cererea de produs
    public void createProduct(ProductRequest productRequest){
        //mapam cererea de produs catre modelul de produs, deci pentru asta cream var de tip produs
        Product product = Product.builder()
        .name(productRequest.getName())
        .description(productRequest.getDescription())
        .price(productRequest.getPrice())
        .build();

        

    }
}
