package dominio

class PersonaMenor extends Persona{

	def PersonaMenor()
	{
		this.descuento = 0.20
	}
	
	@Override
	def getValorDescuento(valorBase) {
		
		if(valorBase > 100)
			return valorBase * descuento
			else
		{
			if(50 < valorBase && valorBase <= 100)
				return 10
		}
		
	}
	
}
