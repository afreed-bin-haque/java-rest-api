public class employeeDemo {
    String name;
    String phone;
    boolean status;
    int otp;

    public employeeDemo(String employeeName, String employeePhone, int otp, boolean status) {
        this.name = employeeName;
        this.phone = employeePhone;
        this.otp = otp;
        this.status = status;
    }

    public void displayDetails() {
        System.out.println(
                "New employee name is " + name +
                " and his phone number - " + phone +
                ". Current otp is: " + otp +
                " His status is: " + status
        );
    }

    public static void main(String[] args) {
        employeeDemo ed = new employeeDemo("Afreed Bin Haque", "01839194860", 1212, true);
        ed.displayDetails();
    }
}
