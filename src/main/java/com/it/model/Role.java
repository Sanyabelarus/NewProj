package com.it.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Class for the entity Role. It's roles table in database
 */
@Entity
@Table
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "role")
    private Set<User> user;

    private String roleName;

    public Role(Integer id, Set<User> user, String roleName) {
        this.id = id;
        this.user = user;
        this.roleName = roleName;
    }

    public Role() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

}
