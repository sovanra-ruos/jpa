package istad.co.datajpa.service;

import istad.co.datajpa.mapper.UserMapper;
import istad.co.datajpa.model.User;
import istad.co.datajpa.repository.UserRepository;
import istad.co.datajpa.service.dto.UserRequest;
import istad.co.datajpa.service.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final   UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponse createUser(UserRequest userRequest) {

        User user = userMapper.toUserMapper(userRequest);


        user.setName(userRequest.name());
        user.setEmail(userRequest.email());
        user.setUsername(userRequest.username());

        userRepository.save(user);

        return userMapper.toUserResponse(user);
    }

    @Override
    public UserResponse getUserByUsername(String username) {

        User user = userRepository.findUserByUsername(username).orElseThrow(
                () -> new RuntimeException("User not found")
        );

        return userMapper.toUserResponse(user);
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return List.of();
    }

    @Override
    public void getUserByEmail(String email) {
        User user = userRepository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("User not found")
        );
    }
}
