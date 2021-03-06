public class Plate {

    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (enoughFood(n)) {
            food -= n;
        } else {
            System.out.println("В тарелке не достаточно еды");
            return;
        }
    }

    public void info(){
        System.out.println("Тарелка: " + food);
    }

    public boolean enoughFood (int appetite){
        if (appetite > food){
            return false;
        }
        return true;
    }

    public void addFood (int n){
        this.food += n;
    }
}
