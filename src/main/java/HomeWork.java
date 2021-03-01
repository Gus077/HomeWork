public class HomeWork {

    public static void main(String[] args) {


        Cat cat = new Cat("Тихон");
        Cat cat1 = new Cat("Барсик");
        Dog dog = new Dog("Жучка");

        cat.run(40);
        dog.run(100);

        cat.swim(10);
        dog.swim(9);

        System.out.println("Создано животных: " + Animal.animals);
        System.out.println("Создано кошек: " + Cat.cats);
        System.out.println("Создано собак: " + Dog.dogs);

    }
}