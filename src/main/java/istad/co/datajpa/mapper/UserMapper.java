package istad.co.datajpa.mapper;

import istad.co.datajpa.model.User;
import istad.co.datajpa.service.dto.UserRequest;
import istad.co.datajpa.service.dto.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUserMapper(UserRequest userRequest);

    UserResponse toUserResponse(User user);

}
