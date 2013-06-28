package dominio

abstract class Persona {

	def edad
	def entradaComprada
	def descuento
	
	def comprarEntrada(noche, ubicacion)
	{
		
		Planificacion.instance.verificarDisponibilidad(noche, ubicacion, this)

	}
	
	
	
	def abstract getValorDescuento(valorBase)
	
}
