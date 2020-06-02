package exceptii.ex5;

public class Exe2 {
    public static void main(String[] args) {

        try (R2 r1 = new R2("res 1");
             R2 r2 = new R2("res 2")) {
            // some logic here
            // at the end of try block, close() method is called on every resource opened, in reverse order
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("finally executes");
        }
    }
}
