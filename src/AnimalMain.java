public class AnimalMain {
    public static void main(String[] args)
    {
        Lion lion = new Lion();
        System.out.println("LION");
        lion.feed();
        lion.makeSound();

        Penguin penguin = new Penguin();
        System.out.println("PENGUIN");
        penguin.feed();
        penguin.makeSound();
        penguin.swim();

        Monkey monkey = new Monkey();
        System.out.println("MONKEY ");
        monkey.feed();
        monkey.makeSound();
        monkey.climb();
    }
}


