package br.com.ifma.defesaDeMonografia.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tema {
  @Id
  @GeneratedValue
  int id;
  String titulo;
  String fundamentos;
  @OneToMany(mappedBy = "temas")
  List<Referencia> referencias;

}