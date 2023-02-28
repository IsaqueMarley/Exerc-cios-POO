public class AppLivros{
  public static void main(String[] args){
    Livro livro01 = new Livro("001","Código Da Vinci",88);
    Livro livro02 = new Livro("002","Código Da Vinci 2",8);
    Livro livro03 = new Livro("001","Código Da Vinci 3 ",3);

    livro01.exibirExemplares();
    livro02.exibirExemplares();
    livro03.exibirExemplares();
  }
}