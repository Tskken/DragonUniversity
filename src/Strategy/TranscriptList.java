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
}
