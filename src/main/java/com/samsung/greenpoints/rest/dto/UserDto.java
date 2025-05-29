package com.samsung.greenpoints.rest.dto;

import com.samsung.greenpoints.domain.User;
import com.samsung.greenpoints.domain.enums.CountryEnum;

public class UserDto {
    private final long id;
    private final String email;
    private final String password;
    private final String pathToImage;
    private final String nick;
    private final CountryEnum country;

    public UserDto(long id, String email, String password, String pathToImage, String nick, CountryEnum country) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.pathToImage = pathToImage;
        this.nick = nick;
        this.country = country;
    }

    public static UserDto userToDto(User user){
        return new UserDto(user.getId(), user.getEmail(), user.getPassword(), user.getPathToImage(), user.getNick(), user.getCountry());
    }

    public static User userFromDto(UserDto dto){
        return new User(dto.getId(), dto.getEmail(), dto.getPassword(), dto.getPathToImage(), dto.getNick(), dto.getCountry());
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public String getNick() {
        return nick;
    }

    public CountryEnum getCountry() {
        return country;
    }
}
