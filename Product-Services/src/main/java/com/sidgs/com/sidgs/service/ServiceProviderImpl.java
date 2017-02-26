package com.sidgs.com.sidgs.service;

import com.sidgs.dao.ServiceProviderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by vens on 2/23/2017.
 */
public class ServiceProviderImpl implements ServiceProvider {
    @Autowired
    private ServiceProviderDao serviceproviderDao;
    @Override
    @Transactional
    public void addserviceprovider(ServiceProvider serviceprovider) {
        serviceproviderDao.addserviceprovider(serviceprovider);

    }

    @Override
    @Transactional
    public List<ServiceProvider> getAllServiceProviders() {

        return serviceproviderDao.getAllServiceProviders();
    }

    @Override
    public void deleteServiceProvider(Integer serviceproviderId) {
        serviceproviderDao.deleteServiceProvider(serviceproviderId);

    }

    @Override
    public ServiceProvider getServiceProvider(int serviceproviderId) {
        return serviceproviderDao.getServiceProvider(serviceproviderId);
    }

    @Override
    public ServiceProvider updateServiceProvider(ServiceProvider serviceprovider) {
        return serviceprovider.updateServiceProvider(serviceprovider);
    }
    public void setServiceProviderDao(ServiceProviderDao servieproviderDao){
        this.serviceproviderDao = servieproviderDao;
    }
}
