public class HourlyRateCalculator {
    // Method to calculate hourly rate
    public static double calculateHourlyRate(double semiMonthlyRate) {
        // Assuming a semi-monthly period has around 80 hours of work
        int hoursInSemiMonthlyPeriod = 80;
        return semiMonthlyRate / 2 / hoursInSemiMonthlyPeriod;
    }

    public static void main(String[] args) {
        // Define employee data structure
        class Employee {
            String firstName;
            String lastName;
            double semiMonthlyRate;

            Employee(String firstName, String lastName, double semiMonthlyRate) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.semiMonthlyRate = semiMonthlyRate;
            }
        }

        // Initialize employee data
        Employee[] employees = {
            new Employee("Manuel III", "Garcia", 45000),
            new Employee("Antonio", "Lim", 30000),
            new Employee("Bianca Sofia", "Aquino", 30000),
            new Employee("Isabella", "Reyes", 30000),
            new Employee("Eduard", "Hernandez", 26335),
            new Employee("Andrea Mae", "Villanueva", 26335),
            new Employee("Brad", "San Jose", 21488),
            new Employee("Alice", "Romualdez", 11250),
            new Employee("Rosie", "Atienza", 11250),
            new Employee("Roderick", "Alvaro", 26335),
            new Employee("Anthony", "Salcedo", 25413),
            new Employee("Josie", "Lopez", 19238),
            new Employee("Martha", "Farala", 12000),
            new Employee("Leila", "Martinez", 12000),
            new Employee("Fredrick", "Romualdez", 26750),
            new Employee("Christian", "Mata", 21488),
            new Employee("Selena", "De Leon", 20925),
            new Employee("Allison", "San Jose", 11250),
            new Employee("Cydney", "Rosario", 11250),
            new Employee("Mark", "Bautista", 11625),
            new Employee("Darlene", "Lazaro", 11625),
            new Employee("Kolby", "Delos Santos", 12000),
            new Employee("Vella", "Santos", 11250),
            new Employee("Tomas", "Del Rosario", 11250),
            new Employee("Jacklyn", "Tolentino", 12000),
            new Employee("Percival", "Gutierrez", 12375),
            new Employee("Garfield", "Manalaysay", 12375),
            new Employee("Lizeth", "Villegas", 12000),
            new Employee("Carol", "Ramos", 11250),
            new Employee("Emelia", "Maceda", 11250),
            new Employee("Delia", "Aguilar", 11250),
            new Employee("John Rafael", "Castro", 26335),
            new Employee("Carlos Ian", "Martinez", 26335),
            new Employee("Beatriz", "Santos", 26335)
        };

        // Calculate and print hourly rates for each employee
        for (Employee employee : employees) {
            double hourlyRate = calculateHourlyRate(employee.semiMonthlyRate);
            System.out.println(employee.firstName + " " + employee.lastName + ": Hourly Rate = " + hourlyRate);
        }
    }
}

