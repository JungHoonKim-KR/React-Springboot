package com.example.reactmapping.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResultDto {
    private List<PostDto> postDtoList= new ArrayList<>();
    private Boolean isLast;
}
