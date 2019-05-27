package schildt_proj.Inheriance_7.try_this;

/**
 * Created by RI on 5/28/2017.
 */
public class Truck extends Vehicle {

    private int cargoCap;

    Truck(int p, int f, int m,int c) {
        super(p, f, m);
        cargoCap = c;
    }

    public void setCargoCap(int cargoCap) {
        this.cargoCap = cargoCap;
    }

    public int getCargoCap() {

        return cargoCap;
    }
}
