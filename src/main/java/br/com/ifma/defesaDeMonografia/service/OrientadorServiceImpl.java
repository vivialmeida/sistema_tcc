package br.com.ifma.defesaDeMonografia.service;

import br.com.ifma.defesaDeMonografia.model.Orientando;
import br.com.ifma.defesaDeMonografia.model.Referencia;
import br.com.ifma.defesaDeMonografia.model.Tema;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrientadorServiceImpl implements OrientadorService {

  @Override
  public List<Orientando> buscarOrientandosPorOrientador() {
    return null;
  }

  @Override
  public List<Tema> recuperarTemas() {
    return null;
  }

  @Override
  public void adicionarReferencias(Tema tema, Referencia referencia) {

  }
}
