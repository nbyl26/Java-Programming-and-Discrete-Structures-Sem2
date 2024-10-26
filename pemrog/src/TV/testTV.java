package TV;

public class testTV {
    public static void main(String[] args){
        TV samsung = new TV();
        samsung.turnOn();
        samsung.volumeUp();
        System.out.println(samsung.volumeLevel);
    }
}
