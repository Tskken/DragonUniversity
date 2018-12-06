package Observer;

import Momento.Registra;
import Strategy.Transcript;

public interface Observer {
    void update(Registra registra);
}
