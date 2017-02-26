package com.sidgs.com.sidgs.controller;

import com.sidgs.com.sidgs.service.ProductService;
import com.sidgs.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Vytlasai on 2/23/2017.
 */
public class ProductController {

    private static final Logger logger = Logger.getLogger(String.valueOf(ProductController.class));

    public ProductController(){
        System.out.println("ProductController()");
    }

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/")
    public ModelAndView listProduct(ModelAndView model) throws IOException {
        List<Product> listProduct = productService.getAllProducts();
        model.addObject("listProduct", listProduct);
        model.setViewName("home");
        return model;
    }
}


