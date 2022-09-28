package com.example.universe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "moon")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Moon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer moon_id;
    private String name;
    private String discovered_by;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date discovery_date;
    private Integer planet_id;

    public Integer getMoon_id() {
        return moon_id;
    }

    public void setMoon_id(Integer moon_id) {
        this.moon_id = moon_id;
    }

    public Date getDiscovery_date() {
        return discovery_date;
    }

    public void setDiscovery_date(Date discovery_date) {
        this.discovery_date = discovery_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }

    public void setDiscovered_by(String discovered_by) {
        this.discovered_by = discovered_by;
    }

    public Integer getPlanet_id() {
        return planet_id;
    }

    public void setPlanet_id(Integer planet_id) {
        this.planet_id = planet_id;
    }
}
