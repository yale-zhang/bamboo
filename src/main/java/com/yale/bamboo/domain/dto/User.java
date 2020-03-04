package com.yale.bamboo.domain.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private Long id;
    private String username;
    private Integer age;
    private LocalDate birthday;
}
