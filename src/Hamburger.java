public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    // possible additions
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1 (String item, double price) {
        this.addition1Name = item;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2 (String item, double price) {
        this.addition2Name = item;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3 (String item, double price) {
        this.addition3Name = item;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4 (String item, double price) {
        this.addition4Name = item;
        this.addition4Price = price;
    }

    public double itemizeHamburger () {
        double basePrice = this.price;

        System.out.println(this.name + " burger with " + this.meat + " on a " + this.breadRollType + " bread roll costs $" + this.price);

        if (this.addition1Name != null) {
            basePrice += this.addition1Price;
            System.out.println(this.addition1Name + " has been added for an extra $" + this.addition1Price);
        }
        if (this.addition2Name != null) {
            basePrice += this.addition2Price;
            System.out.println(this.addition2Name + " has been added for an extra $" + this.addition2Price);
        }
        if (this.addition3Name != null) {
            basePrice += this.addition3Price;
            System.out.println(this.addition3Name + " has been added for an extra $" + this.addition3Price);
        }
        if (this.addition4Name != null) {
            basePrice += this.addition4Price;
            System.out.println(this.addition4Name + " has been added for an extra $" + this.addition4Price);
        }
        return basePrice;
    }
}
