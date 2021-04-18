package br.com.ifma.defesaDeMonografia.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Orientacao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  @OneToOne
  Orientando orientando;
  @OneToOne
  Orientador orientador;
  @OneToOne
  Tema tema;
  @OneToMany
  List<Encontro> encontros;

  public Orientacao(int id) {
    this.id = id;
  }
}
