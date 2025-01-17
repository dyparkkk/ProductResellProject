package com.example.ProductResellProject.web.dto;

import com.example.ProductResellProject.domain.users.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class LoginInfoDto {
    private String userId;
    private String userPwd;

    @Builder
    public LoginInfoDto(String userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;
    }

    public User toEntity(){
        return  User.builder()
                .userId(userId)
                .userPwd(userPwd)
                .build();
    }

}
