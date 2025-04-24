package com.rafaelgscc.diagnosticoSubmarino.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeitorRelatorio {

    public static List<String> lerRelatorioJSON(String path) throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get(path));
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonData, objectMapper.getTypeFactory().constructCollectionType
                (List.class, String.class));
    }
}
