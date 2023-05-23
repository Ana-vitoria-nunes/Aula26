package Exercicio1;
public class ICarros {
    private String marca,cor;
    protected int ano,portas,velocidade;
    private double valor;


    public ICarros(String marca, int ano,int portas,int velocidade,double valor,String cor){
        this.marca=marca;
        this.ano=ano;
        this.portas=portas;
        this.velocidade=velocidade;
        this.valor=valor;
        this.cor=cor;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public int getAno() {
        return ano;
    }
    public int getPortas(){
        return portas;
    }
    public String getCor(){
        return cor;
    }
    public String getMarca(){
        return marca;
    }
    public double getValor(){
        return valor;
    }
    public void darPartida(){
        System.out.println("Iniciando o motor...minha velocidade está em "+velocidade+" km");
    }
    public void freisrCarro(){
        System.out.println("Freando... minha velocidade está em "+velocidade+" km");
    }
    public void acelerarCarros(){
        System.out.println("Acelerando... minha velocidade está em "+velocidade+" km");
    }

}
