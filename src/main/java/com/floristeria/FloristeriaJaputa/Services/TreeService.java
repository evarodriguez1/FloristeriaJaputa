package com.floristeria.FloristeriaJaputa.Services;

import com.floristeria.FloristeriaJaputa.model.Tree;
import com.floristeria.FloristeriaJaputa.repositories.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeService {

    private final TreeRepository treeRepository;

    @Autowired
    public TreeService(TreeRepository treeRepository) {
        this.treeRepository = treeRepository;
    }

    public Tree addTree(Tree tree) {
        return treeRepository.save(tree);
    }

    public List<Tree> getAllTrees() {
        return treeRepository.findAll();
    }

    public Tree getTreeById(Long id) {
        return treeRepository.findById(id).orElse(null);
    }

    public void removeTree(Long id) {
        treeRepository.deleteById(id);
    }

}
