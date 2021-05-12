package ProblemaSERIES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Catalogo {
	
	private List<Serie> series;
	
	public Catalogo() {
		this.series = new ArrayList<Serie>();
	}
	
	public Catalogo agregar(Serie s) {
		this.series.add(s);
		return this;
	}
	
	public void imprimirOrdenadoPorTitulo() {
		Collections.sort(series);
		System.out.println(series);
	}
	
	public void imprimirOrdenadoPorCalificacion() {
		Collections.sort(series, 
				(s1, s2) -> s1.getCalificacion().compareTo(s2.getCalificacion()));
		
		//otra forma de ordenar las series sin usar lambda:
		
		//Collections.sort(series, new Comparator<Serie>() {
			//@Override
			//public int compare(Serie s1, Serie s2) {
				//return s1.getCalificacion().compareTo(s2.getCalificacion());
			//}
			//});
		
		System.out.println(series);
	}
	
	//este metodo se comporta segun lo que la funcion qe recibe como argumento se comporte
	//buscar agrega a una lista todas las series que cumplen con la condicion
	//dicha condicion la paso como parametro en la App (ver lo de Predicate en App)
	//por ej. que tenga más de 5000 visualizaciones o que sea del genero SUSPENSO, etc
	public List<Serie> buscar(Predicate<Serie> condiciones) {
		List<Serie> resultado = new ArrayList<Serie>();
		
		for (Serie unaSerie : this.series) 
			if (condiciones.test(unaSerie)) resultado.add(unaSerie);
		return resultado;
			
		}
		
	}