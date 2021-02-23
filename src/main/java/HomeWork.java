public class HomeWork {

    public static void main(String[] args) {

        Staff[] person = new Staff[5];

        person[0] = new Staff("Иванов Александр Петрович", "Механик", "alex111@mail.ru",
                30000, 31);
        person[1] = new Staff("Петров Иван Константинович", "Инженер",
                "ivan313@mail.ru", 35000, 28);
        person[2] = new Staff("Мязина Кристина Андреевна", "Помощник руководителя",
                "Kristi@maul.ru", 29000, 26);
        person[3] = new Staff("Грязнов Станислав Андреевич", "Зам. директора",
                "stas@maul.ru", 45000, 41);
        person[4] = new Staff("Сидоров Олег Викторович", "Директор",
                "Oleg@maul.ru", 55000, 52);

        for (int i = 0; i < person.length; i++) {
            if (person[i].age > 40) {
                person[i].printStaffInfo();
            }
        }
    }
}