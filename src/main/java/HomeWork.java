public class HomeWork {

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик",10);
        cats[1] = new Cat("Тишка", 13);
        cats[2] = new Cat("Мурка", 8);

        Plate plate = new Plate(30);

        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
        }

        plate.addFood(10);

        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
        }
    }
}