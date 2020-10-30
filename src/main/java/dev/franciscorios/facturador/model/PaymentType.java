package dev.franciscorios.facturador.model;

import dev.franciscorios.facturador.exceptions.SpringFacturadorException;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public enum PaymentType {
    Contado(0),
    TarjetaDeDebito(1),
    TarjetaDeCredito(2),
    CuentaCorriente(3),
    Cheque(4),
    Ticket(5),
    Otra(6);

    private int paymentType;

    PaymentType(int paymentType) {
    }

    public static PaymentType lookup(Integer type) {
        return Arrays.stream(PaymentType.values())
                .filter(value -> new Integer(value.ordinal()).equals(type))
                .findAny()
                .orElseThrow(() -> new SpringFacturadorException("Payment type not found"));
    }

    public Integer getType() {
        return paymentType;
    }
}
