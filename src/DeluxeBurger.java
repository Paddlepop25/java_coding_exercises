public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.1, "Parmasean");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String item, double price) {
        System.out.println("Sorry, no additional items allowed");
    }

    @Override
    public void addHamburgerAddition2(String item, double price) {
        System.out.println("Sorry, no additional items allowed");
    }

    @Override
    public void addHamburgerAddition3(String item, double price) {
        System.out.println("Sorry, no additional items allowed");
    }

    @Override
    public void addHamburgerAddition4(String item, double price) {
        System.out.println("Sorry, no additional items allowed");
    }
}
