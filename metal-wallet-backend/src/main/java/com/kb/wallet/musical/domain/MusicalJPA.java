package com.kb.wallet.musical.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "musical")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MusicalJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String title;

    @Column
    @NotNull
    private int rank;

    @Column
    @NotNull
    private String place;
    @Column
    @NotNull
    private String placeDetail;

    @Column
    @NotNull
    private Date ticketingStartDate;

    @Column
    @NotNull
    private Date ticketingEndDate;

    @Column
    @NotNull
    private int runningTime;

//    @Column
//    @NotNull
//    private String noticeImageUrl;
//    @Column
//    @NotNull
//    private String posterImageUrl;
//    @Column
//    @NotNull
//    private String detailImageUrl;
//    @Column
//    @NotNull
//    private String placeImageUrl;


    public MusicalJPA(Long id, String title, int rank, String place, String placeDetail) {
        this.id = id;
        this.title = title;
        this.rank = rank;
        this.place = place;
        this.placeDetail = placeDetail;
        this.ticketingStartDate = ticketingStartDate;
        this.ticketingEndDate = ticketingEndDate;
        this.runningTime = runningTime;
    }
}