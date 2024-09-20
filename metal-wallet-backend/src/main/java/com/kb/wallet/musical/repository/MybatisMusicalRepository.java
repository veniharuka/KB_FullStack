package com.kb.wallet.musical.repository;

import com.kb.wallet.musical.domain.MusicalMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MybatisMusicalRepository {
    private final MusicalMapper musicalMapper;

    @Autowired
    public MybatisMusicalRepository(MusicalMapper musicalMapper) {
        this.musicalMapper = musicalMapper;
    }
    public List<MusicalMybatis> findAll() {
        return musicalMapper.findAll();
    }
    public MusicalMybatis findById(Long id) {
        return musicalMapper.findById(id);
    }
    public int save(MusicalMybatis newMusical) {
        return musicalMapper.save(newMusical);
    }
    public int delete(Long id) {
        return musicalMapper.delete(id);
    }
    public int updateTitle(MusicalMybatis newMusical) {
        return musicalMapper.updateTitle(newMusical);
    }




}
