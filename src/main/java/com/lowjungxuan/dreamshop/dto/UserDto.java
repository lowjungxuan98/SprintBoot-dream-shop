package com.lowjungxuan.dreamshop.dto;

import lombok.Data;

import java.util.Collection;
import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Collection<RoleDto> roles;
    private List<OrderDto> orders;
    private CartDto cart;
}