package dev.franciscorios.facturador.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Descuento {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long descuentoId;
    @NotNull
    private Integer porcentajeDescuento;
    @NotNull
    private String descripcion;
}
