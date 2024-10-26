package Student;

public class testStudent {
    public static void main(String[] args){
        student mhs1 = new student(1, "Dafa");
        student mhs2 = new student(2, "Santi");

        System.out.println(mhs1.getName() + " created at " + mhs1.getDateCreated());
        System.out.println(mhs2.getName() + " created at " + mhs2.getDateCreated());
        mhs1.getDateCreated().setTime(10000);
        System.out.println(mhs1.getName() + " created at " + mhs1.getDateCreated());
        
    }
}
