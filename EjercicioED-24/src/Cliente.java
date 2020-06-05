/**
 * Clase Cliente Contiene informacion de cada cliente
 * 
 * @author Nuria Redondo
 * @version 1.0
 */
public class Cliente extends Object {
	/**
	 * Atributos
	 */
	public int codigo;
	public String nombre;
	public String apellido;
	public String email;
	public long telefono;
	public boolean nuevo;
	public double cifraVentas;

	/**
	 * Constructores
	 */
	public Cliente() {
		/**
		 * Constructor por defecto
		 */

	}

	/**
	 * Constructor con 6 parametros
	 * 
	 * @param codigo      codigo del cliente
	 * @param nombre      nombre del cliente
	 * @param email       email del cliente
	 * @param telefono    telefono del cliente
	 * @param nuevo       condición del cliente
	 * @param cifraVentas ventas del cliente
	 */
	public Cliente(int codigo, String nombre, String email, long telefono, boolean nuevo, double cifraVentas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.nuevo = nuevo;
		this.cifraVentas = cifraVentas;
	}

	/**
	 * Metodos publicos
	 */
	/**
	 * Muestra los datos del cliente
	 */
	public void mostrarDatos() {
		System.out.println("Codigo: " + codigo + "Nombre: " + nombre + "Email: " + email + "Telefono: " + telefono
				+ "Nuevo: " + nuevo + "CifraVentas: " + cifraVentas);
	}

	/**
	 * Consulta venta cliente
	 * 
	 * @return devuelve cantidadVenta
	 */
	public double verCifraVentas() {
		return cifraVentas;
	}

	/**
	 * Modifica el telefono del cliente
	 * 
	 * @param nuevoTelefono
	 */

	public void cambiarTelefono(long nuevoTelefono) {
		telefono = nuevoTelefono;
	}
}