package br.com.ifma.defesaDeMonografia.service;

import br.com.ifma.defesaDeMonografia.mapper.OrientadorMapper;
import br.com.ifma.defesaDeMonografia.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrientadorServiceImpl implements OrientadorService {

  private final OrientadorMapper orientadorMapper;

  @Override
  public List<Orientando> buscarOrientandosPorOrientador(int idOrientador) {
    return  orientadorMapper.recuperarOrientandoPorOrientador(idOrientador);
  }

  @Override
  public List<Tema> recuperarTemas() {
    return null;
  }

  @Override
  public void adicionarReferencias(Tema tema, Referencia referencia) {

  }

  @Override
  public List<Orientador> recuperarOrientadores() {
    List<Orientador> orientadores = orientadorMapper.recuperarOrientadores();
    return orientadores;
  }

  @Override
  public void marcarEncontro(int idOrientacao, LocalDateTime data, String local) {
    Encontro encontro = Encontro.builder()
        .dataHora(data)
        .orientacao(new Orientacao(idOrientacao))
        .local(local)
        .build();
    orientadorMapper.marcarEncontro(encontro);


  }
}
