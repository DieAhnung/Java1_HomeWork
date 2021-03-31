public class Employees {

    String name;
    String position;
    String email;
    int phoneNumber;
    int salary;
    int age;

    public Employees(String name, String position, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }


    public static void main(String[] args) {
        Employees[] employee = new Employees[5];


        employee[0] = new Employees("Иванов Иван Иванович", "Генеральный директор",
                "ivanov@miru", 798758678, 60000, 56);
        employee[1] = new Employees("Пертов Петр Петрович", "Главный бухгалтер",
                "petrov@miru", 798758679, 50000, 65);
        employee[2] = new Employees("Петрова Нина Ивановна", "Оператор",
                "petrovа@miru", 898758, 40000, 20);
        employee[3] = new Employees("Картонова Мария Игоревна", "Секретарь",
                "kartonova@miru", 798758859, 30000, 36);
        employee[4] = new Employees("Васильев Иван Викторович", "Переводчик",
                "vasilev@miru", 798757889, 20000, 19);

        for (Employees Employees : employee) {

            if (Employees.age >= 40) {
                System.out.println("Имя: " + Employees.name);
                System.out.println("Должность: " + Employees.position);
                System.out.println("Адрес электронной почты: " + Employees.email);
                System.out.println("Телефон: " + Employees.phoneNumber);
                System.out.println("Зарплата: " + Employees.salary);
                System.out.println("Возраст: " + Employees.age);


            }
        }
    }
}

