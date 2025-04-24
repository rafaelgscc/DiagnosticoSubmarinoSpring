package com.rafaelgscc.diagnosticoSubmarino.Service;

import com.rafaelgscc.diagnosticoSubmarino.Model.DiagnosticoResultado;

import java.util.List;

public class DiagnosticoStrategy {

    public DiagnosticoResultado calculaTaxas(List<String> relatorio){
        int tamanhoBit = relatorio.get(0).length();
        int[] count = new int[tamanhoBit];

        for (String linha : relatorio) {
            for (int i = 0; i < tamanhoBit; i++) {
                if (linha.charAt(i) == '1') {
                    count[i]++;
                }
            }
        }

        StringBuilder gamaStr = new StringBuilder();
        StringBuilder episilonStr = new StringBuilder();

        int metade = relatorio.size()/2;

        for (int i = 0; i < tamanhoBit; i++) {
            if (count [i] >= metade) {
                gamaStr.append("1");
                episilonStr.append("0");
            } else {
                gamaStr.append("0");
                episilonStr.append("1");
            }
        }

        int gama = Integer.parseInt(gamaStr.toString(), 2);
        int episilon = Integer.parseInt(episilonStr.toString(), 2);

        return new DiagnosticoResultado(gama, episilon);
    }
}
