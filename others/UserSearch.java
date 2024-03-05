package others;

import java.util.Scanner;

public class UserSearch {
    public static void main(String[] args) {
        String[] users = { "madhav", "sree", "manas", "srijani" };
        String[] pwd = { "123", "345", "456", "567" };

        int i = 0;
        // printing users
        while (i < users.length) {
            System.out.println(users[i]);
            i++;
        }

        // finding user
        System.out.println("enter user:");
        Scanner scanner = new Scanner(System.in);
        String u = scanner.next();
        i = 0;
        boolean s = false;
        while (i < users.length) {
            if (u.equalsIgnoreCase(users[i])) {
                s = true;
                System.out.println("welcome users" + u);
                break;
            }
            i++;
        }
        if (s == false)
            System.out.println("user doesnt exist please enter correct user");

    }

}
