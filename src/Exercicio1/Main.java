package Exercicio1;

public class Main {
    public static void main(String[] args) {

            Renault renault=new Renault(2015,4,0,"Lilas");
            Fiat fiat=new Fiat(2020,4,23000,"Vermelho");
            Hyundai hyundai=new Hyundai( 2010, 4,  15000, "Preto");

            System.out.println("Marca: "+renault.getMarca());
            System.out.println("Cor: "+renault.getCor());
            System.out.println("Ano: "+renault.getAno());
            System.out.println("Quantidade de portas: "+renault.getPortas());
            System.out.println("Valor: "+renault.getValor());
            renault.darPartida();
            renault.acelerarCarros();
            renault.acelerarCarros();
            renault.freisrCarro();
            renault.freisrCarro();
            System.out.println("------------------------------------------");

            System.out.println("Marca: "+fiat.getMarca());
            System.out.println("Cor: "+fiat.getCor());
            System.out.println("Ano: "+fiat.getAno());
            System.out.println("Quantidade de portas: "+fiat.getPortas());
            System.out.println("Valor: "+fiat.getValor());
            fiat.darPartida();
            fiat.acelerarCarros();
            fiat.acelerarCarros();
            fiat.freisrCarro();
            fiat.freisrCarro();
            System.out.println("------------------------------------------");

            System.out.println("Marca: "+hyundai.getMarca());
            System.out.println("Cor: "+hyundai.getCor());
            System.out.println("Ano: "+hyundai.getAno());
            System.out.println("Quantidade de portas: "+hyundai.getPortas());
            System.out.println("Valor: "+hyundai.getValor());
            hyundai.darPartida();
            hyundai.acelerarCarros();
            hyundai.acelerarCarros();
            hyundai.freisrCarro();
            hyundai.freisrCarro();
            System.out.println("------------------------------------------");




        }

}

