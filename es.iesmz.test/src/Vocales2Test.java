import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {

    @Test
    void sinvocales1() {
        String cadena1 = Vocales2.sinvocales("Hola Mundo");
        String cadena2 = " Hl Mnd";
        Assertions.assertEquals(cadena2,cadena1);
    }
    @Test
    void sinvocales2() {
        String cadena1 = Vocales2.sinvocales("Esto Es una cadenA");
        String cadena2 =" st s n cdn";
        Assertions.assertEquals(cadena2,cadena1);
    }
    @Test
    void sinvocales3() {
        String cadena1 = Vocales2.sinvocales("Java mola MogollOn");
        String cadena2 =" Jv ml Mglln";
        Assertions.assertEquals(cadena2,cadena1);
    }
    @Test
    void sinvocales4() {
        String cadena1 = Vocales2.sinvocales("4h0r4 s0n num3r0s");
        String cadena2 =" 4h0r4 s0n nm3r0s";
        Assertions.assertEquals(cadena2,cadena1);
    }
    @Test
    void sinvocales5() {
        String cadena1 = Vocales2.sinvocales("Cadena Sin Vocales");
        String cadena2 =" Cdn Sn Vcls";
        Assertions.assertEquals(cadena2,cadena1);
    }

}