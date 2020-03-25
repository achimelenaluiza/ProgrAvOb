import java.lang.Math;

public class Milka extends CandyBox {
    private final String form;
    private float r;
    private float h;

    public Milka(){
        super();
        this.form = "cilindru";
        this.r = 0;
        this.h = 0;
    }

    public Milka(float r, float h, String flavor, String origin){
        super(flavor, origin);
        this.form = "cilindru";
        this.h = h;
        this.r = r;
    }

    @Override
    public float getVolume() {
        float V = (float) (Math.pow(this.r, 2) * this.h * Math.PI);
        return V;
    }

    @Override
    public String toString() {
        return super.toString() + "are volumul" + Float.toString(this.getVolume());
    }

    public void printMilkaDim() {
        System.out.println(this.h + " " + this.r);
    }
}
