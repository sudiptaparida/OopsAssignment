public class Penguin implements SwimAnimal {
    @Override
    public void feed() {
        System.out.println(" ------------------------ ");
        System.out.println("Penguins eat krill, squids, and fishes.  ");

    }

    @Override
    public void makeSound() {
        System.out.println(" Penguin sounds the iconic braying call to the joyful gakkering sound");


    }

    @Override
    public void swim() {
        System.out.println(" Most penguins swim underwater at around four to seven miles per hour (mph)");

    }
}
