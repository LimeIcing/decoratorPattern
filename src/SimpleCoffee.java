public class SimpleCoffee implements Coffee{
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }

    @Override
    public String toString() {
        return "Cost: " + getCost() + "\nIngredients: " + getIngredients();
    }
}
