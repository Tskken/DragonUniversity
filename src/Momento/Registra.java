package Momento;

import Strategy.BasicTranscript;
import Strategy.Student;
import Strategy.Transcript;
import Strategy.TranscriptList;

import java.util.HashMap;
import java.util.Map;

public class Registra {
    private Map<String, TranscriptList> registraTranscript;

    public Registra() {
        this.registraTranscript = new HashMap<>();
    }

    public Map<String, TranscriptList> getRegistraTranscript() {
        return registraTranscript;
    }

    public RegistraRecord setMomento(Registra registra) {
        RegistraRecord registraRecord = new RegistraRecord();
        registraRecord.setState(registra.getRegistraTranscript());
        return registraRecord;
    }

    public RegistraRecord createMomento() {
        RegistraRecord registraRecord = new RegistraRecord();
        registraRecord.setState(this.registraTranscript);
        return registraRecord;
    }

    public Transcript getStudentTranscript(String id) {
        return registraTranscript.get(id).getFirstTranscript();
    }

    public void addStudentTranscript(Student student) {
        TranscriptList tl = this.registraTranscript.get(student.getName());
        if (tl == null) {
            TranscriptList transcriptList = new TranscriptList();
            transcriptList.addTranscript(student.getBasicTranscript());
            this.registraTranscript.put(student.getName(), transcriptList);
            return;
        }

        tl.addTranscript(student.getBasicTranscript());
        this.registraTranscript.put(student.getName(), tl);
    }
}
