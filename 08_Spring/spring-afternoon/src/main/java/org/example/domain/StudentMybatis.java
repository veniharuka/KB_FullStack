package org.example.domain;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class StudentMybatis {
    private Long id;
    private String name;
    private int age;
    private String gender;
}
