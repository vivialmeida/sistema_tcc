package br.com.ifma.defesaDeMonografia.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Curso {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  String nome;
  Integer qtPeriodos;
  String sigla;
  String departamento;
}
