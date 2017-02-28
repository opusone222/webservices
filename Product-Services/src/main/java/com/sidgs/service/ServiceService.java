package com.sidgs.service;

import com.sidgs.model.Service;

import java.util.List;

/**
 * Created by saimanu.manoj on 23-02-2017.
 */
public interface ServiceService {
    public void addService(Service service);
    public List<Service> getAllServices();
    public void deleteService(int service_Id);
    public Service getService(int service_Id);
    public Service updateService(Service service);

}
