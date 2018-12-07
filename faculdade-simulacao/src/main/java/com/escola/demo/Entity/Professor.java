package com.escola.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="professor")
@Getter @Setter
public class Professor extends AbstractEntity<Long>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matricula;

    private String nome;

    @ManyToOne
    private Departamento departamento;


}