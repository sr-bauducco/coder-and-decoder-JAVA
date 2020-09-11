 
import java.util.Scanner;

public class Crypto
{
    
    public static String Cripto(String senha)
	{
        String senhaCriptografada;
		//Criptografa a String passada por parâmetro
		int contador, tamanho,codigoASCII;
		senhaCriptografada = "";
		tamanho = senha.length();
		senha = senha.toUpperCase();
		contador = 0;
		
		while(contador <tamanho)
		{
			codigoASCII = senha.charAt(contador)+130;
			senhaCriptografada = senhaCriptografada +(char) codigoASCII;
			contador++;
		}
		System.out.println("senha criptografada: " + senhaCriptografada);
        return senhaCriptografada;
    }
    /*public static String Decripto(String senha)
	{
		//Descriptografa a String passada por parâmetro
		int contador, tamanho,codigoASCII;
		String senhaCriptografada = "";
		tamanho = senha.length();
		senha = senha.toUpperCase();
		contador = 0;
		
		while(contador <tamanho)
		{
			codigoASCII = senha.charAt(contador)-130;
			senhaCriptografada = senhaCriptografada +(char) codigoASCII;
			contador++;
		}
		System.out.println("senha original: " + senhaCriptografada);
		return senhaCriptografada;
    }*/
    //decripto ainda não terminado, saida estranha 


 public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    String senha = t.nextLine();
    Crypto.Cripto(senha);
    //Decripto(senha);
    
   
   

 }

}