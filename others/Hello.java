package others;
class Hello
{
    public static void main(String args  [])
    {
        boolean b = true;
        boolean b2 = false;
        
        int age= 18;
        System.out.println(age);
        age = 20;
        System.out.println(age);
        boolean e = age>=18;
        if (e) {
            System.out.println("eligile for vote");
        }

        int i = 89;
        System.out.println("ones place:" + i % 10);

        float f = (float)10.6;
        System.err.println(f);
        f = f +1;
        System.out.println(f);
        
        double d = 11.5;
        System.out.println(d);

        String fname = "madhav ";
        String lname = "adiki";
        System.out.println(fname + lname);
        }
        
}
