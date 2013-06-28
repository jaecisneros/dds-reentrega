package dominio

@Singleton
class Planificacion {
	
	def nochesConcierto = [] as Set

	def verificarDisponibilidad(noche, ubicacion, persona){
		
		def nocheElegida = nochesConcierto.find(noche)
		if(nocheElegida.verificarDisponibilidad(ubicacion))
			this.generarEntrada(noche,ubicacion,persona)
		
		
	}
	
	def generarEntrada(noche, ubicacion, persona){
		
		def entrada = new Entrada(noche, ubicacion, persona)
	}
	
	def agregarNoche(noche){
		
		nochesConcierto << noche
	}
}
