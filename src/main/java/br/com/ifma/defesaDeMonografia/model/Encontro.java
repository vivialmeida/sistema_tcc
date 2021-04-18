package br.com.ifma.defesaDeMonografia.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Encontro {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  @OneToOne
  Orientacao orientacao;
  LocalDateTime dataHora;
  String local;

}
