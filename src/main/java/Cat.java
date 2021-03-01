public class Cat extends Animal{

    static int cats = 0;

    Cat(String name){
        super(name);
        cats++;
    }

    void run (int x) {
        if (x < 200) {
            System.out.println(name + " пробежал " + x + " метров");
        } else return;
    }

    void swim(int x){
            System.out.println(name + " не умеет плавать :(");
    }
}
