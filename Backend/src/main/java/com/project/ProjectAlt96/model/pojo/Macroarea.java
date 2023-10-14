package com.project.ProjectAlt96.model.pojo;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "macroarea")
@Component
public class Macroarea {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user")
    private Users user;

    public Macroarea() {
    }

    public Macroarea(String name, Users user) {
        this.name = name;
        this.user = user;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users Users) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Macroarea{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}
