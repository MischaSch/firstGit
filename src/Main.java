public class Main {

    public static void main(String[] args) {

        Kaffeemaschine coffeeMaker = new Kaffeemaschine();

        coffeeMaker.fillBeans(1500);
        coffeeMaker.fillWater(1700);
        coffeeMaker.setMug(200);
        coffeeMaker.getCoffee();

        System.out.println(coffeeMaker.getMugType(coffeeMaker.setMug(201)));
        System.out.println("GitTesting should be fun!");

        System.out.println("Nach dem ersten Commit wird es spannender.");
    }

}
