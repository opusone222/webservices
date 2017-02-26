package com.sidgs.dao;

import com.sidgs.com.sidgs.service.ServiceProvider;

import java.util.List;

/**
 * Created by vens on 2/23/2017.
 */
public interface ServiceProviderDao {


    public  void addserviceprovider(ServiceProvider serviceprovider);

    public List<ServiceProvider> getAllServiceProviders();

    public  void deleteServiceProvider(Integer serviceproviderId);

    public ServiceProvider getServiceProvider(int serviceproviderId);

    public ServiceProvider updateServiceProvider(ServiceProvider serviceprovider);
}
