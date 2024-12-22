
abstract class Students {
    protected String name;
    protected int course;
    protected int last_mark;

    public Students(String n, int c, int m) {
        name = n;
        course = c;
        last_mark = m;
    }

    abstract void writeExam();
}

class IUStudents extends Students {
    void writeExam() {
        System.out.println("Студент " + course + " курса факультета ИУ, " + name + " в данный момент пишет экзамен");
    }

    public IUStudents(String n, int c, int m) {
        super(n, c, m);
    }
}

class MathStudents extends Students {
    void writeExam() {
        System.out.println("Студент " + course + " курса факультета ФН, " + name + " в данный момент пишет экзамен");
    }

    public MathStudents(String n, int c, int m) {
        super(n, c, m);
    }
}

public class main {
    public static void main(String[] args) {
        IUStudents IUStudent = new IUStudents("Захарчук Дарья Романовна", 4, 5);
        MathStudents FNStudent = new MathStudents("Иванов Иван Иванович", 2, 5);
        IUStudent.writeExam();
        FNStudent.writeExam();
    }
}
