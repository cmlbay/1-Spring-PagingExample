package com.example.paging.model.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "CMS_USER")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String uniqueName;

    @Column
    private int personalNumber;

    @Column(length = 5)
    private String departmentCode;

    @Column
    private String title;
}
