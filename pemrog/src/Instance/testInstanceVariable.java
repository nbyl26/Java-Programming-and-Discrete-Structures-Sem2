package Instance;

public class testInstanceVariable {
    public static void main(String args[]){
        
        InstanceVariable iv = new InstanceVariable();
        int i = 10;
        int j = 10;

        System.out.println(iv.i);
        System.out.println(iv.j);
        System.out.println(i);
        System.out.println(j);

        System.out.println("Perubahan 1");
        i = iv.i;
        j = iv.j;
        iv.i = 10;
        iv.j = 10;

        System.out.println(iv.i);
        System.out.println(iv.j);
        System.out.println(i);
        System.out.println(j);

        System.out.println("Perubahan 2");
        InstanceVariable iv2 = new InstanceVariable();
        iv2 = iv;
        System.out.println(iv.i);
        System.out.println(iv.j);
        System.out.println(i);
        System.out.println(j);
        System.out.println(iv2.i);
        System.out.println(iv2.j);

        System.out.println("Perubahan 3");
        iv.j = 1000;
        i = 1000;

        System.out.println(iv.i);
        System.out.println(iv.j);
        System.out.println(i);
        System.out.println(j);
        System.out.println(iv2.i);
        System.out.println(iv2.j);

        System.out.println("Perubahan 4");
        InstanceVariable iv3 = new InstanceVariable();
        iv3.i = iv.i;
        iv3.j = iv.j;
        iv.j = -1000;
        System.out.println(iv.i);
        System.out.println(iv.j);
        System.out.println(i);
        System.out.println(j);
        System.out.println(iv3.i);
        System.out.println(iv3.j);

    }
}
