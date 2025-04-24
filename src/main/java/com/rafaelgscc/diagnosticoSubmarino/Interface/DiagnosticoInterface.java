package com.rafaelgscc.diagnosticoSubmarino.Interface;

import com.rafaelgscc.diagnosticoSubmarino.Model.DiagnosticoResultado;

import java.util.List;

public interface DiagnosticoInterface {
    DiagnosticoResultado calculaTaxas(List<String> relatorio);
}
