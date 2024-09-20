package com.kb.wallet.musical.service;

import com.kb.wallet.musical.domain.MusicalJPA;
import com.kb.wallet.musical.repository.JpaMusicalRepository;
import com.kb.wallet.musical.repository.MusicalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicalServiceImpl implements MusicalService {
    private final MusicalRepository musicalRepository;

    @Autowired
    public MusicalServiceImpl(MusicalRepository musicalRepository) {
        this.musicalRepository = musicalRepository;
    }

    @Override
    public MusicalJPA createMusical(MusicalJPA newMusical) {
        return musicalRepository.save(newMusical);
    }

    @Override
    public MusicalJPA findMusicalById(Long id) {
        return musicalRepository.findById(id).orElse(null);
    }

    @Override
    public List<MusicalJPA> findAll() {
        return musicalRepository.findAll();
    }

    @Override
    public MusicalJPA findById(Long id) {
        return musicalRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        MusicalJPA musical = musicalRepository.findById(id).orElse(null);
        if (musical != null) {
            musicalRepository.delete(musical);
        }
    }

    @Override
    public void updateTitle(Long id, String title) {
        MusicalJPA musical = musicalRepository.findById(id).orElse(null);
        if (musical != null) {
            musical.setTitle(title);
            musicalRepository.save(musical);  // 업데이트 후 저장
        }
    }
}


