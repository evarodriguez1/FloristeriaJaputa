package com.floristeria.FloristeriaJaputa.controllers;

import com.floristeria.FloristeriaJaputa.model.Tree;
import com.floristeria.FloristeriaJaputa.Services.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trees")
public class TreeController {

    private final TreeService treeService;

    @Autowired
    public TreeController(TreeService treeService) {
        this.treeService = treeService;
    }

    @GetMapping
    public ResponseEntity<List<Tree>> getAllTrees() {
        List<Tree> trees = treeService.getAllTrees();
        return new ResponseEntity<>(trees, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tree> getTreeById(@PathVariable Long id) {
        Tree tree = treeService.getTreeById(id);
        if (tree != null) {
            return new ResponseEntity<>(tree, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Tree> addTree(@RequestBody Tree tree) {
        Tree savedTree = treeService.addTree(tree);
        return new ResponseEntity<>(savedTree, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeTree(@PathVariable Long id) {
        treeService.removeTree(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

