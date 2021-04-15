package br.com.ifma.defesaDeMonografia.controller.orientador;

import br.com.ifma.defesaDeMonografia.model.Orientando;
import br.com.ifma.defesaDeMonografia.service.OrientadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orientadores")
@RequiredArgsConstructor
public class OrientadorController {

  private final OrientadorService orientadorService;

  @GetMapping
  public ResponseEntity<List<Orientando>> recuperarOrientadores() {
    return ResponseEntity.ok().body(orientadorService.buscarOrientandosPorOrientador());
  }

  @GetMapping
  public ResponseEntity<List<Orientando>> recuperarOrientandosPorOrientador() {
    return ResponseEntity.ok().body(orientadorService.buscarOrientandosPorOrientador());
  }
}
