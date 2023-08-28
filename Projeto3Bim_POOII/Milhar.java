public class Milhar extends Centena{
    private String numero;
    private String milhar;
    String vetorMilharExtenso[] = {"", "mil", "dois mil", "três mil", "quatro mil", "cinco mil",
"seis mil", "sete mil", "oito mil", "nove mil"};
    public String extensoMilhar(String numero){
        String v[] = numero.split("");
        int i = Integer.parseInt(v[0]);
        milhar = vetorMilharExtenso[i];
        return milhar;
    }

    public void setMilhar(String numero){
        this.numero = numero;       
    }
    public String getMilhar(){
        return this.numero;
    }

    public String extenso(String milhar, String centena, String dezena, String unidade){
        String numeroPorExtenso = milhar + centena + dezena + unidade;  
        return numeroPorExtenso.trim();        
    }
}
