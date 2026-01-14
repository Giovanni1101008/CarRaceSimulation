public class Pilota extends Thread {

    Car auto;
    DistibutoreBenzina distributore;
    String nome;
    double distanzaTotale;

    public Pilota(String nome, Car auto, DistibutoreBenzina d) {
        this.nome = nome;
        this.auto = auto;
        this.distributore = d;
        this.distanzaTotale = 0;
    }

    @Override
    public void run() {
        int giri = 35;
        double lunghezzaPista = 1.2; // sono i km da percorrere

        for (int i = 1; i <= giri; i++) {
            try {
                auto.drive(lunghezzaPista);
            } catch (Exception e) {
                try {
                    distributore.vendi(auto, 20); // pit stop
                } catch (Exception ex) {
                    System.out.println(nome + " ritirato!");
                    return;
                }
            }

            distanzaTotale += lunghezzaPista;

            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException ignored) {}
        }

        System.out.println(nome + " ha finito la gara!");
    }

    public double getDistanzaTotale() {
        return distanzaTotale;
    }
}
