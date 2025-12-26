import java.util.Scanner;
public class jv12_substring {
    static void main() {
        Scanner scanner=new Scanner(System.in);

        String email;

        System.out.println("Enter your email: ");
        email =scanner.nextLine();

        String username =email.substring (0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);

        System.out.println(username);
        System.out.println(domain);

        scanner.close();
    }
}
