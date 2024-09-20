package com.kb.wallet.musical.controller;

import com.kb.wallet.musical.domain.MusicalJPA;
import com.kb.wallet.musical.domain.MusicalMybatis;
import com.kb.wallet.musical.dto.MusicalDTO;
import com.kb.wallet.musical.repository.JpaMusicalRepository;
import com.kb.wallet.musical.service.MusicalService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Builder
@RestController
@Slf4j
@RequestMapping("/api/musical")
public class JpaMusicalController {

    private final  MusicalService musicalService;

    @Autowired
    public JpaMusicalController(MusicalService musicalService) {
        this.musicalService = musicalService;
    }

    @GetMapping
    public ResponseEntity<List<MusicalJPA>> findAll() {
        List<MusicalJPA> musicals = musicalService.findAll();
        return ResponseEntity.ok(musicals);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicalJPA> findById(@PathVariable Long id) {
        MusicalJPA musical = musicalService.findMusicalById(id);
        return ResponseEntity.ok(musical);
    }

    @PostMapping("/create")
    public ResponseEntity<MusicalJPA> createMusical(@RequestBody MusicalDTO.MusicalRequest musicalRequest) {

        MusicalJPA newMusical = new MusicalJPA(
            null,  // id는 자동 생성되므로 null로 설정
            musicalRequest.getTitle(),
            musicalRequest.getRank(),
            musicalRequest.getPlace(),
            musicalRequest.getPlaceDetail(),
            musicalRequest.getTicketingStartDate(),
            musicalRequest.getTicketingEndDate(),
            musicalRequest.getRunningTime()
        );

        MusicalJPA savedMusical = musicalService.createMusical(newMusical);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMusical);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        MusicalJPA findMusical = musicalService.findMusicalById(id);
        if (findMusical == null) return ResponseEntity.notFound().build();

        musicalService.delete(id);
        return ResponseEntity.ok("해당 뮤지컬 삭제 성공");
    }

    @PutMapping("/{id}/{title}")
    public ResponseEntity<MusicalJPA> updateTitle(
        @PathVariable Long id,
        @PathVariable String title) {

        MusicalJPA findMusical = musicalService.findMusicalById(id);
        if (findMusical == null) {
            return ResponseEntity.notFound().build();
        }

        musicalService.updateTitle(id, title);
        findMusical.setTitle(title);

        return ResponseEntity.ok(findMusical);
    }


}
