package com.floristeria.FloristeriaJaputa.Services;

import com.floristeria.FloristeriaJaputa.model.Decoration;
import com.floristeria.FloristeriaJaputa.repositories.DecorationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DecorationService {

    private final DecorationRepository decorationRepository;

    @Autowired
    public DecorationService(DecorationRepository decorationRepository) {
        this.decorationRepository = decorationRepository;
    }

    public Decoration addDecoration(Decoration decoration) {
        return decorationRepository.save(decoration);
    }

    public List<Decoration> getAllDecorations() {
        return decorationRepository.findAll();
    }

    public Decoration getDecorationById(Long id) {
        return decorationRepository.findById(id).orElse(null);
    }

    public void removeDecoration(Long id) {
        decorationRepository.deleteById(id);
    }
}
