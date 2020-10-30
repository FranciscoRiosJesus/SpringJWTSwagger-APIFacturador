package dev.franciscorios.facturador.controller;

import dev.franciscorios.facturador.model.Servicio;
import dev.franciscorios.facturador.service.ServicioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicios")
@AllArgsConstructor
public class ServicioController {

    private final ServicioService servicioService;

    @PostMapping
    public ResponseEntity<Void> createServicio(@RequestBody Servicio servicio) {
        servicioService.save(servicio);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Servicio>> getAllServicios() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(servicioService.getAllServicios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servicio> getServicio(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(servicioService.getServicio(id));
    }
}
