package dominio

class Butaca {
	
	def ubicacion
	def numero
	
	def getPrecio() {
		
		ubicacion.calcularPrecio()
	}

}
