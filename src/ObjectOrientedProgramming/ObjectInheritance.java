public class ObjectInheritance {
    public static void main(String[] args){
        OfficeBuilding meins = new OfficeBuilding(2323464, 3243, "Bahnhof", "Li");
        meins.getStuff();

        ApartmentBuilding deins = new ApartmentBuilding(245, 356, "fag", "deins");
        deins.getStuff();
    }
}

class Buildings {
    // instance
    protected int numberOfFloors;
    protected String address;
    protected String owner;
    protected int height = 20;

    // constructor
    public Buildings(
                          int numberOfFloors,
                          String address,
                          String owner) {
        this.numberOfFloors = numberOfFloors;
        this.address = address;
        this.owner = owner;
    }
}

/**
 * static vs dynamic building:
 *
 */

class OfficeBuilding extends Buildings{  // inherits every stuff, when not private
    // the stuff can be overridden by more specific stuff
    // stuff can be methods, variables etc.
    private int numberOfOffices;
    protected int height = 100;

    /**
     * Constructor with super-method: see BasisObject for further info
     */
    public OfficeBuilding(int numerofOffices, int numberOfFloors, String address, String owner){
        super(numberOfFloors, address, owner);
        this.numberOfOffices = numerofOffices;
    }

    public void getStuff() {
        System.out.println(this.numberOfOffices + this.numberOfFloors +
                this.address + this.owner + this.height);
    }
}

class ApartmentBuilding extends Buildings{
    private int numberOfApartments;

    /**
     * Constructor with super-method: see BasisObject for further info
     */
    public ApartmentBuilding(int numberOfApartments, int numberOfFloors, String address, String owner){
        super(numberOfFloors, address, owner);
        this.numberOfApartments = numberOfApartments;
    }

    public void getStuff(){
        System.out.println(this.numberOfApartments + this.numberOfFloors +
                this.address + this.owner + this.height);
    }
}
