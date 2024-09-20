package com.kb.wallet.musical.repository;

import com.kb.wallet.musical.domain.MusicalMybatis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

@Mapper
public interface MusicalMapper {
    public List<MusicalMybatis> findAll();
    public MusicalMybatis findById(@Param("id")Long id);
    public int save(MusicalMybatis newMusical);
    public int delete(@Param("id") Long id);
    public int updateTitle(MusicalMybatis newMusical);
}
