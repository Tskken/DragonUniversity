package Momento;

import Strategy.BasicTranscript;
import Strategy.TranscriptList;

import java.util.Map;

public class RegistraRecord {
    private Map<String, TranscriptList> transcriptMap;

   public void setState(Map<String, TranscriptList> transcriptMap) {
       this.transcriptMap = transcriptMap;
   }

   private Map<String, TranscriptList> getState() {
        return this.transcriptMap;
   }
}
