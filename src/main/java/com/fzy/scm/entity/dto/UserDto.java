package com.fzy.scm.entity.dto;

import com.fzy.scm.entity.security.Role;
import lombok.Data;

import java.util.List;

/**
 * @program: UserDto
 * @description:
 * @author: fzy
 * @date: 2019-04-05 15:40
 **/
@Data
public class UserDto {

    private Long id;

    private String username;

    private String email;

    private String phone;

    private String realName;

    private Role role;

}
