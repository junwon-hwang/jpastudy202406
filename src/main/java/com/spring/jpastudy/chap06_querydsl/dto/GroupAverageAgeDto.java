package com.spring.jpastudy.chap06_querydsl.dto;

import lombok.*;

@Setter @Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupAverageAgeDto {

    private String groupName;
    private double averageAge;

}
