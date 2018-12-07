package com.escola.demo.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity(name = "aluno")
@Setter @Getter
public class Aluno extends AbstractEntity<Long>{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "matricula_aluno")
    private List<Matricula> matriculas;

    private String nome;


    public void addMatricula(Matricula m){
        this.matriculas.add(m);
    }



}
