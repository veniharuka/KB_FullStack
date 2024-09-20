package com.kb.wallet.musical.repository;

import com.kb.wallet.musical.domain.MusicalJPA;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@Transactional
@RequiredArgsConstructor
public class JpaMusicalRepository {
    private final EntityManager em;

    public List<MusicalJPA> findAll() {
        String jpql = "SELECT m FROM MusicalJPA m";
        List<MusicalJPA> musicalList = em.createQuery(jpql, MusicalJPA.class).getResultList();

        return musicalList;
    }
    public MusicalJPA findById(Long id) {
        return em.find(MusicalJPA.class, id);
    }
    public MusicalJPA save(MusicalJPA newMusical) {
        em.persist(newMusical);
        return newMusical;
    }
    public void delete(Long id) {
        MusicalJPA musical = em.find(MusicalJPA.class, id);
        if(musical != null) em.remove(musical);
    }

    public void updateTitle(Long id, String newTitle) {
        MusicalJPA musical = em.find(MusicalJPA.class, id);
        if (musical != null) {
            musical.setTitle(newTitle);
            em.merge(musical);
        }
    }


}
