package br.com.ifma.defesaDeMonografia.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Orientando {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  String nomeAluno;
  String matricula;
  @OneToOne
  Curso curso;
  @OneToOne
  Orientacao orientacao;


}
