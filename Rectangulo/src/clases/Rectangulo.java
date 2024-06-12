package clases;

public class Rectangulo {
private int base;
private int altura;
/**
 * @param base la base del rectangulo
 * @param altura la altura del rectangulo
 **/
public Rectangulo(int base,int altura) {
	if(base<=0||altura<=0) {
		throw new IllegalArgumentException("La base y la altura deben ser superiores a 0");
	}
	this.base=base;
	this.altura=altura;
}
/**
 * Calcula el area del rectangulo
 * @return el area del rectangulo
 **/
public int area() {
	return base*altura;
}
/**
 * Calcula el perimetro del rectangulo
 * @return el perimetro del rectangulo
 */
public int perimetro() {
	return 2*base+2*altura;
}
}
