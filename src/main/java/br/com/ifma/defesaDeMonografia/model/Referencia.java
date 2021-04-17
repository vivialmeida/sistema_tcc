package br.com.ifma.defesaDeMonografia.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Referencia {
  @Id
  @GeneratedValue
  int id;
  String livro;
  String autor;
  Integer edicão;
  @OneToMany
  List<Tema> temas;
}
