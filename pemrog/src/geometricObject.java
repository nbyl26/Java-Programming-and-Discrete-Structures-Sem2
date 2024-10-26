import java.util.Date;

public class geometricObject {
    boolean filled;
    private String color = "white";
    private java.util.Date getDateCreated;

    
    public geometricObject(boolean filled, String color, Date getDateCreated) {
        this.filled = filled;
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public java.util.Date getGetDateCreated() {
        return getDateCreated;
    }
    public void setGetDateCreated(java.util.Date getDateCreated) {
        this.getDateCreated = getDateCreated;
    }
}
