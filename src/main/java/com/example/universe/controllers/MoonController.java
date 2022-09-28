package com.example.universe.controllers;

import com.example.universe.models.Moon;
import com.example.universe.repositories.MoonRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moon")
public class MoonController {
    @Autowired
    private MoonRepository moonRepository;

    @GetMapping
    public List<Moon> list() {
        return moonRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Moon get(@PathVariable Integer id) {
        return moonRepository.getReferenceById(id);
    }

    @PostMapping
    public Moon create(@RequestBody final Moon moon) {
        return moonRepository.saveAndFlush(moon);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        moonRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Moon update(@PathVariable Integer id, @RequestBody Moon moon) {
        Moon existingMoon = moonRepository.getReferenceById(id);
        BeanUtils.copyProperties(moon, existingMoon, "moon_id");
        return moonRepository.saveAndFlush(existingMoon);
    }
}
