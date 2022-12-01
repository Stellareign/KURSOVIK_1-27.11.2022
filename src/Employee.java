import java.util.Objects;

// данные о сотрудниках
public class Employee {
    private String employeeFirstName; // final или нет? ФИО ведь может измениться полностью.
    private String employeeSecondName;
    private String employeeSurname;
    private int department;
    private String positionInDepartment;
    private double salary;
    private static int counter = 1; // статический счётчик. + понять, чтобы запомнить....
    private final int id; // инициализировать перед конструктором, если внутри, то не выводится в toString

    public Employee(String employeeSurname, String employeeFirstName, String employeeSecondName, int department,
                    String positionInDepartment, double salary) { // если переменная final, то в конструктор по умолчанию попадает только она.
        // id добавляем в return, данные сотрудника вводятся вручную, id присваивается автоматически
        this.employeeFirstName = employeeFirstName;
        this.employeeSecondName = employeeSecondName;
        this.employeeSurname = employeeSurname;
        this.department = department;
        this.positionInDepartment = positionInDepartment;
        this.salary = salary;

        id = counter;
        counter++;
    }

    @Override
    public String toString() {
        return "Табельный номер сотрудника: " + id + ", ФИО: " + employeeSurname + " " + employeeFirstName + " " + employeeSecondName +
                ", отдел: " + department + ", " + positionInDepartment + ", оклад: " + salary + " руб."; // выводим ВСЕ данные о сотруднике
    }

    public String getEmployeeFirstName() { // генерим геттеры
        return employeeFirstName;
    }

    public String getEmployeeSecondName() {
        return employeeSecondName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public int getDepartment() {
        return department;
    }

    public String getPositionInDepartment() {
        return positionInDepartment;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }


    public Employee setDepartment(int department) { // генерим сеттеры. Я бы и ФИО сюда добавила. Всякое бывает.
        this.department = department;
        return this;
    }

    public Employee setPositionInDepartment(String positionInDepartment) {
        this.positionInDepartment = positionInDepartment;
        return this;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id; // сравниваем по id
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // сравниваем хэш по id
    }

    private static EmployeeService minSalary;

}
