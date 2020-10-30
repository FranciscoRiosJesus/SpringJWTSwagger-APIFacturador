package dev.franciscorios.facturador.dto;

import dev.franciscorios.facturador.model.Descuento;
import dev.franciscorios.facturador.model.Servicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PresupuestoRequest {
    private Long presupuestoId;
    private Integer cantDiasValidez;
    private String empresa;
    private String nombreDelCliente;
    private List<Servicio> servicioOfrecido;
    private List<Servicio> servicioOpcional;
    private Integer paymentType;
    private List<Descuento> descuentosList;
    //TODO VER SI TENGO QUE GUARDAR LA URL del presupuesto
}
