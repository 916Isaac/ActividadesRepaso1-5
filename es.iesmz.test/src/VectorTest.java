import org.junit.jupiter.api.Test;

class VectorTest {

    @Test
    void reverso1() {
        int [] vector = {1,2,3,4,5,6};
        int [] esperado = {6,5,4,3,2,1};
        int [] resultado = Vector.reverso(vector);
        assertArrayEquals(resultado,esperado);
    }
    @Test
    void reverso2() {
        int [] vector = {10,12,5,221,6,7};
        int [] esperado = {7,6,221,5,12,10};
        int [] resultado = Vector.reverso(vector);
        assertArrayEquals(resultado,esperado);
    }
    @Test
    void reverso3() {
        int [] vector = {5};
        int [] esperado = {5};
        int [] resultado = Vector.reverso(vector);
        assertArrayEquals(resultado,esperado);
    }
    @Test
    void reverso4() {
        int [] vector = {5,10,20};
        int [] esperado = {20,10,5};
        int [] resultado = Vector.reverso(vector);
        assertArrayEquals(resultado,esperado);
    }


    private void assertArrayEquals(int[] reverso, int[] esperado) {
    }

}