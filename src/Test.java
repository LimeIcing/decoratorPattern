public class Test {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee);
        
        coffee = new WithMilk(coffee);
        System.out.println(coffee);

        coffee = new WithPumpkinSpice(coffee);
        System.out.println(coffee);

        coffee = new WithMilk(coffee);
        System.out.println(coffee);
    }
}
