public class Shark extends Animal {
   private String poroda;
   private int  amout;

    public Shark() {
    }

    public Shark(String  poroda, int amout) {
        this.poroda = poroda;
        this.amout = amout;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String  poroda) {
        this.poroda = poroda;
    }

    public int getAmout() {
        return amout;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }


    @Override
    public String toString() {
        return "Shark{" +
                "poroda='" + poroda + '\'' +
                ", amout=" + amout +
                '}';
    }

    @Override
    public void getMethods() {
        super.getMethods();
        System.out.println(getPoroda() +" attack");

    }
}
