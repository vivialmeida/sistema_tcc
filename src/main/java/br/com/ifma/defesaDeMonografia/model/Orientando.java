package br.com.ifma.defesaDeMonografia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Orientando {

  @Id
  @GeneratedValue
  int id;
  String nomeAluno;
  String matricula;
  @OneToOne
  Curso curso;
  @OneToOne
  Orientacao orientacao;


}
