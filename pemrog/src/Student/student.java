package Student;

public class student {
    private int id;
    private String name;
    private java.util.Date dateCreated;

    public student(int newID, String newName){
        id = newID;
        name = newName;
        dateCreated = new java.util.Date();
    }

    public String getName(){
        return name;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }
}
