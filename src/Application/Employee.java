package Application;

public class Employee {
    private String firstName;
    private String lastName;
    private String emailId;
    private double salary;
    private boolean isMarried;
    private boolean fullTime;
    private int numberOfHours;

    // TODO: To prevent the client from accessing this constructor ...
    private Employee(String firstName,
                    String lastName,
                    String emailId,
                    double salary,
                    boolean isMarried,
                    boolean fullTime,
                    int numberOfHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.salary = salary;
        this.isMarried = isMarried;
        this.fullTime = fullTime;
        this.numberOfHours = numberOfHours;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public static class BuilderEmp {
        private String firstName;
        private String lastName;
        private String emailId;
        private double salary;
        private boolean isMarried;
        private boolean fullTime;
        private int numberOfHours;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setMarried(boolean married) {
            isMarried = married;
        }

        public void setFullTime(boolean fullTime) {
            this.fullTime = fullTime;
        }

        public void setNumberOfHours(int numberOfHours) {
            this.numberOfHours = numberOfHours;
        }

        @Override
        public String toString() {
            return "BuilderEmp{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", emailId='" + emailId + '\'' +
                    ", salary=" + salary +
                    ", isMarried=" + isMarried +
                    ", fullTime=" + fullTime +
                    ", numberOfHours=" + numberOfHours +
                    '}';
        }

        public Employee build(){
            Employee employee = new Employee( firstName, lastName, emailId, salary, isMarried, fullTime, numberOfHours);
            employee.setEmailId(emailId);
            employee.setFirstName(firstName);
            employee.setFullTime(fullTime);
            employee.setMarried(isMarried);
            employee.setLastName(lastName);
            employee.setSalary(salary);
            employee.setNumberOfHours(numberOfHours);
            return employee;
        }

        public String getDetails(){
            return toString();
        }
    }
}
