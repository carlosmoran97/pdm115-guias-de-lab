package sv.ues.fia.eisi.mc16006;

public class Metodos {
    public static String suma(float valor1, float valor2){
        String sumastr;
        float sumafloat = valor1 + valor2;
        sumastr = String.valueOf(sumafloat);
        return sumastr;
    }

    public static String resta(float valor1, float valor2){
        String restastr;
        float restafloat = valor1 - valor2;
        restastr = String.valueOf(restafloat);
        return restastr;
    }

    public static String mult(float valor1, float valor2){
        String multstr;
        float multfloat = valor1 * valor2;
        multstr = String.valueOf(multfloat);
        return multstr;
    }
}
