import java.util.Objects;

public class EmployeeService {
    public static double calcSumSalary(Employee[] employeeList) {
        double sumSalary = 0;
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] != null) {
                sumSalary += employeeList[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату составила: " + sumSalary + " руб." + "\n");
        return sumSalary;
    }

    public static double findMinSalary(Employee[] employeeList) {
        double minSalary = 0; // присваиваем первое значение из списка
        int j = 0; // задаём переменную для запоминания индекса мин. зарплаты
        for (int i = 1; i < employeeList.length; i++) {
            if (employeeList[i] != null) { // проверка на пустую ячейку
                if (employeeList[i].getSalary() < minSalary) { // сравнение по списку
                    minSalary = employeeList[i].getSalary(); // присваивание значения по условию
                    j = i; // запоминает индекс минимальной зарплаты
                }
            }
        }
        System.out.println("У сотрудника " + employeeList[j] + " минимальная зарплата" + "\n"); // вынести за пределы цикла
        return minSalary;
    }

    public static double findMaxSalary(Employee[] employeeList) {
        double maxSalary = 0;
        int j = 0;
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] != null) {
                if (employeeList[i].getSalary() > maxSalary) {
                    maxSalary = employeeList[i].getSalary();
                    j = i;
                }
            }
        }
        System.out.println("У сотрудника " + employeeList[j] + " максимальная зарплата" + "\n");
        return maxSalary;
    }

    public static void employeeList1(Employee[] employeeList) {
        for (int i = 0; i < employeeList.length; i++) {
            System.out.println((i + 1) + ". " + employeeList[i]);
        }
    }

    public static double calcAverageSalary(Employee[] employeeList) { // вычисление средней зарплаты
        double averageSalary;
        int salaryCount = 0;
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] != null) {
                salaryCount++;
            }
        }
        averageSalary = calcSumSalary(employeeList) / salaryCount;
        System.out.println("Средняя зарплата составляет " + averageSalary + " руб." + "\n");
        return averageSalary;
    }

    public static void fullNameEmployee(Employee[] employeeList) {
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] != null) {
                String name = (i + 1) + ". " + employeeList[i].getEmployeeSurname() + " " + employeeList[i].getEmployeeFirstName() + " " + employeeList[i].getEmployeeSecondName();
                System.out.print("\n" + name);
            }
        }

    }
}