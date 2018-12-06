package Strategy;

import java.util.ArrayList;

public class TranscriptList {
    private ArrayList<Transcript> transcripts;

    public TranscriptList() {
        this.transcripts = new ArrayList<>();
    }

    public void addTranscript(Transcript transcript) {
        this.transcripts.add(transcript);
    }

    public Transcript getFirstTranscript() {
        return this.transcripts.get(this.transcripts.size() - 1);
    }

    @Override
    public String toString() {
        return "TranscriptList{" +
                "transcripts=" + transcripts +
                '}';
    }
}
