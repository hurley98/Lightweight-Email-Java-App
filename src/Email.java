import java.util.Locale;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private String companySuffix = "company.com";
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    //Receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        //Call method asking for department - return the department
        this.department = setDepartment();

        //Call method that returns random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine elements to generate email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;

    }

    //Ask for department
    private String setDepartment(){
        System.out.print("New worker: " + firstName + " \nDepartment codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n  : " );
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if(departmentChoice == 1){return "Sales";}
        else if (departmentChoice == 2) {return "Development";}
        else if (departmentChoice == 3) {return "Accounting";}
        else {return "";}


    }

    //Generate random poassword
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change password
    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public int getMailBoxCapacity(){ return mailBoxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }

    public String showInfo(){
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailBox Capacity: " + mailBoxCapacity + " mb" +
                "\nPassword: " + password +
                "\nAlternative Email: " + alternateEmail
                ;
    }


}
