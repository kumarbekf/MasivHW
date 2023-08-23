import java.util.Scanner;
import java.util.Set;
public class Administrator {
    private final String login;
    private final String password;

    public Administrator(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void getAllEmployees(Set<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(password)) {
            System.out.println("All employees:");
            for (Employee employee : employees) {
                System.out.println(employee.getName());
            }
        } else {
            System.out.println("Incorrect password!");
        }
    }

    public void deleteAll(Set<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(password)) {
            employees.clear();
            System.out.println("All employees have been deleted!");
        } else {
            System.out.println("Incorrect password!");
        }
    }
}
