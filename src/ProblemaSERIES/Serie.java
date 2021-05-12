package ProblemaSERIES;

public class Serie implements Comparable<Serie>{
	
	private String titulo;
	private Genero genero;
	private Integer calificacion;
	private Integer visualizaciones;
	private Double costo;
	private Integer capitulos;
	
	public Serie(String t, Genero ge, Integer c, Integer v, Double cos, Integer cap) {
		
		this.titulo = t;
		this.genero = ge;
		this.calificacion = c;
		this.visualizaciones = v;
		this.costo = cos;
		this.capitulos = cap;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Integer getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}
	public Integer getVisualizaciones() {
		return visualizaciones;
	}
	public void setVisualizaciones(Integer visualizaciones) {
		this.visualizaciones = visualizaciones;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public Integer getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(Integer capitulos) {
		this.capitulos = capitulos;
	}
	
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", calificacion=" + calificacion + "]";
	}
	
	@Override
	public int compareTo(Serie o) {
		return this.titulo.compareTo(o.titulo);
	}
	
	
	
	

}
