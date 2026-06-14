public class Main
{
    public static void main(String args[])
    {
        AnimalFactory factory = new AnimalFactory();

        Animal animal1 = factory.createAnimal("DOG");
        animal1.sound();

        Animal animal2 = factory.createAnimal("CAT");
        animal2.sound();
    }
}