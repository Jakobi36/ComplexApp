import org.example.Complex;
import org.example.ComplexService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {

    Complex c1;
    Complex c2;

    @BeforeEach
    void init() {
        c1 = new Complex(1.0,2.0);
        c2 = new Complex(3.0,4.0);
    }

    @Test
    void str() {
        assertEquals("1+2i", c1.str());
        assertEquals("3+4i", c2.str());
    }

    @Test
    void add() {
        ComplexService complexService = new ComplexService();
        assertEquals(new Complex(4.0,6.0), complexService.add(c1, c2));
    }

    @Test
    void sub() {
        ComplexService complexService = new ComplexService();
        assertEquals(new Complex(-2,-2), complexService.sub(c1,c2));
    }

    @Test
    void mul() {
        ComplexService complexService = new ComplexService();
        assertEquals(new Complex(-5,10), complexService.mul(c1,c2));
    }

    @Test
    void div() {
        ComplexService complexService = new ComplexService();
        assertEquals(new Complex(0.44,0.08), complexService.div(c1,c2));
    }

    @Test
    void equal() {
        ComplexService complexService = new ComplexService();
        assertEquals(false, complexService.equal(c1,c2));
        assertEquals(true, complexService.equal(new Complex(1.0,1.0),new Complex(1.0, 1.0)));
    }

    @Test
    void mod() {
        double n = 2.23606797749979;
        double n1 = 5.0;
        ComplexService complexService = new ComplexService();
        assertEquals(n, complexService.mod(c1));
        assertEquals(n1, complexService.mod(c2));
    }
}