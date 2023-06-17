package com.cabManagement.cabs.entity;

import jakarta.persistence.*;


@Entity
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long id;

    @Column(name = "role_name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
