package Objetos;

public class Livros {
	
	private String titulo;
	private String autor;
	private String isbn;
	private int quantidadePaginas;
	private double valorCompra;
	
	public Livros(String titulo, String autor, String isbn, int quantidadePaginas, double valorCompra) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.quantidadePaginas = quantidadePaginas;
		this.valorCompra = valorCompra;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}
	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	@Override
	public String toString() {
		return "Livros [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", quantidadePaginas="
				+ quantidadePaginas + ", valorCompra=" + valorCompra + "]";
	}
	
	
}
