package com.pg.manager.contract.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="USER")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String role;
    private String imageUrl;
    private String about;
    private boolean enabled;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<ContactDetailModel> contacts;
}
