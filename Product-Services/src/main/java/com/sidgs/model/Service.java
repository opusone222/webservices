package com.sidgs.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saimanu.manoj on 23-02-2017.
 */
@Entity
@Table(name = "services")
public class Service implements Serializable {

    private static final long serialVersionUID = -3465813074586302847L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int service_Id;

    public int getService_id() {
        return service_Id;
    }

    public void setService_id(int service_Id) {
        this.service_Id = service_Id;
    }

    @Column

    private String service_name;

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service service = (Service) o;

        if (service_Id != service.service_Id) return false;
        return service_name != null ? service_name.equals(service.service_name) : service.service_name == null;
    }

    @Override
    public int hashCode() {
        int result = service_Id;
        result = 31 * result + (service_name != null ? service_name.hashCode() : 0);
        return result;
    }
}
