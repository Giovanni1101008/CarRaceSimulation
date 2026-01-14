
public class Car {
    int resa;
    int litri;
    String tipo;

    public Car(int resa, String tipo) {
        this.resa = resa;
        this.litri = 0;
        this.tipo=tipo;
    }
    
    public void drive(double km) throws Exception {
        double consumo = km * resa;
        if (consumo > litri) {
            throw new Exception("Carburante insufficiente");
        }
        litri -= consumo;
    }
    public int getGas() { //sarebbe il getLitri
        return litri;
    }

    public void addGas(int litri) { //sarebbe il setLitri
        this.litri = litri;
    }
    
    public boolean isDiesel(String tipo)
    {
        return (tipo.equals("gasolio")  || tipo.equals("Gasolio"));  //ritorna true in caso è tipo = a gasolio o a Gasolio altrimenti false  
    }
    
    
}
