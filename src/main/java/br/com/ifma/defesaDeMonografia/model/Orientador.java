package br.com.ifma.defesaDeMonografia.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Orientador {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  String nome;
  String titulacao;
  @OneToMany
  List<Orientacao> orientacoes;

}
