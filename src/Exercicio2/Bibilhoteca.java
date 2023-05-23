package Exercicio2;
public class Bibilhoteca {
    private String tipo,nome,autor;
    private double ISBN;
    public Bibilhoteca(String tipo,String nome,String autor,double ISBN){
        this.tipo=tipo;
        this.nome=nome;
        this.autor=autor;
        this.ISBN=ISBN;
    }
    public String getNome(){
        return nome;
    }
    public String getTipo(){
        return tipo;
    }
    public String getAutor(){
        return autor;
    }
    public double getISBN(){
        return ISBN;
    }
    public void registrarLivro(double ISBN){
        System.out.println("O livro foi registrado com o isbn "+ISBN);
    }
    public void registrarLivro(double ISBN,String nome){
        System.out.println("O livro foi registrado com o isbn "+ISBN+" e o nome "+nome);
    }
    public void registrarLivro(double ISBN,String nome,String tipo){
        System.out.println("O livro foi registrado com o isbn "+ISBN+" e o nome "+nome+" e o gênero "+tipo);
    }
    public void registrarLivro(double ISBN,String nome,String tipo,String autor){
        System.out.println("O livro foi registrado com todos os atributos");
    }
}
