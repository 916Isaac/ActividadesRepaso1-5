import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {

    @Test
    void contarVocales() {
    }
    @Test
    void test1(){
        assertEquals(4,Vocales.contarVocales("Hola Mundo"));
    }
    @Test
    void test2(){
        assertEquals(8,Vocales.contarVocales("Esto Es una cadenA"));
    }
    @Test
    void test3(){
        assertEquals(7,Vocales.contarVocales("java mola MogollOn"));
    }
    @Test
    void test4(){
        assertEquals(1,Vocales.contarVocales("4h0r4 s0n num3r0s"));
    }
    @Test
    void test5(){
        assertEquals(6,Vocales.contarVocales("Cadena S1n Vocales"));
    }

}