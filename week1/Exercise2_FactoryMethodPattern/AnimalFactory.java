class AnimalFactory
{
    public Animal createAnimal(String animalType)
    {
        switch(animalType.toUpperCase())
        {
            case "DOG":
                return new Dog();
            case "CAT":
                return new Cat();
            default:
                throw new IllegalArgumentException("Invalid animal type");
        }
    }
}