package com.sidgs.dao;

import com.sidgs.com.sidgs.service.ServiceProvider;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by vens on 2/23/2017.
 */
public class ServiceProviderDaoImpl implements ServiceProviderDao {

    @Autowired
    private static SessionFactory sessionFactory;

    @Override
    public void addserviceprovider(ServiceProvider serviceprovider) {
        sessionFactory.getCurrentSession().saveOrUpdate(serviceprovider);
    }

    @Override
    public List<ServiceProvider> getAllServiceProviders() {
        return sessionFactory.getCurrentSession().createQuery("from Product").list();
    }

    @Override
    public void deleteServiceProvider(Integer ServiceProviderId) {
        ServiceProvider serviceprovider = (ServiceProvider) sessionFactory.getCurrentSession().load(ServiceProvider.class,ServiceProviderId);
        if (null != serviceprovider){
            this.sessionFactory.getCurrentSession().delete(serviceprovider);
        }

    }

    @Override
    public ServiceProvider getServiceProvider(int serviceproviderId) {
        return (ServiceProvider)sessionFactory.getCurrentSession().get(ServiceProvider.class, serviceproviderId);
    }

    @Override
    public ServiceProvider updateServiceProvider(ServiceProvider serviceprovider) {
        sessionFactory.getCurrentSession().update(serviceprovider);
        return serviceprovider;
    }
}
