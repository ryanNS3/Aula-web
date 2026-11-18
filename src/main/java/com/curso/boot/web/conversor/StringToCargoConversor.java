package com.curso.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.curso.boot.domain.Cargo;
import com.curso.boot.service.CargoService;

// Converte o id vindo do <select> do formulário em um objeto Cargo
@Component
public class StringToCargoConversor implements Converter<String, Cargo> {

    @Autowired
    private CargoService service;

    @Override
    public Cargo convert(String text) {
        if (text == null || text.isBlank()) {
            return null;
        }
        return service.buscarPorId(Long.valueOf(text));
    }
}
