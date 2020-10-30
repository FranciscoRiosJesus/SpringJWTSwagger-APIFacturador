package dev.franciscorios.facturador.mapper;

import dev.franciscorios.facturador.dto.PresupuestoRequest;
import dev.franciscorios.facturador.dto.PresupuestoResponse;
import dev.franciscorios.facturador.model.Presupuesto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class PresupuestoMapper {

    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
    @Mapping(target = "paymentType", expression = "java(dev.franciscorios.facturador.model.PaymentType.lookup(presupuestoRequest.getPaymentType()))")
    public abstract Presupuesto map(PresupuestoRequest presupuestoRequest);

    @Mapping(target = "presupuestoId", source = "presupuestoId")
    @Mapping(target = "paymentType", expression = "java(presupuesto.getPaymentType().getType())")
    public abstract PresupuestoResponse mapToDto(Presupuesto presupuesto);

}