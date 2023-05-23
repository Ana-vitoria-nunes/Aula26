package Exercicio1;

class Hyundai extends ICarros {
    public Hyundai(int ano, int portas, double valor, String cor) {
        super("Hyundai", 2010, 4, 0, 15000, "Preto");
    }
    @Override
    public void darPartida() {
        super.darPartida();
    }
    @Override
    public void freisrCarro() {
        super.freisrCarro();
        velocidade-=5;
    }

    @Override
    public void acelerarCarros() {
        super.acelerarCarros();
        velocidade+=10;
    }
}