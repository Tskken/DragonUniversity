package Momento;

import java.util.ArrayList;

public class Caretaker {
    private ArrayList<RegistraRecord> records;

    public Caretaker() {
        this.records = new ArrayList<>();
    }

    public void addMomento(RegistraRecord registraRecord) {
        this.records.add(registraRecord);
    }

    public ArrayList<RegistraRecord> getMomento() {
        return this.records;
    }

    @Override
    public String toString() {
        return "Caretaker{" +
                "records=" + records +
                '}';
    }
}
