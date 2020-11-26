package Models;

/**
 * En esta clase tendremos los datos de los Vehiculo de la aplicacion
 */


public class Vehiculo {
	
	/**
	 * Definimos los atributos de usuarios
	 */
	
	private Integer idVehiculo, idConcesionario, idCliente, idVentas,km;
	private String numBastidor, matricula, marca, modelo, color, potencia, anio, descripcionVeehiculo, combustible, tipoVehiculo;
	private Float precio;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Vehiculo() {
		
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo Integerroduzcamos nosotros.
	 * @param idVehiculo
	 * @param idConcesionario
	 * @param idCliente
	 * @param idVentas
	 * @param numBastidor
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param potencia
	 * @param anio
	 * @param descripcionVeehiculo
	 * @param km
	 */
	public Vehiculo(Integer idVehiculo, Integer idConcesionario, Integer idCliente, Integer idVentas, String numBastidor, String matricula, String marca, 
			String modelo, String tipoVehiculo, String color, String potencia, String anio, String combustible, Float precio,
			String descripcionVeehiculo, Integer km) {
		
		this.idVehiculo = idVehiculo;
		this.idConcesionario = idConcesionario;
		this.idCliente = idCliente;
		this.idVentas = idVentas;
		this.numBastidor = numBastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.color = color;
		this.potencia = potencia;
		this.anio = anio;
		this.combustible = combustible;
		this.precio = precio;
		this.descripcionVeehiculo = descripcionVeehiculo;
		this.km = km;
	}
	
	public Vehiculo(Integer idConcesionario, Integer idCliente, Integer idVentas, String numBastidor, String matricula,
			String marca, String modelo, String tipoVehiculo, String color, String potencia, String anio,
			String combustible, Float precio, String descripcionVeehiculo, Integer km) {
		this.idConcesionario = idConcesionario;
		this.idCliente = idCliente;
		this.idVentas = idVentas;
		this.numBastidor = numBastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.color = color;
		this.potencia = potencia;
		this.anio = anio;
		this.combustible = combustible;
		this.precio = precio;
		this.descripcionVeehiculo = descripcionVeehiculo;
		this.km = km;
	}

	/**
	 * Realizamos los Setters and Getters
	 */

	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public Integer getIdConcesionario() {
		return idConcesionario;
	}

	public void setIdConcesionario(Integer idConcesionario) {
		this.idConcesionario = idConcesionario;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdVentas() {
		return idVentas;
	}

	public void setIdVentas(Integer idVentas) {
		this.idVentas = idVentas;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getDescripcionVeehiculo() {
		return descripcionVeehiculo;
	}

	public void setDescripcionVeehiculo(String descripcionVeehiculo) {
		this.descripcionVeehiculo = descripcionVeehiculo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	public Integer getKm() {
		return km;
	}

	public void setKm(Integer km) {
		this.km = km;
	}

	/**
	 * Generamos el toString
	 */
	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", idConcesionario=" + idConcesionario + ", idCliente="
				+ idCliente + ", idVentas=" + idVentas + ", km=" + km + ", numBastidor=" + numBastidor + ", matricula="
				+ matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", potencia=" + potencia
				+ ", anio=" + anio + ", descripcionVeehiculo=" + descripcionVeehiculo + ", combustible=" + combustible
				+ ", tipoVehiculo=" + tipoVehiculo + ", precio=" + precio + "]";
	}

	
}
