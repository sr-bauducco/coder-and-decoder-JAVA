 
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
			System.out.println(codigoASCII);
			contador++;
		}
		System.out.println("senha criptografada: " + senhaCriptografada);
        return senhaCriptografada;
    }
    public static String Decripto(String senha)
	{
		//Descriptografa a String passada por parâmetro
		int contador, tamanho,codigoASCII;
		String senhaCriptografada = "";
		tamanho = senha.length();
		senha = senha.toUpperCase();
		contador = 0;

		while(contador <tamanho)
		{
			codigoASCII = senha.charAt(contador)+130;
			//System.out.println(codigoASCII);
			senhaCriptografada = senhaCriptografada +(char) codigoASCII;
			contador++;
		}
		contador=0;
		String senhaDescriptografada="";
		while(contador <tamanho)
		{
			codigoASCII = senhaCriptografada.charAt(contador)-130;
			senhaDescriptografada = senhaDescriptografada + (char) codigoASCII;
			contador++;
		}
		senhaDescriptografada.toLowerCase();
		System.out.println("senha original: " + senhaDescriptografada);
		return senhaCriptografada;
    }
    //decripto ainda não terminado, saida estranha 


 public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    String senha = t.nextLine();
    Crypto.Cripto(senha);
    Crypto.Decripto(senha);
   
   

 }

}