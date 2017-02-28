package com.sidgs.service;

import com.sidgs.dao.ServiceDao;
import com.sidgs.model.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by saimanu.manoj on 23-02-2017.
 */
@org.springframework.stereotype.Service
@Transactional

public class ServiceServiceImpl implements ServiceService {
    @Autowired
    private ServiceDao serviceDao;
    @Override
    public void addService(Service service) {

        serviceDao.addService(service);
    }

    @Override
    public List<Service> getAllServices() {

        return serviceDao.getAllServices();
    }

    @Override
    public void deleteService(int service_Id)
    {
        serviceDao.deleteService(service_Id);
    }

    @Override
    public Service getService(int service_Id)
    {
        return serviceDao.getService(service_Id);
    }

    @Override
    public Service updateService(Service service) {

        return serviceDao.updateService(service);
    }
    public void setServiceDao(ServiceDao serviceDao){
        this.serviceDao = serviceDao;
    }
}
