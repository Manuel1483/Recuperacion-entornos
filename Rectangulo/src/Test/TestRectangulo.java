package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.Rectangulo;
class TestRectangulo {
	static private Rectangulo r1;
	static private Rectangulo r2;

	@BeforeAll
	static void init() {
		 r1=new Rectangulo(3,2);
		 r2=new Rectangulo(5,7);
		
	}
	@Test
	void testArea1() {
		int areaEsperada=6;
		int areaObtenida=r1.area();
		assertEquals(areaEsperada, areaObtenida);
	}

}
