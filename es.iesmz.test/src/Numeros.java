public class Numeros {
    public static int soniguales(int a,int b,int c) {
        int resultado =0;
        if (a == b && b == c){
            resultado =0;
        }else if (a == b && a != c || a == c && c != b || c == b && c != a){
            resultado = 1;
        }else if (a != c && b != c){
            resultado = 2;
        }
        return resultado;
    }
}