package com.escola.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
@Entity(name="historico")
public class Historico extends AbstractEntity<Long>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Disciplina disciplina;
    @ManyToOne
    private Matricula matricula;

    private Date data;

    private int notaFinal;
}
