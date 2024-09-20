package com.kb.wallet.musical.repository;

import com.kb.wallet.musical.domain.MusicalJPA;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface MusicalRepository extends JpaRepository<MusicalJPA, Long> {

    @Modifying
    @Query("UPDATE MusicalJPA m SET m.title = :title WHERE m.id = :id")
    void updateTitle(@Param("id") Long id, @Param("title") String title);
}

