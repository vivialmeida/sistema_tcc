package br.com.ifma.defesaDeMonografia.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orientacao {
  @Id
  @GeneratedValue
  int id;
  @OneToOne
  Orientando orientando;
  @OneToOne
  Orientador orientador;
  @OneToOne
  Tema tema;
  @OneToMany
  List<Encontro> encontros;
}
