package Classes;

public class UserApp {
    public static void main(String[] args) {
        User user = new User("hare krishna", "xyz5645645"); //
        
        user.printuserdata();


        User u2 = new User();
        u2.setUsername("rama");
        u2.setPassword("123456789");
        System.out.println("Hello welcome back " + u2.getUsername());
    }

}
