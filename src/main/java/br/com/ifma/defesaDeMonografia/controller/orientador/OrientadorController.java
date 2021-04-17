package br.com.ifma.defesaDeMonografia.controller.orientador;

import br.com.ifma.defesaDeMonografia.model.Encontro;
import br.com.ifma.defesaDeMonografia.model.Orientador;
import br.com.ifma.defesaDeMonografia.model.Orientando;
import br.com.ifma.defesaDeMonografia.service.OrientadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/orientadores")
@RequiredArgsConstructor
public class OrientadorController {

  private final OrientadorService orientadorService;

  @GetMapping
  public ResponseEntity<List<Orientador>> recuperarOrientadores() {
    List<Orientador> orientadores = orientadorService.recuperarOrientadores();
    return ResponseEntity.ok().body(orientadores);
  }

  @GetMapping("/orientandos/{idOrientador}")
  public ResponseEntity<List<Orientando>> recuperarOrientandosPorOrientador(@PathVariable int idOrientador) {
    return ResponseEntity.ok().body(orientadorService.buscarOrientandosPorOrientador(idOrientador));
  }

  @PostMapping("/orientando/agendar")
  public ResponseEntity<Void> agendarEncontro(@RequestBody Encontro encontro) {
    orientadorService.marcarEncontro(encontro);
    return ResponseEntity.ok().build();
  }

}
