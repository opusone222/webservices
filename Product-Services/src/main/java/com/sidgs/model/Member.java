package com.sidgs.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Shylaja on 2/23/2017.
 */

@Entity
@Table(name ="member")
public class Member implements Serializable {

    private static final long serialVersionUID = -3453356565566655L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String email;

    @Column
    private String gender;

    @Column
    private  String tele_phone;

    @Column
    private String userid;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTele_phone() {
        return tele_phone;
    }

    public void setTele_phone(String tele_phone) {
        this.tele_phone = tele_phone;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }



}