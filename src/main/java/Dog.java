public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed=breed;
    }
    public Dog(){
        super("Buddy",5);
        this.breed="Golden Retriever";
    }

    // makeNoise() method
    @Override
    public void makeNoise(){
        System.out.println("bark!");
    }

    // toString method
    @Override
    public String toString(){
        return getName() + ", " + getAge() + ", " + this.breed;
    }

    // Getter
    public String getBreed(){
        return this.breed;
    }

    // Setter
    public void setBreed(String breed){
        this.breed=breed;
    }
}