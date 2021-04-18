package br.com.ifma.defesaDeMonografia.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Referencia {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  String livro;
  String autor;
  Integer edicao;
  @OneToMany
  List<Tema> temas;
}
