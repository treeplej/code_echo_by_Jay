package com.projectx.codeecho.domain.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter @Setter
@Entity
public class Member {
    @Column(nullable = false)
    private String name;

    @Id
    @Column(nullable = false, unique = true)
    private String account;

    @Column(nullable = false, unique = true)
    private String nickname;

    //@Column(nullable = false, unique = true)
    //private UUID UUID;

    @Column
    private String tokenValue;


    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    //public void setUUID(UUID UUID) {
    //    this.UUID = UUID;
    //}

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }
}
