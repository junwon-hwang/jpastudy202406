package com.spring.jpastudy.event.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.jpastudy.event.entity.Event;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventDetailDto {

    private String id;
    private String title;

    @JsonFormat(pattern = "yyyy년 MM월 ddd일")
    private LocalDate startDate;

    @JsonProperty(value ="img-url")
    private String imgUrl;

    public EventDetailDto(Event event){
        this.id = event.getId().toString();
        this.title = event.getTitle();
        this.startDate = event.getDate();
        this.imgUrl = event.getImage();
    }

}
