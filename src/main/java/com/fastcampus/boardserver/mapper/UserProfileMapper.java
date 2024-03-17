package com.fastcampus.boardserver.mapper;


import com.fastcampus.boardserver.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserProfileMapper {
    public UserDTO getUserProfile(@Param("id") String id);

    int deleteUserProfile(@Param("id") String id);

    public int register(UserDTO userDTO);

    public UserDTO findByIdAndPassword(@Param("id") String id,
                                       @Param("password") String password);

    public UserDTO findByUserIdAndPassword(@Param("userId") String userId,
                                       @Param("pa정ssword") String password);

    int idCheck(String id);

    public int updatePassword(UserDTO userDTO);

}
