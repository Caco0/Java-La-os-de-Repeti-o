import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0; //mesada do joãozinho

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: "+ valorDoce + "Adicionado no cartão");
            mesada -= valorDoce;
        }
        
        System.out.println("Mesada: "+ mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");
    }
    private static double valorAleatorio(){
        return  ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
