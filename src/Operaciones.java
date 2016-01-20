/**
 * 
 * @author SAIN PEDRAZA GUERRERO 9ITI1
 *
 */
public class Operaciones {
	/**
	 * 
	 * @param n1 variable que es utilizada para calcular como Base del cuadrado
	 * @return variable de tipo int y double para mejor precision de resultados
	 */
	public int perimetroCuadrado(int n1){
		return n1 * 4;
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del rectangulo
	 * @param n2 que es utilizada para calcular como Altura del rectangulo
	 * @return de tipo int y double para mejor precision de resultados
	 */
	public int perimetroRectangulo(int n1, int n2){
		return n1 * 2 + 2 * n2;
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del circulo ingresando radio
	 * @return tipo int y double para mejor precision de resultados
	 */
	public int perimetroTrianguloEscaleno(int n1, int n2, int n3){
		return n1 + n2 + n3;
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del circulo ingresando diametro
	 * @return tipo int y double para mejor precision de resultados
	 */
	public int perimetroTrianguloIsosceles(int n1, int n2){
		return n1 * 2 + n2;
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del triangulo escaleno
	 * @param n2 que es utilizada para calcular como Altura del triangulo escaleno
	 * @return tipo int y double para mejor precision de resultados
	 */
	public int perimetroTrianguloEquilatero(int n1){
		return n1 * 3;
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del triangulo isosceles
	 * @param n2 que es utilizada para calcular como Altura del triangulo isosceles
	 * @return tipo int y double para mejor precision de resultados
	 */
	public double perimetroCirculoRadio(double n1){
		return (2 * Math.PI * n1 ) ;
	}
	/**
	 * 
	 * @param n1 que es utilizada para calcular como Base del triangulo equilatero
	 * @return tipo int y double para mejor precision de resultados
	 */
	public double perimetroCirculoDiametro(double n1){
		return Math.PI * n1;
	}

}
