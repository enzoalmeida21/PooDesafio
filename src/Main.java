import Componentes.Celular;
import Componentes.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone5 = new Iphone() {
            @Override
            public void iniciarCorreioDeVoz() {

            }
        };

        iphone5.desligarIphone(true);
        iphone5.ligarIphone(false);
        iphone5.isLigado();







    }
}
