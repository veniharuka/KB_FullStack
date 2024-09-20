package com.kb.wallet.musical.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

public class MusicalDTO {
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class MusicalRequest {
        private Long id;
        private String title;
        private int rank;
        private String place;
        private String placeDetail;
        private Date ticketingStartDate;
        private Date ticketingEndDate;
        private int runningTime;
//        private String noticeImageUrl;
//        private String posterImageUrl;
//        private String detailImageUrl;
//        private String placeImageUrl;
    }
}
