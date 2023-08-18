public interface Animal
{
    void feed();

    void makeSound();
}

class Monkey implements ClimbAnimal
{

    @Override
    public void feed() {
  //      System.out.println(" MONKEY");
        System.out.println(" ----------------------- ");
        System.out.println(" monkey eats banana");

    }

    @Override
    public void makeSound() {
        System.out.println(" A whoop is a sound made by a monkey. ");

    }

    @Override
    public void climb() {
        System.out.println("  monkeys have a tail which helps them to climb by using it like a string and wrapping it around tree branches");

    }
}

