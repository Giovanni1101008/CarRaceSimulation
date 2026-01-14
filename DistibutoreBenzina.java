public class DistibutoreBenzina {

    int depositoV;
    int depositoGas;
    int euroPerLitroVerde;
    int euroPerLitroGasolio;

    public DistibutoreBenzina(int prezzoVerde, int prezzoGasolio) {
        this.depositoV = 0;
        this.depositoGas = 0;
        this.euroPerLitroVerde = prezzoVerde;
        this.euroPerLitroGasolio = prezzoGasolio;
    }

    public void rifornisciVerde(int litri) {
        depositoV += litri;
    }

    public void rifornisciGasolio(int litri) {
        depositoGas += litri;
    }

    public void vendi(Car auto, int euro) throws Exception {
        if (auto.isDiesel("gasolio") || auto.isDiesel("Gasolio")) {
            int litri = euro / euroPerLitroGasolio;
            if (litri > depositoGas) {
                throw new Exception("Gasolio insufficiente");
            }
            depositoGas -= litri;
            auto.addGas(litri);
        } else {
            int litri = euro / euroPerLitroVerde;
            if (litri > depositoV) {
                throw new Exception("Benzina verde insufficiente");
            }
            depositoV -= litri;
            auto.addGas(litri);
        }
    }

    public void aggiornaPrezzoVerde(int nuovoPrezzo) {
        euroPerLitroVerde = nuovoPrezzo;
    }

    public void aggiornaPrezzoGasolio(int nuovoPrezzo) {
        euroPerLitroGasolio = nuovoPrezzo;
    }
}
