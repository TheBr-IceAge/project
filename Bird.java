public class Bird {
    private String name;
    private String species;
    private int wingspan;

    public Bird(String name, String species, int wingspan) {
        this.name = name;
        this.species = species;
        this.wingspan = wingspan;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }

    @Override
    public String toString() {
        return "Bird[Name: " + name + ", Species: " + species + ", Wingspan: " + wingspan + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Bird) {
            Bird other = (Bird) o;
            return this.name.equals(other.name) && this.species.equals(other.species) && this.wingspan == other.wingspan;
        }
        return false;
    }
}

public class Parrot extends Bird {
    private String color;

    public Parrot(String name, String species, int wingspan, String color) {
        super(name, species, wingspan);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void fly() {
        System.out.println(name + " the parrot is flying around.");
    }

    @Override
    public String toString() {
        return "Parrot[Name: " + getName() + ", Species: " + getSpecies() + ", Wingspan: " + getWingspan() + ", Color: " + color + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Parrot) {
            Parrot other = (Parrot) o;
            return super.equals(other) && this.color.equals(other.color);
        }
        return false;
    }
}

public class Eagle extends Bird {
    private String habitat;

    public Eagle(String name, String species, int wingspan, String habitat) {
        super(name, species, wingspan);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public void fly() {
        System.out.println(name + " the eagle is soaring high in the sky.");
    }

    @Override
    public String toString() {
        return "Eagle[Name: " + getName() + ", Species: " + getSpecies() + ", Wingspan: " + getWingspan() + ", Habitat: " + habitat + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Eagle) {
            Eagle other = (Eagle) o;
            return super.equals(other) && this.habitat.equals(other.habitat);
        }
        return false;
    }
}
