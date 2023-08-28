public class Unidade {
    private String numero;
    private String unidade;    
    String vetorUnidadeExtenso[] = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
    public String extensoUnidade(String numero){
        String v[] = numero.split("");
        int i = Integer.parseInt(v[3]);
        unidade = vetorUnidadeExtenso[i];
        this.verificarUnidade();
        return unidade;
    }
    public void setUnidade(String numero){
        this.numero = numero;       
    }
    public String getUnidade(){
        return this.numero;
    }
    public void verificarUnidade(){
        String n[] = numero.split("");
        boolean milharzero = n[0].equals("0");
        boolean centenazero = n[1].equals("0");
        boolean dezenazero = n[2].equals("0");
         
        if(!milharzero || !centenazero || !dezenazero){
            unidade = " e " + unidade;    
        }
        if(n[2].equals("1")){
            unidade = "";
        }
        if(n[1].equals("1") && dezenazero && milharzero){
            unidade = "";
        }

    }
}
