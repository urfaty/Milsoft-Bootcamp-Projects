package HW2B;


public class Student {

    private long studentId;
    private String studentName;
    private double avarageScore;
    private Classroom classroom;



    public Student(long studentId, String studentName, double avarageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.avarageScore = avarageScore;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAvarageScore() {
        return avarageScore;
    }

    public void setAvarageScore(double avarageScore) {
        this.avarageScore = avarageScore;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
