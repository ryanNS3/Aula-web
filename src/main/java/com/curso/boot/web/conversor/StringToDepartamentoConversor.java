package com.curso.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.curso.boot.domain.Departamento;
import com.curso.boot.service.DepartamentoService;

// Converte o id vindo do <select> do formulário em um objeto Departamento
@Component
public class StringToDepartamentoConversor implements Converter<String, Departamento> {

    @Autowired
    private DepartamentoService service;

    @Override
    public Departamento convert(String text) {
        if (text == null || text.isBlank()) {
            return null;
        }
        return service.buscarPorId(Long.valueOf(text));
    }
}
