/**
 * 
 */
package peoples;

/**
 * @author HP
 *
 */
public class Operaciones {
	private double n1;
	private double n2;
	private double suma;
	private double resta;
	private double multilicacion;
	private double division;
	/**
	 * 
	 */
	public Operaciones(int n1, int n2) {
		// TODO Auto-generated constructor stub
		this.n1 = n1;
		this.n2 = n2;
		
	}
	/**
	 * @return the n1
	 */
	public double getN1() {
		return n1;
	}
	/**
	 * @param n1 the n1 to set
	 */
	public void setN1(double n1) {
		this.n1 = n1;
	}
	/**
	 * @return the n2
	 */
	public double getN2() {
		return n2;
	}
	/**
	 * @param n2 the n2 to set
	 */
	public void setN2(double n2) {
		this.n2 = n2;
	}
	/**
	 * @return the suma
	 */
	public double getSuma() {
		
		return n1+n2;
	}
	/**
	 * @param suma the suma to set
	 */
	public void setSuma(double suma) {
		this.suma = suma;
	}
	/**
	 * @return the resta
	 */
	public double getResta() {
		return resta;
	}
	/**
	 * @param resta the resta to set
	 */
	public void setResta(double resta) {
		this.resta = resta;
	}
	/**
	 * @return the multilicacion
	 */
	public double getMultilicacion() {
		return multilicacion;
	}
	/**
	 * @param multilicacion the multilicacion to set
	 */
	public void setMultilicacion(double multilicacion) {
		this.multilicacion = multilicacion;
	}
	/**
	 * @return the division
	 */
	public double getDivision() {
		return division;
	}
	/**
	 * @param division the division to set
	 */
	public void setDivision(double division) {
		this.division = division;
	}
	

}
