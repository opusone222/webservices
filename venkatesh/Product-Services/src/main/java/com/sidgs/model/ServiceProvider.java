package com.sidgs.model;



import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by vens on 2/23/2017.
 */
@Entity
@Table(name ="serviceprovider")
public class ServiceProvider implements Serializable {

    private static final long serialVersionUID = -3453356565566655L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column
    private String serviceprovider_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceprovider_name() {
        return serviceprovider_name;
    }

    public void setServiceprovider_name(String serviceprovider_name) {
        this.serviceprovider_name = serviceprovider_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceProvider that = (ServiceProvider) o;

        if (id != that.id) return false;
        return serviceprovider_name != null ? serviceprovider_name.equals(that.serviceprovider_name) : that.serviceprovider_name == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (serviceprovider_name != null ? serviceprovider_name.hashCode() : 0);
        return result;
    }
}






