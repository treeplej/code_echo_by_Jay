package com.projectx.codeecho.domain.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Room {
    @Id
    @Column(nullable = false)
    private String roomLink;

    @Column(nullable = false)
    private String authorizedMember;


}
