package com.kb.wallet.musical.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.ErrorResponse;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MusicalMybatis {

    private Long id;
    private String title;
    private int rank;
    private String place;
    private String placeDetail;
    private Date ticketingStartDate;
    private Date ticketingEndDate;
    private int runningTime;
    private String noticeImageUrl;
    private String posterImageUrl;
    private String detailImageUrl;
    private String placeImageUrl;



    public MusicalMybatis(Long id, String title, int rank, String place) {
        this.title = title;
        this.rank = rank;
        this.place = place;
    }
}
