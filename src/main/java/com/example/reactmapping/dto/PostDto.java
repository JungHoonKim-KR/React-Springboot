package com.example.reactmapping.dto;

import com.example.reactmapping.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private Long postId;
    private String title;
    private String content;
    private MultipartFile serverImg;
    private String frontImage;
    private Long memberId;
    private String memberName;
    private List<PostCommentDto> commentList;
    private Boolean isLast;

  public static PostDto entityToDto(Post post){
      List<PostCommentDto> postCommentDtos = post.getCommentList() != null
              ? post.getCommentList().stream().map(PostCommentDto::entityToDto).collect(Collectors.toList())
              : new ArrayList<>();
      PostDto build = PostDto.builder()
              .postId(post.getId())
              .title(post.getTitle())
              .content(post.getContent())
              .memberId(post.getMember().getId())
              .memberName(post.getMember().getUsername())
              .commentList(postCommentDtos)
              .build();

      if(post.getImage()!=null){
           build=build.toBuilder().frontImage(post.getImage().getFileUrl()).build();
       }
      return build;
  }
}
