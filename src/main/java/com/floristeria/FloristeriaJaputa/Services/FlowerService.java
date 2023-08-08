package com.floristeria.FloristeriaJaputa.Services;

import com.floristeria.FloristeriaJaputa.model.Flower;
import com.floristeria.FloristeriaJaputa.model.Product;
import com.floristeria.FloristeriaJaputa.repositories.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class FlowerService {

    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public Flower addFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }

    public Flower getFlowerById(Long id) {
        return flowerRepository.findById(id).orElse(null);
    }

    public void removeFlower(Long id) {
        flowerRepository.deleteById(id);
    }

}
