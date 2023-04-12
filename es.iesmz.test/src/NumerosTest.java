import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {

    @org.junit.jupiter.api.Test
    void soniguales() {
    }
    @Test
    void test1(){
        assertEquals(2,Numeros.soniguales(4,55,7));
    }
    @Test
    void test2(){
        assertEquals(2,Numeros.soniguales(14,23,27));
    }
    @Test
    void test3(){
        assertEquals(1,Numeros.soniguales(14,55,14));
    }
    @Test
    void test4(){
        assertEquals(1,Numeros.soniguales(14,14,33));
    }
    @Test
    void test5(){
        assertEquals(1,Numeros.soniguales(32,55,55));
    }
    @Test
    void test6(){
        assertEquals(0,Numeros.soniguales(329,329,329));
    }
}