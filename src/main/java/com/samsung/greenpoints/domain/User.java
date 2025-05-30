package com.samsung.greenpoints.domain;

import com.samsung.greenpoints.domain.enums.CountryEnum;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final long id;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "pathToImage")
    private String pathToImage;

    @Column(name = "nick")
    private String nick;

    @Column(name = "country")
    @Enumerated(value = EnumType.STRING)
    private CountryEnum country;


    public User(long id, String email, String password, String pathToImage, String nick, CountryEnum country) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.pathToImage = pathToImage;
        this.nick = nick;
        this.country = country;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setCountry(CountryEnum country) {
        this.country = country;
    }
}
