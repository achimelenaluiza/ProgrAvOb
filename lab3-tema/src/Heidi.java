import java.lang.Math;

public class Heidi extends CandyBox {
    private float l;
    private final String form;

    public Heidi(){
        super();
        this.l = 0;
        this.form = "cub";
    }

    public Heidi(float l, String flavor, String origin){
        super(flavor, origin);
        this.form = "cub";
        this.l = l;
    }

    @Override
    public float getVolume() {
        float power = (float) Math.pow(this.l, 3);
        return power;
    }

    public void printHeidiDim() {
        System.out.println(this.l);
    }

    @Override
    public String toString() {
        return super.toString() + "are volumul" + Float.toString(this.getVolume());
    }
}
