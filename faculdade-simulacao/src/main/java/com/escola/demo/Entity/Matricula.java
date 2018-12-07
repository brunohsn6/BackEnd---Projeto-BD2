package com.escola.demo.Entity;

import com.escola.demo.Util.Situacao;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="matricula_aluno")
@Getter @Setter
public class Matricula extends AbstractEntity<Long>{
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String matricula;

    @ManyToOne(cascade = CascadeType.DETACH)
    private Curso curso;

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao",columnDefinition="enum('Ativo', 'Trancado', 'Finalizado')")
    private Situacao situacao;

    @ManyToOne
    private Aluno aluno;


}
