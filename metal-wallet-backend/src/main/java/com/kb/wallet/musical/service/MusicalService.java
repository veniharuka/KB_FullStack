package com.kb.wallet.musical.service;

import com.kb.wallet.musical.domain.MusicalJPA;
import java.util.List;

public interface MusicalService {
    // 새로운 뮤지컬 생성
    MusicalJPA createMusical(MusicalJPA newMusical);

    // ID로 특정 뮤지컬 조회
    MusicalJPA findMusicalById(Long id);

    // 모든 뮤지컬 조회
    List<MusicalJPA> findAll();

    // ID로 뮤지컬 조회
    MusicalJPA findById(Long id);

    // ID로 뮤지컬 삭제
    void delete(Long id);

    // ID로 뮤지컬 제목 업데이트
    void updateTitle(Long id, String title);
}
