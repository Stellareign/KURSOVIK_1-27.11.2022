import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа №1. ИП + 'Рога и копыта М+'");

        Employee[] employeeList = new Employee[10]; // создаём массив с данными сотрудников из стринга

        employeeList[0] = new Employee("Кокорина", "Марина", "Андреевна", 1, "Ведущий технолог", 63500);
        employeeList[1] = new Employee("Рогожкин", "Илья", "Сергеевич", 1, "Технолог 1 категории", 56200);
        employeeList[2] = new Employee("Замятина", "Анна", "Александровна", 5, "Водитель", 45890);
        employeeList[3] = new Employee("Малинина", "Мария", "Владимировна", 1, "Начальник отдела", 93600);
        employeeList[4] = new Employee("Тихонов", "Андрей", "Александрович", 4, "Начальник отдела", 91400);
        employeeList[5] = new Employee("Семёнов", "Алексей", "Николаевич", 4, "Ведущий инженер", 65000);
        employeeList[6] = new Employee("Никешин", "Владимир", "Арнольдович", 3, "Начальник отдела", 89800);
        employeeList[7] = new Employee("Загнибеда", "Владислав", "Аркадиевич", 3, "Системный администратор", 57400);
        employeeList[8] = new Employee("Молчанова", "Елена", "Анатольевна", 2, "Начальник отдела", 92000);
        employeeList[9] = new Employee("Коваль", "Людмила", "Дмитриевна", 2, "Ведущий технолог", 64230);


        EmployeeService.findMaxSalary(employeeList); // max зарплата
        EmployeeService.findMinSalary(employeeList); // min зарплата
        EmployeeService.calcSumSalary(employeeList); // сумма зарплат
        EmployeeService.calcAverageSalary(employeeList); // средняя зарплата
        EmployeeService.employeeList1(employeeList); // список сотрудников со всеми данными
        EmployeeService.fullNameEmployee(employeeList); // список ФИО

    }
}