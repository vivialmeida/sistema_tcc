package br.com.ifma.defesaDeMonografia.service;

import br.com.ifma.defesaDeMonografia.model.Orientando;
import br.com.ifma.defesaDeMonografia.model.Referencia;
import br.com.ifma.defesaDeMonografia.model.Tema;

import java.util.List;

public interface OrientadorService {
  List<Orientando> buscarOrientandosPorOrientador();
  List<Tema> recuperarTemas();
 void adicionarReferencias(Tema tema, Referencia referencia);



}
