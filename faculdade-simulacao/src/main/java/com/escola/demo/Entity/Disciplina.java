package com.escola.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name="disciplina")
@Getter @Setter
public class Disciplina extends AbstractEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    private String nome;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "pre_requisito",
    joinColumns = {@JoinColumn(name = "id_disc",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "id_req", referencedColumnName = "id")})
    private List<Disciplina> preRequisitos;



}