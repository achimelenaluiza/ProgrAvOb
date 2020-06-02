package exceptii.ex1;

public class Test1 {
    public static void main(String[] args) {
        try {
//			System.out.println("exiting before catch and finally");
//			System.exit(0);  //
            m1();
            Object obj = new Object();
            // ClassCastException
            String s = (String) obj;
            System.out.println(s);
        }catch (StackOverflowError exc){ // putem folosi acelasi nume de variabila, au scope diferit
            System.out.println(exc);
//			obj = "";  // nu poatefi folosita aici, out of scope
//			System.exit(0); // nu se mai executa finally
            return;
        }catch (ClassCastException exc){
            System.out.println(exc);
        }
        finally {
            // se executa chiar daca avem return in try sau catch
            // nu se executa cand apelam System.exit(0) sau posibil cand avem un OutOfMemoryException
            System.out.println("in finally");
        }
    }
    // throws StackOverflowError
    public static void m1(){
        m1();
    }
}
