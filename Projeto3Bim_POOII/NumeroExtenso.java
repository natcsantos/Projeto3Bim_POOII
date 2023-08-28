import java.util.*;
//import javax.print.DocFlavor.STRING;
import java.text.DecimalFormat;
public class NumeroExtenso{
        public static void main(String args[]){
                Scanner entrada = new Scanner(System.in);
                int num = Integer.parseInt(entrada.nextLine());
                DecimalFormat formatoNumero = new DecimalFormat();
                formatoNumero.applyPattern("0000");
                String numeroInserido = formatoNumero.format(num);

                ManipulaCaracteres caracteres = new ManipulaCaracteres();
                Milhar numero = new Milhar();

                numero.setUnidade(numeroInserido);
                numero.setDezena(numeroInserido);
                numero.setCentena(numeroInserido);
                numero.setMilhar(numeroInserido);
                String dezena = numero.extensoDezena(numeroInserido);
                String unidade = numero.extensoUnidade(numeroInserido);
                String centena = numero.extensoCentena(numeroInserido);
                String milhar = numero.extensoMilhar(numeroInserido);

                String numeroPorExtenso = numero.extenso(milhar, centena, dezena, unidade);

                caracteres.setMaiusculo(numeroPorExtenso);
                String numeroPorExtensoMaiusculo = caracteres.extensoMaiusculo(numeroPorExtenso);
                System.out.println(numeroPorExtensoMaiusculo);
        }
}