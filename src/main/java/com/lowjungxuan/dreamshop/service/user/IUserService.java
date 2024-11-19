package com.lowjungxuan.dreamshop.service.user;

import com.lowjungxuan.dreamshop.dto.UserDto;
import com.lowjungxuan.dreamshop.model.User;
import com.lowjungxuan.dreamshop.request.CreateUserRequest;
import com.lowjungxuan.dreamshop.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long id);
    User createUser(CreateUserRequest user);
    User updateUser(UserUpdateRequest user, Long userId);
    void deleteUser(Long id);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
