package com.generation.farmacia.model;
	
	import java.util.List;
	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;
	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	import com.sun.istack.NotNull;

	@Entity
	@Table (name = "tb_produto")
	public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull
		private String descricao;
		
		@OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("produto")
		private List<Postagem> postagem;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public List<Postagem> getPostagem() {
			return postagem;
		}
		public void setPostagem(List<Postagem> postagem) {
			this.postagem = postagem;
		}


}
