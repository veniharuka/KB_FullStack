package com.kb.wallet.musical.controller;

import com.kb.wallet.musical.domain.MusicalMybatis;
import com.kb.wallet.musical.repository.MybatisMusicalRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Builder
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/musicals")
public class MybatisMusicalController {
    private final MybatisMusicalRepository mybatisMusicalRepository;

    @GetMapping
    public ResponseEntity<List<MusicalMybatis>> findAll() {
        List<MusicalMybatis> musicals = mybatisMusicalRepository.findAll();
        return ResponseEntity.ok(musicals);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicalMybatis> findById(@PathVariable Long id) {
        MusicalMybatis musical = mybatisMusicalRepository.findById(id);
        return ResponseEntity.ok(musical);
    }

    @PostMapping("/create")
    public ResponseEntity<MusicalMybatis> create(
            @RequestParam String title,
            @RequestParam int rank,
            @RequestParam String place) {
        MusicalMybatis newMusical = new MusicalMybatis(null,title,rank,place);
        int affectedRows = mybatisMusicalRepository.save(newMusical);

        if(affectedRows == 0) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }else {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        int affectedRows = mybatisMusicalRepository.delete(id);
        if (affectedRows == 0) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("해당 뮤지컬 삭제 성공");
        return ResponseEntity.ok("해당 뮤지컬 삭제 성공");
    }

    @PutMapping("/{id}/{title}")
    public ResponseEntity<MusicalMybatis> updateTitle(
            @PathVariable Long id,
            @PathVariable String title) {
        MusicalMybatis findMusical = mybatisMusicalRepository.findById(id);
        findMusical.setTitle(title);

        mybatisMusicalRepository.updateTitle(findMusical);
        return ResponseEntity.ok(findMusical);
    }


}
