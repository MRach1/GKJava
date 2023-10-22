import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Employee {
    protected String name;
    protected String midName;
    protected String surName;
    protected String position;
    protected String phoneNumber;
    protected int salary;
    protected short[] birth;

    public Employee(String name, String midName, String surName, String position, String phoneNumber, int salary, short[] birth) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birth = birth;
    }

    public short getAge() {
        LocalDate ld = LocalDate.now();
        short years = (short) (ld.getYear() - birth[0]);
        if (ld.getMonthValue() < birth[1]) {
            years--;
        } else if (ld.getMonthValue() == birth[1]) {
            if (ld.getDayOfMonth() < birth[2]) {
                years--;
            }

        }
        return years;
    }

    public int getSalary() {
        return salary;
    }

    public String getMidName() {
        return midName;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public String getSurName() {
        return surName;
    }

    public void info() {
        short age = getAge();
        System.out.println("name = " + name + System.lineSeparator() +
                "midname = " + midName + System.lineSeparator() +
                "surName = " + surName + System.lineSeparator() +
                "age = " + age + System.lineSeparator() +
                "position = " + position + System.lineSeparator() +
                "salary = " + salary);

    }


    public static int averageSalary(Employee[] emps) {
        int n = emps.length;
        int s = 0;
        for (Employee e : emps) {
            s += e.salary;
        }
        return s / n;
    }

    public static int averageAge(Employee[] emps) {
        int n = emps.length;
        int s = 0;
        for (Employee e : emps) {
            s += e.getAge();
        }
        return s / n;
    }

    public String compareTo(Employee e) {
        int res = comparator(e);
        if (res > 0){
            return "Старше";
        } else if (res == 0) {
            return "Одного возраста";
        }
        else {
            return "Младше";
        }
    }

    private short comparator(Employee emp) {
        short years = (short) (birth[0] - emp.birth[0]);
        if (years != 0) {
            return years;
        } else {
            short months = (short) (birth[1] - emp.birth[1]);
            if (months != 0) {
                return months;
            } else {
                return (short) (birth[2] - emp.birth[2]);
            }
        }
    }

    public boolean olderThan(Employee emp) {
        short years = (short) (birth[0] - emp.birth[0]);
        short months = (short) (birth[1] - emp.birth[1]);
        short days = (short) (birth[2] - emp.birth[2]);
        short res = (short) (years * 365 + months * 30 + days);
        return res < 0;
    }
}