package es.ucm.fdi.iw.model;

import java.util.List;

import javax.persistence.*;


//@Entity
public class Valoracion {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Integer idUsuarioQueValora;
	private Integer idUsuarioValorado;
	private String comentario;
	private Integer valor;
//	@ManyToMany(mappedBy="valoracionesRecibidas")
	private List<Usuario> usuariosValorados;
//	@ManyToMany(mappedBy="valoracionesDadas")
	private List<Usuario> usuariosQueValoran;
	
	
	public long getId() {
		return id;
	}
	public void setId(long idValoracion) {
		this.id = idValoracion;
	}
	public Integer getIdUsuarioQueValora() {
		return idUsuarioQueValora;
	}
	public void setIdUsuarioQueValora(Integer idUsuarioQueValora) {
		this.idUsuarioQueValora = idUsuarioQueValora;
	}
	public Integer getIdUsuarioValorado() {
		return idUsuarioValorado;
	}
	public void setIdUsuarioValorado(Integer idUsuarioValorado) {
		this.idUsuarioValorado = idUsuarioValorado;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	
}
