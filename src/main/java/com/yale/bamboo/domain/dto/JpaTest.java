package com.yale.bamboo.domain.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jpa_test")
@Data
public class JpaTest {
    @Id
    private int id;
    private String name;
    private String sex;
}
