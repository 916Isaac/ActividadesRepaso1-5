import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void nextSecond1() {
        Time t1 = new Time(12,14,15);
        Time tiempoEsperado = new Time(12,14,16);
        assertEquals(tiempoEsperado, t1.nextSecond());
    }
    @Test
    void nextSecond2() {
        Time t1 = new Time(12,59,44);
        Time tiempoEsperado = new Time(12,59,45);
        assertEquals(tiempoEsperado, t1.nextSecond());
    }
    @Test
    void nextSecond3() {
        Time t1 = new Time(1,9,59);
        Time tiempoEsperado = new Time(1,10,0);
        assertEquals(tiempoEsperado, t1.nextSecond());
    }
    @Test
    void nextSecond4() {
        Time t1 = new Time(17,59,59);
        Time tiempoEsperado = new Time(18,0,0);
        assertEquals(tiempoEsperado, t1.nextSecond());
    }
    @Test
    void nextSecond5() {
        Time t1 = new Time(23,59,59);
        Time tiempoEsperado = new Time(0,0,0);
        assertEquals(tiempoEsperado, t1.nextSecond());
    }

}