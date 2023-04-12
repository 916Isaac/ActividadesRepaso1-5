public class Vocales {

    public static int contarVocales(String cadena){
        int contadorVocales =0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contadorVocales++;
            }
        }
        return contadorVocales;
    }
}
