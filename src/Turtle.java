import java.util.Arrays;

public class Turtle extends Animal{
    private String[] name;
    private  int amout;

    public Turtle() {
    }

    public Turtle(String[] name, int amout) {
        this.name = name;
        this.amout = amout;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int getAmout() {
        return amout;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name=" + Arrays.toString(name) +
                ", amout=" + amout +
                '}';
    }

    @Override
    public void getMethods() {
        super.getMethods();
        System.out.println(Arrays.toString(name)+" ucheniki krysy");

    }
}
