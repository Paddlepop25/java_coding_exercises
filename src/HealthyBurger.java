public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Vegan", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String item, double price) {
        this.healthyExtra1Name = item;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String item, double price) {
        this.healthyExtra2Name = item;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double priceOfHealthyBurger = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            priceOfHealthyBurger += this.healthyExtra1Price;
            System.out.println(this.healthyExtra1Name + " has been added for an extra $" + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            priceOfHealthyBurger += this.healthyExtra2Price;
            System.out.println(this.healthyExtra2Name + " has been added for an extra $" + this.healthyExtra2Price);
        }
        return priceOfHealthyBurger;
    }
}
