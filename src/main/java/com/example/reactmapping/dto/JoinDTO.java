package com.example.reactmapping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoinDTO {
    private String emailId;
    private String password;
    private String username;
    private String summonerName;
    private String summonerTag;
    private MultipartFile img;

}
