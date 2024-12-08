package istad.co.datajpa.service;

import istad.co.datajpa.service.dto.UserRequest;
import istad.co.datajpa.service.dto.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest userRequest);

    UserResponse getUserByUsername(String username);

    List<UserResponse> getAllUsers();

    void getUserByEmail(String email);

}
