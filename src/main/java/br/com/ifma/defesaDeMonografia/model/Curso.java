package br.com.ifma.defesaDeMonografia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Curso {
  @Id
  @GeneratedValue
  int id;
  String nome;
  Integer qtPeriodos;
  String sigla;
  String departamento;
}
