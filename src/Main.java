public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа №1. Базовая часть.");

        Employee[] employeeList = new Employee[]{// создаём массив с данными сотрудников

                new Employee("Боттер", "Ангелина", "Аркадиевна", 1, "Начальник отдела", 94560),
                new Employee("Рогожкин", "Илья", "Сергеевич", 1, "Технолог 1 категории", 56200),
                new Employee("Замяти", "Андрей", "Александрович", 5, "Водитель", 45890),
                new Employee("Малинина", "Мария", "Владимировна", 1, "Начальник отдела", 93600),
                new Employee("Тихонов", "Андрей", "Александрович", 4, "Начальник отдела", 91400),
                new Employee("Семёнов", "Алексей", "Николаевич", 4, "Ведущий инженер", 65000),
                new Employee("Никешин", "Владимир", "Арнольдович", 3, "Начальник отдела", 89800),
                new Employee("Загнибеда", "Владислав", "Аркадиевич", 3, "Системный администратор", 57400),
                null,
                new Employee("Коваль", "Людмила", "Дмитриевна", 2, "Ведущий технолог", 64230),
        };

        EmployeeService.findMaxSalary(employeeList); // max зарплата
        EmployeeService.findMinSalary(employeeList); // min зарплата
        EmployeeService.calcSumSalary(employeeList); // сумма зарплат
        EmployeeService.printSumSalary(employeeList); // средняя зарплата
        EmployeeService.employeeList1(employeeList); // список сотрудников со всеми данными
        EmployeeService.fullNameEmployee(employeeList); // список ФИО

    }
}