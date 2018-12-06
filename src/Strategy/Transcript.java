package Strategy;

public interface Transcript {
    double calculateGrade();
    void addClass(Class cl);
    void removeClass(Class cl);
    Class getAClass(String id);
}
