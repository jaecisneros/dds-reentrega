package dominio

class PersonaJubilada extends Persona{
	
	def PersonaJubilada()
	{
		this.descuento = 0.20
	}
	
	@Override
	def getValorDescuento(valorBase)
	{
		return valorBase * 0.15
	}
	
}
