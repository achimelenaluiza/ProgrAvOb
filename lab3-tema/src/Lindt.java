public class Lindt extends CandyBox{
    private final String form;
    private float l;
    private float h;
    private float L;

    public Lindt() {
        super();
        this.form = "paralelipiped dreptunghic";
        this.l = this.L = this.h = 0;
    }

    public Lindt(float L, float l, float h, String flavor, String origin){
        super(flavor, origin);
        this.form = "paralelipiped dreptunghic";
        this.l = l;
        this.L = L;
        this.h = h;
    }

    @Override
    public float getVolume() {
        return this.l * this.L * this.h;
    }

    @Override
    public String toString() {
        return super.toString() + "are volumul" + Float.toString(this.getVolume());
    }

    public void printLindtDim() {
        System.out.println(this.l + " " + this.L + " " + this.h);
    }
}
