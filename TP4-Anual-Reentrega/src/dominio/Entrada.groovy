package dominio

class Entrada {

	def fecha
	def sector
	def fila
	def precioFinal
	
	def Entrada(noche, ubicacion, persona){
		
		this.fecha = noche.getFecha()
		this.sector = ubicacion.getSector()
		this.fila = ubicacion.getFila()
		this.precioFinal = ubicacion.getPrecioBase() + noche.buscarPrecioMaxCategoria() - persona.getValorDescuento(ubicacion.getPrecioBase())	
		
		persona.setEntradaComprada(this)
		
	}
	
}
