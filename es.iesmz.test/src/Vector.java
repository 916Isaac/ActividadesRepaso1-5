import java.util.Arrays;

public class Vector {


    public static int [] reverso(int [] vector){
        int [] arrayNuevo = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            int j = vector.length;
            arrayNuevo[j-1] = vector[i];
            j--;
        }
        return arrayNuevo;
    }
}
