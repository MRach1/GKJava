public class Director extends Employee{

    public Director(String name, String midName, String surName, String position, String phoneNumber, int salary, short[] birth) {
        super(name, midName, surName, position, phoneNumber, salary, birth);
    }

    public static void increaser(Employee[] emps, int age, double percent) {
        int n = emps.length;
        double mul = 1 + (percent / 100);
        for (Employee emp : emps) {
            if (emp.getAge() > age & emp.getClass() != Director.class) {
                emp.salary = (int) (emp.salary * mul);
            }
        }
    }
}
