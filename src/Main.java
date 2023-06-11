public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович", 1, 50_000);
        employees[1] = new Employee("Петров Петр Петрович", 1, 51_000);
        employees[2] = new Employee("Сергеев Сергей Сергеевич", 2, 52_000);
        employees[3] = new Employee("Алексеев Алексей Алексеевич", 2, 53_000);
        employees[4] = new Employee("Андреев Андрей Андреевич", 3, 54_000);
        employees[5] = new Employee("Антонов Антон Антонович", 3, 55_000);
        employees[6] = new Employee("Юров Юрий Юрьевич", 4, 40_000);
        employees[7] = new Employee("Максимов Максим Максимович", 4, 41_000);
        employees[8] = new Employee("Данилов Даниил Данилович", 5, 42_000);
        employees[9] = new Employee("Русланов Руслан Русланович", 5, 43_000);
        printAllEmployees();
        System.out.println();

        System.out.println("Cумма затрат на зарплаты в месяц: " + sum());
        System.out.println();

        Employee minSalary = minSalary();
        if (minSalary != null) {
            System.out.println("Cотрудник с минимальной зарплатой: " + minSalary());
        }
        System.out.println();

        Employee maxSalary = maxSalary();
        if (maxSalary != null) {
            System.out.println("Cотрудник с максимальной зарплатой: " + maxSalary());
        }
        System.out.println();

        System.out.println("Среднее значение зарплат: " + midSalary());
        System.out.println();

        System.out.println("Список всех сотрудников:");
        printFio();
    }

    static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }

    static double sum() {
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    static Employee minSalary() {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    static Employee maxSalary() {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    static double midSalary() {
        return sum() / employees.length;
    }

    static void printFio() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getFio());
        }
    }
}