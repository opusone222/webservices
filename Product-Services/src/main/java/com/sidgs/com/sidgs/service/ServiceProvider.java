package com.sidgs.com.sidgs.service;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.List;

/**
 * Created by vens on 2/23/2017.
 */
public interface ServiceProvider {

    public void addserviceprovider(ServiceProvider serviceprovider);

    public List<ServiceProvider> getAllServiceProviders();

    public void deleteServiceProvider(Integer serviceproviderId);

    public ServiceProvider getServiceProvider(int serviceproviderId);

    public ServiceProvider updateServiceProvider(ServiceProvider serviceprovider);
}
