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
    }
}
