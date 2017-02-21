package com.sidgs.controller;

import com.sidgs.dao.ProductsDao;
import com.sidgs.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;

/**
 * Created by Vytlasai on 2/20/2017.
 */
public class Controller {

    @Autowired
    private ProductsDao productsDao;

    @RequestMapping(value = "/")
    public ModelAndView getProducts(ModelAndView model) throws IOException{
        List<Products> getProducts =  productsDao.getProducts();
        model.addObject("getProducts", getProducts);
        model.setViewName("home");

        return  model;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView add (@ModelAttribute Products products){
        productsDao.add(products);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public ModelAndView remove(HttpServletRequest request){
        int product_id = Integer.parseInt(request.getParameter("id"));
        productsDao.remove(product_id);
        return  new ModelAndView("redirect:/");
    }

    @RequestMapping(value="/id", method = RequestMethod.GET)
    public ModelAndView getProduct (HttpServletRequest request){
        int product_id = Integer.parseInt(request.getParameter("id"));
        Products products = productsDao.getProduct(product_id);
        ModelAndView model = new ModelAndView("product");
        model.addObject("getProducts", products );
        return model;
    }
}
