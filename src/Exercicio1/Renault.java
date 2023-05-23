package Exercicio1;

class Renault extends ICarros {
    public Renault( int ano,int portas,double valor,String cor){
        super("renault",2015,4,0,57000,"Lilas");
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