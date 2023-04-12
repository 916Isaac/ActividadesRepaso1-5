public class Vocales2 {

    public static String sinvocales(String cadena) {
        StringBuilder cadenaFinal = new StringBuilder(" ");
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

            }else {
                cadenaFinal.append(cadena.charAt(i));
            }
        }
        return String.valueOf(cadenaFinal);
    }
}
