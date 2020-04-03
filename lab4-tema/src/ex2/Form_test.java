package ex2;

public class Form_test {

    public static void main(String[] args) {

        int num = 3;

        Form[] forms = new Form[3];
        forms[0] = new Triangle("red", 3.3f, 5.2f);
        forms[1] = new Circle("white", 2.1f);
        forms[2] = new Triangle("blue", 1, 4);

        System.out.println("Are the triangles equal? ");
        System.out.println(forms[0].equals(forms[2]));

        for(int i = 0; i < num; i ++) {

            System.out.println(forms[i].toString());

            if(forms[i] instanceof Triangle) {
                Triangle triangle = (Triangle) forms[i];
                triangle.printTraingleDimensions();
            }
            else if(forms[i] instanceof Circle) {
                Circle circle = (Circle) forms[i];
                circle.printCircleDimensions();
            }

        }

        System.out.println(" \n OR \n");

        for(int i = 0; i < num; i ++) {
            forms[i].printDimensions();
        }
    }

}
