package br.com.ifma.defesaDeMonografia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
public class Encontro {
  @Id
  @GeneratedValue
  int id;
  @OneToOne
  Orientacao orientacao;
  LocalDateTime dataHora;
  String local;

}
