package com.example.universe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "planet")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer planet_id;
    private String name;
    private Integer num_moons;
    private Boolean has_rings;
    private Integer star_id;

    public Integer getPlanet_id() {
        return planet_id;
    }

    public void setPlanet_id(Integer planet_id) {
        this.planet_id = planet_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum_moons() {
        return num_moons;
    }

    public void setNum_moons(Integer num_moons) {
        this.num_moons = num_moons;
    }

    public Boolean getHas_rings() {
        return has_rings;
    }

    public void setHas_rings(Boolean has_rings) {
        this.has_rings = has_rings;
    }

    public Integer getStar_id() {
        return star_id;
    }

    public void setStar_id(Integer star_id) {
        this.star_id = star_id;
    }
}
