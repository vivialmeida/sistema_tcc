package br.com.ifma.defesaDeMonografia.service;

import br.com.ifma.defesaDeMonografia.model.*;

import java.time.LocalDateTime;
import java.util.List;

public interface OrientadorService {     
  List<Orientando> buscarOrientandosPorOrientador(int idOrientador);
  List<Tema> recuperarTemas();
  void adicionarReferencias(Tema tema, Referencia referencia);
  List<Orientador>recuperarOrientadores();
  void marcarEncontro(int idOrientacao, LocalDateTime data, String pauta);


}
