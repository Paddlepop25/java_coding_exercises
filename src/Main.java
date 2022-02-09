public class Main {

    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
        System.out.println(BarkingDog.shouldWakeUp(true, -8));

        // SimpleCalculator
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());

        // Person
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Lennon");
        System.out.println("fullname = " + person.getFullName());
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());

        // Wall Area
        Wall wall = new Wall(5,4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

        // Point
        // don't quite understand, refer to video 80

        // Carpet Cost Calculator
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator carpetCalculator = new Calculator(floor, carpet);
        System.out.println("Total cost: " + carpetCalculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        carpetCalculator = new Calculator(floor, carpet);
        System.out.println("Total cost: " + carpetCalculator.getTotalCost());

        // Complex Operations
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real = " + number.getReal());
        System.out.println("number.imaginary = " + number.getImaginary());

        // Cylinder
        Circle circle = new Circle(3.75);
        System.out.println("circle radius: " + circle.getRadius());
        System.out.println("circle area: " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder radius: " + cylinder.getRadius());
        System.out.println("cylinder radius: " + cylinder.getHeight());
        System.out.println("cylinder area: " + cylinder.getArea());
        System.out.println("cylinder radius: " + cylinder.getVolume());

        // Pool Area
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle width: " + rectangle.getWidth());
        System.out.println("rectangle length: " + rectangle.getLength());
        System.out.println("rectangle area: " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid width: " + cuboid.getWidth());
        System.out.println("cylinder length: " + cuboid.getLength());
        System.out.println("cuboid area: " + cuboid.getArea());
        System.out.println("cuboid radius: " + cuboid.getHeight());
        System.out.println("cuboid radius: " + cuboid.getVolume());

        // Bedroom: Composition Coding Exercise 37
        WallVideo37 wall1 = new WallVideo37("North");
        WallVideo37 wall2 = new WallVideo37("East");
        WallVideo37 wall3 = new WallVideo37("South");
        WallVideo37 wall4 = new WallVideo37("West");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedroom = new Bedroom("Linda", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

        // Encapsulation: Coding Exercise 38
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(9);
        System.out.println("Pages printed was " + pagesPrinted + " and new total print count = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " and new total print count = " + printer.getPagesPrinted());

        // Polymorphism: Coding Exercise 39
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        Ford ford  = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        Holden holden  = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        // Bill's Burgers - Master OOP Challenge
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        hamburger.addHamburgerAddition4("Sauce", 0.3);
        System.out.println("Total burger price is $ " + hamburger.itemizeHamburger());

        System.out.println();
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Chips", 2.75); // not allowed
        System.out.println("Total burger price is $ " +  deluxeBurger.itemizeHamburger());

        System.out.println();
        HealthyBurger healthyBurger = new HealthyBurger("Impossible", 5.67);
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total burger price is $ " + healthyBurger.itemizeHamburger());

        // Minimum Element
        System.out.println();
//        MinimumElement game = new MinimumElement();
//        game.readInteger();
//        game.readElements(5);
//        game.findMin(new int[] {2, -4, 8, -19, 5});
    }
}
