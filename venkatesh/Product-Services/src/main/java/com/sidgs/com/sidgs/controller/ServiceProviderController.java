package com.sidgs.com.sidgs.controller;

import com.sidgs.com.sidgs.service.ProductService;
import com.sidgs.com.sidgs.service.ServiceProvider;
import com.sidgs.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by vens on 2/25/2017.
 */
public class ServiceProviderController {
    private static final Logger logger = Logger.getLogger(String.valueOf(ServiceProviderController.class));

    public ServiceProviderController() {
        System.out.println("ServiceProviderController()");
    }


    @Autowired
    private ServiceProvider ServiceProvider;

    @RequestMapping(value = "/")
    public ModelAndView listServiceProvider(ModelAndView model) throws IOException {
        List<ServiceProvider> listServiceProvider = ServiceProvider.getAllServiceProviders();
        model.addObject("listServiceProvider", listServiceProvider);
        model.setViewName("home");
        return model;
    }
}
