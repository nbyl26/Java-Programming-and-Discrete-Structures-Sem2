public class StudentImmutable {
    private int id;
    private double student_score;

    public StudentImmutable(int newID, double newstudent_score){
        id = newID;
        student_score = newstudent_score;
    }

    public double getStudent_score(){
        return student_score;
    }
}