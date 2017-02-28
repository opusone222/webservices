package com.sidgs.controller;

import com.sidgs.service.ServiceService;
import com.sidgs.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import org.jboss.logging.Logger;
//import java.util.logging.Logger;

/**
 * Created by saimanu.manoj on 23-02-2017.
 */
@Controller
public class ServiceController {


    private static final Logger logger = Logger.getLogger(ServiceController.class);

    public ServiceController(){
        System.out.println("ServiceController");
    }

    @Autowired
    private ServiceService serviceService;
    //@RequestMapping(value="/")
    //public ModelAndView

    @RequestMapping(value = "/service" )
    public ModelAndView listServices(ModelAndView model) throws IOException {
        List<Service> listService = serviceService.getAllServices();
        model.addObject("listServices", listService);
        model.setViewName("serviceHome");
        return model;
    }

    @RequestMapping(value = "/newService", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
        Service service = new Service();
        model.addObject("service", service);
        model.setViewName("ServiceForm");
        return model;
    }

    @RequestMapping(value = "/saveService", method = RequestMethod.POST)
    public ModelAndView saveService(@ModelAttribute Service service) {
        if (service.getService_id() == 0) { // if service id is 0 then creating the
            // service other updating the service

            serviceService.addService(service);
        } else {
            serviceService.updateService(service);
        }
        return new ModelAndView("redirect:/service");
    }

    @RequestMapping(value = "/deleteService", method = RequestMethod.GET)
    public ModelAndView deleteService(HttpServletRequest request) {
        int serviceId = Integer.parseInt(request.getParameter("service_Id"));
        serviceService.deleteService(serviceId);
        return new ModelAndView("redirect:/service");
    }

    @RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        int service_Id = Integer.parseInt(request.getParameter("service_Id"));
        Service service = serviceService.getService(service_Id);
        ModelAndView model = new ModelAndView("ServiceForm");
        model.addObject("service", service);

        return model;
    }


}
