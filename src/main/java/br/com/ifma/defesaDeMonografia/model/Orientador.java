package br.com.ifma.defesaDeMonografia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Orientador {

  @Id @GeneratedValue
  int id;
  String nome;
  String titulacao;
  @OneToMany
  List<Orientacao> orientacoes;

}
