package com.fmc.oasisinfobytetask4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class MCQ {
    @Id
    private Long id;
    private String question1;
    private String question2;
    private String question3;
    private String question4;
}
