public class Dezena extends Unidade {
    private String numero;
    private String dezena;
    private int dezenaEspecial;
    String vetorDezenaExtenso[] = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta",
"sessenta", "setenta", "oitenta", "noventa"};
    String vetorDezenaEspeciais[] = {"dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
    
    public void setDezena(String numero){
        this.numero = numero;       
    }
    public String getDezena(){
        return this.numero;
    }

    public String extensoDezena(String numero){
        int numeroEspecial = Integer.parseInt(numero);
        String v[] = numero.split("");
        if(v[2].equals("1")){
            int i = Integer.parseInt(v[3]);
            dezena = vetorDezenaEspeciais[i];
            this.verificarDezena();
            return dezena;
        }else{
            int i = Integer.parseInt(v[2]);
            dezena = vetorDezenaExtenso[i];
            this.verificarDezena();
            return dezena;
        }
    }

    public void verificarDezena(){
        String n[] = numero.split("");
        boolean milharzero = n[0].equals("0");
        boolean centenazero = n[1].equals("0");
        boolean unidadezero = n[3].equals("0");

        if(!milharzero || !centenazero){
            dezena = " e " + dezena ;    
        }
        if(n[1].equals("1") && unidadezero){
            dezena = "";
        }
    }
}
