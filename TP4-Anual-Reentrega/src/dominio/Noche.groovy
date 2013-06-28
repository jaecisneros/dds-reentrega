package dominio

class Noche {
	
	def fecha
	def ubicaciones = [] as Set
	def bandas = [] as Set
	
	def verificarDisponibilidad(ubicacion){
		
		def ubicacionElegida = ubicaciones.find(ubicacion)
		
		if (ubicacionElegida == null)
			return false
		else
		{
			ubicaciones - ubicacionElegida
			return true
		}

	}
	
	def buscarPrecioMaxCategoria(){
		
		def categoriaMax = 1
		def precioMax = 0
		
		bandas.each {
			if (categoriaMax > it.categoria){
				
				categoriaMax = it.categoria
				precioMax = it.precioCategoria
				
			}
			
		}
		
		return precioMax
		
	}
	
	

}
