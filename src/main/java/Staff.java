public class Staff {
    String name;
    String position;
    String email;
    int pay;
    int age;

    public Staff(String name, String position, String email, int pay, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.pay = pay;
        this.age = age;
    }

   void printStaffInfo(){
        System.out.println("Ф.И.О: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Заработная плата: " + pay);
        System.out.println("Возраст: " + age);
    }
}

