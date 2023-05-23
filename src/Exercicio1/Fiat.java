package Exercicio1;

class Fiat extends ICarros {
    public Fiat( int ano, int portas, double valor, String cor) {
        super("Fiat", 2020, 4, 0, 23000, "Vermelho");
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
