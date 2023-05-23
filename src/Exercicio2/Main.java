package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Bibilhoteca livro=new Bibilhoteca("Romance","A culpa é das Estrelas","John Green",1564978);
        Bibilhoteca livro1=new Bibilhoteca("Suspense","O silencio dos inocentes"," Thomas Harris",200345);
        Bibilhoteca livro2=new Bibilhoteca("Drama","Um drama de verão"," Susan Lee",3024581);
        Bibilhoteca livro3=new Bibilhoteca("Terror","It - A Coisa"," Stephen King",8954712);

        System.out.println("Nome: "+livro.getNome());
        System.out.println("Autor: "+livro.getAutor());
        System.out.println("Gênero: "+livro.getTipo());
        System.out.println("ISBN: "+livro.getISBN());
        livro.registrarLivro(livro.getISBN());
        System.out.println("-------------------------------------------");

        System.out.println("Nome: "+livro1.getNome());
        System.out.println("Autor: "+livro1.getAutor());
        System.out.println("Gênero: "+livro1.getTipo());
        System.out.println("ISBN: "+livro1.getISBN());
        livro.registrarLivro(livro1.getISBN(), livro1.getNome());
        System.out.println("-------------------------------------------");

        System.out.println("Nome: "+livro2.getNome());
        System.out.println("Autor: "+livro2.getAutor());
        System.out.println("Gênero: "+livro2.getTipo());
        System.out.println("ISBN: "+livro2.getISBN());
        livro.registrarLivro(livro2.getISBN(), livro2.getNome(), livro2.getTipo());
        System.out.println("-------------------------------------------");

        System.out.println("Nome: "+livro3.getNome());
        System.out.println("Autor: "+livro3.getAutor());
        System.out.println("Gênero: "+livro3.getTipo());
        System.out.println("ISBN: "+livro3.getISBN());
        livro.registrarLivro(livro3.getISBN(), livro3.getNome(), livro3.getTipo(), livro3.getAutor());


    }
}
