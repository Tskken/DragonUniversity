package Momento;

import Strategy.BasicTranscript;
import Strategy.TranscriptList;

import java.util.HashMap;
import java.util.Map;

public class Registra {
    private Map<String, TranscriptList> registraTranscript;

    public Registra() {
        this.registraTranscript = new HashMap<>();
    }

    public RegistraRecord setMomento(Registra registra) {
        RegistraRecord registraRecord = new RegistraRecord();
    }
}
