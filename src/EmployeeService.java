public class EmployeeService {

    // Считаем сумму зарплат:
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

    //Ищем минималку:
    public static double findMinSalary(Employee[] employeeList) {
        int count = 0;
        for (; count < employeeList.length; ) {
            if (employeeList[count] != null) {
                break;
            }
            count++;
        }
        double minSalary = employeeList[count].getSalary(); // присваиваем первое значение из списка
        int j = 0; // задаём переменную для запоминания индекса мин. зарплаты
        for (count++; count < employeeList.length; count++) {
            if (employeeList[count] != null) { // проверка на пустую ячейку
                if (employeeList[count].getSalary() < minSalary) { // сравнение по списку
                    minSalary = employeeList[count].getSalary(); // присваивание значения по условию
                    j = count; // запоминает индекс минимальной зарплаты
                }
            }
        }
        System.out.println("У сотрудника " + employeeList[j] + " минимальная зарплата" + "\n"); // вынести за пределы цикла
        return minSalary;
    }

    // Ищем максималку:
    public static double findMaxSalary(Employee[] employeeList) { // максимальная зарплата
        int count = 0;
        for (; count < employeeList.length; ) {
            if (employeeList[count] != null) {
                break;
            }
            count++;
        }
        double maxSalary = employeeList[count].getSalary();
        int j = 0;
        for (count++; count < employeeList.length; count++) {
            if (employeeList[count] != null) {
                if (employeeList[count].getSalary() > maxSalary) {
                    maxSalary = employeeList[count].getSalary();
                    j = count;
                }
            }
        }
        System.out.println("У сотрудника " + employeeList[j] + " максимальная зарплата" + "\n");
        return maxSalary;
    }

    // Список сотрудников со всеми данными:
    public static void employeeList1(Employee[] employeeList) {
        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(i + 1 + ". " + employeeList[i]);
        }
    }

    // Вычисление средней зарплаты:
    public static double calcAverageSalary(Employee[] employeeList) {
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

    // Печатаем список по ФИО:
    public static void fullNameEmployee(Employee[] employeeList) { // вывод ФИО

        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] != null) {
                int id = employeeList[i].getId();
                String name = id + ". " + employeeList[i].getEmployeeSurname() + " " + employeeList[i].getEmployeeFirstName() + " " + employeeList[i].getEmployeeSecondName();
                System.out.print("\n" + name);
            }
        }
    }
}
