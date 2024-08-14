package org.example.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDto {
    private long no;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
    private Date updateDate;
}
