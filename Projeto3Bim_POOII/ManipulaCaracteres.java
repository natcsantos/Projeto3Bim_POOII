public class ManipulaCaracteres {
    private String primeiraLetraMaiuscula;

    public String extensoMaiusculo(String primeiraLetra){
        String primeira = primeiraLetra.substring(0, 1).toUpperCase();
        String resto = primeiraLetra.substring(1);
        
        primeiraLetraMaiuscula = primeira + resto;
        return primeiraLetraMaiuscula.trim();
    }

    public void setMaiusculo(String primeiraLetra){
        this.primeiraLetraMaiuscula = primeiraLetra;
    }

    public String getMaiusculo(){
        return this.primeiraLetraMaiuscula;
    }
}
