public class Main {
    public static void main(String[] args) {
        Animal[] animals = {

                new Shark("Kosatka", 3),

                new Turtle(new String[]{"donatello", "mikelandjelo", "leonardo", "Rafael"}, 4),

                new Eagle("Ak shumkar", "white")};

        for (Animal animal : animals) {

            System.out.println(animal + " ");
        animal.getMethods();
        }

    }
}