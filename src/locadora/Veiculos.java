/* Modelo Veiculos
 * Autor: Rodrigo Alves
 * Função da classe: ser o modelo para persistencia dos dados no banco veiculos
 */

package locadora;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="carro_reservado")
public class Veiculos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//cria um id auto incrementado
	
	@Column
	private String nome_cliente;
	@Column
	private String nome_carro;
	@Column
	private String categoria;
	@Column
	private String ano;
	@Column
	private String placa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getNome_carro() {
		return nome_carro;
	}
	public void setNome_carro(String nome_carro) {
		this.nome_carro = nome_carro;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getEstado_conservacao() {
		return estado_conservacao;
	}
	public void setEstado_conservacao(String estado_conservacao) {
		this.estado_conservacao = estado_conservacao;
	}
	public String getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}
	public String getTnq_combustivel() {
		return tnq_combustivel;
	}
	public void setTnq_combustivel(String tnq_combustivel) {
		this.tnq_combustivel = tnq_combustivel;
	}
	@Column
	private String modelo;
	@Column
	private String cor;
	@Column
	private String estado_conservacao;
	@Column
	private String quilometragem;
	@Column
	private String tnq_combustivel;
	
}
