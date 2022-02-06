public class Bedroom {
    private String name;
    private WallVideo37 wall1;
    private WallVideo37 wall2;
    private WallVideo37 wall3;
    private WallVideo37 wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, WallVideo37 wall1, WallVideo37 wall2, WallVideo37 wall3, WallVideo37 wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed | ");
        bed.make();
    }
}
