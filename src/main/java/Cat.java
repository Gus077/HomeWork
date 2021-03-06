public class Cat {

    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate p){
        if (p.enoughFood(appetite) && !fullness){
            p.decreaseFood(appetite);
            fullness = true;
            System.out.println(name + " наелся");
        } else if (fullness){
            System.out.println(name + " уже поел");
        } else System.out.println("В тарелке недостаточно еды для - " + name);
    }
}
