public class Centena extends Dezena {
    private String numero;
    private String centena;
    private String cem;

    String vetorCentenaExtenso[] = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos",
"seiscentos", "setecentos", "oitocentos", "novecentos"};

    public String extensoCentena(String numero){
        String v[] = numero.split("");
        if(v[1].equals("1") && v[2].equals("0") && v[3].equals("0")){
            centena = "cem";
            VerificarCentena();
            return centena;
        }else{
            int i = Integer.parseInt(v[1]);
            centena = vetorCentenaExtenso[i];
            this.VerificarCentena();
            return centena;
        }
        
    }

    public void setCentena(String numero){
        this.numero = numero;       
    }
    public String getCentena(){
        return this.numero;
    }

    public void VerificarCentena(){
        String n[] = numero.split("");
        boolean milharzero = n[0].equals("0");
        boolean dezenazero = n[2].equals("0");
        boolean unidadezero = n[3].equals("0");
        
        if(!milharzero){
            centena = " " + centena;    
        }
    }
}