public class Animal {
    protected String name;
    static int animals = 0;

    Animal(String name){
    this.name = name;
    animals++;
    }

    void run (int x) {
            System.out.println(name + " пробежал " + x + " метров");
    }

    void swim(int x){
        System.out.println(name + " проплыл " + x + " метров");
    }
}
