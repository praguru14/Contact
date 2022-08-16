package com.pg.manager.contract.models;

import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="CONTACT")
public class ContactDetailModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String cName;
    private String sNAme;
    private String work;
    @Column(unique = true)
    private String email;
    private String phone;
    private String imageUrl;
    @Column(length = 1000)
    private String description;
    @ManyToOne
    private UserModel user;
}
