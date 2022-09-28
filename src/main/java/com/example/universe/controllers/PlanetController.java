package com.example.universe.controllers;

import com.example.universe.models.Planet;
import com.example.universe.repositories.PlanetRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/planet")
public class PlanetController {
    @Autowired
    private PlanetRepository planetRepository;

    @GetMapping
    public List<Planet> list() {
        return planetRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Planet get(@PathVariable Integer id) {
        return planetRepository.getReferenceById(id);
    }

    @PostMapping
    public Planet create(@RequestBody final Planet planet) {
        return planetRepository.saveAndFlush(planet);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        planetRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Planet update(@PathVariable Integer id, @RequestBody Planet planet) {
        Planet existingPlanet = planetRepository.getReferenceById(id);
        BeanUtils.copyProperties(planet, existingPlanet, "planet_id");
        return planetRepository.saveAndFlush(existingPlanet);
    }
}
