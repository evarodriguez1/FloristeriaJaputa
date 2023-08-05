package com.floristeria.FloristeriaJaputa.controllers;
import com.floristeria.FloristeriaJaputa.model.Flower;
import com.floristeria.FloristeriaJaputa.Services.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public ResponseEntity<List<Flower>> getAllFlowers() {
        List<Flower> flowers = flowerService.getAllFlowers();
        return new ResponseEntity<>(flowers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flower> getFlowerById(@PathVariable Long id) {
        Flower flower = flowerService.getFlowerById(id);
        if (flower != null) {
            return new ResponseEntity<>(flower, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Flower> addFlower(@RequestBody Flower flower) {
        Flower savedFlower = flowerService.addFlower(flower);
        return new ResponseEntity<>(savedFlower, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeFlower(@PathVariable Long id) {
        flowerService.removeFlower(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
