import java.sql.SQLOutput;
import java.util.*;
public class Questao1
{
    public static String vogaisConsoantes(String w){
        int vogais = 0;
        int consoantes = 0;
        for(int i = 0;i<w.length();i++){
            if(w.charAt(i) == 'a'){
                vogais++;
            }
            else if(w.charAt(i) == 'e'){
                vogais++;
            }
            else if(w.charAt(i) == 'i'){
                vogais++;
            }
            else if(w.charAt(i) == 'o'){
                vogais++;
            }
            else if(w.charAt(i) == 'u'){
                vogais++;
            }
            else {
                consoantes++;
            }
        }
        return "vogais: "+ vogais+" consoantes: "+consoantes;
    }
    public static String invertePalavra(String word){
        String palavraNova = "";
        for(int i = word.length()-1;i>=0;i--){
            palavraNova += word.charAt(i);
        }
        return palavraNova;
    }
    public static int tamanho(String word){
        word = word.replace(" ","");
        return word.length();
    }
    public static boolean palindromo(String w){
        w = w.replace(" ","");
        int j = 0;
        for(int i = w.length()-1;i>=j;i--){
            if(w.charAt(i) != w.charAt(j)) {
                return false;
            }
            j++;
        }
        return true;
    }
    public static String repetidor(String w,int n){
        String wordAux = "";
        for(int i = 0;i<n;i++){
        wordAux+=" "+w;
        }
        return wordAux;
    }
    public static int aleatorio(int n){
        Random rand = new Random();

        return rand.nextInt(n)+1;
    }
    public static boolean divisivel(int n,int x){
        if(n%x == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean ehPrimo(int n){
        for(int i = 2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //NUMEROS PRIMOS
        System.out.println("verificar se é primo:");
        int n1 = in.nextInt();
        if(ehPrimo(n1)){
            System.out.println("é primo");
        }
        else{
            System.out.println("não é primo");
        }

        //VERIFICADOR DE DIVISIVEL
        System.out.println("Verificar se é divisivel o numero:");
        int dividendo = in.nextInt();
        System.out.println("pelo numero:");
        int divisor = in.nextInt();
        if(divisivel(dividendo,divisor)){
            System.out.println("é divisivel.");
        }
        else{
            System.out.println("Não é divisivel.");
        }

        //INVERSOR DE PALAVRAS
        System.out.println("Inversor de palavra:");
        String palavra = in.nextLine();
        String palavraNova = "";
        System.out.println(invertePalavra(palavra));

        //CONTADOR DE CARACTERES
        System.out.println("Contador de caracteres:");
        palavra = in.nextLine();
        System.out.println("Numero de caracteres: "+tamanho(palavra));

        //CONTADOR DE VOGAIS E CONSOANTES
        System.out.println("Contador de vogais e consoantes: ");
        palavra = in.nextLine();
        System.out.println(vogaisConsoantes(palavra));

        //VERIFICAR PALINDROMO
        System.out.println("verificar palindromo: ");
        palavra = in.nextLine();
            if(palindromo(palavra)){
                System.out.println("eh palindromo");
            }
            else{
                System.out.println("Nao e palindromo");
            }

        //REPETIDOR DE PALAVRAS
        System.out.println("Repetidor de palavra:");
        palavra = in.nextLine();
        System.out.println("Quantas vezes repetir?");
        int vezes = in.nextInt();
        System.out.println(repetidor(palavra,vezes));
        in.nextLine();//limpeza de buffer

        //RETORNA NUMERO ALEATORIO
        System.out.println("Qual limite pro numero aleatorio?");
        n1 = in.nextInt();
        System.out.println("numero aleatorio: "+aleatorio(n1));

    }
}
