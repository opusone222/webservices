package com.sidgs.dao;

import com.sidgs.model.Service;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by saimanu.manoj on 23-02-2017.
 */
@Repository
public class ServiceDaoImpl implements ServiceDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addService(Service service) {
        sessionFactory.getCurrentSession().saveOrUpdate(service);
    }

    @Override
    public List<Service> getAllServices() {
        return sessionFactory.getCurrentSession().createQuery("from Product").list();
    }

    @Override
    public void deleteService(int service_Id) {

        Service service = (Service) sessionFactory.getCurrentSession().load(Service.class, service_Id);

        if (null != service){
            this.sessionFactory.getCurrentSession().delete(service);
        }
    }

    @Override
    public Service updateService(Service service) {
        sessionFactory.getCurrentSession().update(service);
        return service;
    }

    @Override
    public Service getService(int service_Id) {
        return (Service) sessionFactory.getCurrentSession().get(Service.class, service_Id);
    }
}
