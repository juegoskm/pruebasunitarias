public class fracciones {
int numerador, denominador;

    double hola;


    public fracciones(int numerador, int nominador) {
        this.numerador = numerador;
        this.denominador = nominador;
    }

    


    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getNominador() {
        return denominador;
    }

    public void setNominador(int nominador) {
        this.denominador = nominador;
    }

    public int suma () {

       int  suma = numerador + denominador;
       return suma;

    }

    public int resta(){

        int  resta = numerador - denominador;
        return resta;

    }

    public int inversa(){


        int inversa = (numerador*denominador)+(denominador*numerador);

        denominador = denominador*denominador;

        return inversa;

    }


}
