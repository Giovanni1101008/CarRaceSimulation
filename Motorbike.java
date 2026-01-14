
public class Motorbike extends Car {

    public Motorbike(int resa, String tipoCarburante) {
        super(resa,tipoCarburante);
    }

    @Override
    public void drive(double km) throws Exception {
        // le moto consumano leggermente meno
        double consumo = km * (resa * 0.8);
        if (consumo > litri) {
            throw new Exception("Carburante insufficiente (Moto)");
        }
        litri -= consumo;
    }
}

