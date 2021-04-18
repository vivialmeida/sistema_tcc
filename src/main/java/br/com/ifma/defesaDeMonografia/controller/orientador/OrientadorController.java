package br.com.ifma.defesaDeMonografia.controller.orientador;

import br.com.ifma.defesaDeMonografia.model.Encontro;
import br.com.ifma.defesaDeMonografia.model.Orientador;
import br.com.ifma.defesaDeMonografia.model.Orientando;
import br.com.ifma.defesaDeMonografia.service.OrientadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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

  @GetMapping("/orien tandos/{idOrientador}")
  public ResponseEntity<List<Orientando>> recuperarOrientandosPorOrientador(@PathVariable int idOrientador) {
    return ResponseEntity.ok().body(orientadorService.buscarOrientandosPorOrientador(idOrientador));
  }

  @PostMapping("/orientandos/agendar")
  public ResponseEntity<Void> agendarEncontro(@RequestParam("idOrientacao") int idOrientacao,
                                              @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                                              @RequestParam("data")LocalDateTime data,
                                              @RequestParam("local") String local ) {
    orientadorService.marcarEncontro(idOrientacao, data,local);
    return ResponseEntity.ok().build();
  }

}
