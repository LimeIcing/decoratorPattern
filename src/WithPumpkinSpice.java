public class WithPumpkinSpice extends CoffeeDecorator {
    public WithPumpkinSpice(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getIngredients() {
        printTest();
        return super.getIngredients() + ", Pumpkin Spice";
    }

    private void printTest() {
        System.out.println("This is an added functionality from WithPumpkinSpice");
    }
}
