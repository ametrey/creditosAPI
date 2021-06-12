package com.aetche.api.creditos.exceptions;

import com.aetche.api.creditos.entities.*;

/**
 * ClienteInfoException
 */
public class ClienteInfoException extends Exception {

    private Cliente cliente;

    public ClienteInfoException(Cliente cliente, String mensaje) {

        super(cliente.getNombre() + ":" + mensaje);
        this.cliente = cliente;
    }
}