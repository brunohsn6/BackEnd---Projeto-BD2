package com.escola.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name="curso")
@Getter
@Setter
public class Curso extends AbstractEntity<Long>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    private String nome;

    private int horasObrigatorias;

    private int cargaHoraria;

    private int creditos;

    @ManyToOne
    private Departamento departamento;

//    @ManyToMany
//    @JoinTable(name = "optativa",
//            joinColumns = {@JoinColumn(name = "id_curso",referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "id_disc", referencedColumnName = "id")})
//    private List<Disciplina> optativas;
//
//    @ManyToMany
//    @JoinTable(name = "obrigatoria",
//            joinColumns = {@JoinColumn(name = "id_curso",referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "id_disc", referencedColumnName = "id")})
//    private List<Disciplina> obrigatorias;
}
