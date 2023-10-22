import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Igor", "Vladimirovich", "Petrov", "junior developer", "89674389123", 40000, new short[] {2000, 12, 12}),
                new Employee("Vladimir", "Konstantinovich", "Ivanov", "project manager", "89145632389", 50000, new short[] {1990, 4, 29}),
                new Employee("Konstantin", "Egorovich", "Lavrov", "accountant", "89453726893", 52000, new short[] {1977, 10, 5}),
                new Employee("Egor", "Olegovich", "Ivanov", "middle developer", "89236758392", 60000, new short[] {1989, 3, 25}),
                new Employee("Oleg", "Igorevich", "Peskov", "fitter", "89823409812", 51000, new short[] {1975, 3, 10})};
        for (Employee e : employees){
            e.info();
        }
        System.out.println(employees[1].olderThan(employees[2]));
        Employee[] workers = new Employee[6];
        for (int i = 0; i < 5; i++){
            workers[i] = employees[i];
        }
        workers[5] = new Director("Pavel", "Olegovich", "Andreev", "director", "89998887766", 60000, new short[] {1970, 1, 10});
        Director.increaser(workers, 0, 10);
        for (Employee e : workers){
            System.out.println(e.salary);
        }
    }
}