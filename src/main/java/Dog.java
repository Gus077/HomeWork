public class Dog extends Animal{

    static int dogs;
    Dog(String name){
        super(name);
        dogs++;
    }

    void run (int x) {
        if (x < 500) {
            System.out.println(name + " пробежал " + x + " метров");
        } else return;
    }

    void swim(int x){
        if (x < 10) {
            System.out.println(name + " проплыла " + x + " метров");
        } else return;
    }
}
