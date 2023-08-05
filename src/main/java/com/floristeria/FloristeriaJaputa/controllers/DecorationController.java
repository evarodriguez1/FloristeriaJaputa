package com.floristeria.FloristeriaJaputa.controllers;

import com.floristeria.FloristeriaJaputa.model.Decoration;
import com.floristeria.FloristeriaJaputa.Services.DecorationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/decorations")
public class DecorationController {

    private final DecorationService decorationService;

    @Autowired
    public DecorationController(DecorationService decorationService) {
        this.decorationService = decorationService;
    }

    @GetMapping
    public ResponseEntity<List<Decoration>> getAllDecorations() {
        List<Decoration> decorations = decorationService.getAllDecorations();
        return new ResponseEntity<>(decorations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Decoration> getDecorationById(@PathVariable Long id) {
        Decoration decoration = decorationService.getDecorationById(id);
        if (decoration != null) {
            return new ResponseEntity<>(decoration, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Decoration> addDecoration(@RequestBody Decoration decoration) {
        Decoration savedDecoration = decorationService.addDecoration(decoration);
        return new ResponseEntity<>(savedDecoration, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeDecoration(@PathVariable Long id) {
        decorationService.removeDecoration(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
