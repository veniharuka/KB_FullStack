package org.example.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentMybatis {
    private Long id;
    private String name;
    private int age;
    private String gender;
}
