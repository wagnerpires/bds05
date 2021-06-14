package com.devsuperior.movieflix.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.devsuperior.movieflix.dtos.UserDTO;
import com.devsuperior.movieflix.entities.User;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User dtoToEntity(UserDTO dto);

    UserDTO entityToDTO(User entity);
}