package br.com.ifma.defesaDeMonografia.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Tema {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  String titulo;
  String fundamentos;
  @OneToMany(mappedBy = "temas")
  List<Referencia> referencias;

}