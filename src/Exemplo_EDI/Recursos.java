package Exemplo_EDI;
public class Recursos {
	private String mes_ano,
				   tipo_transferencia,
				   tipo_favoreceido,
				   uf,
				   codigo_siafi,				   
				   municipio,
				   codigo_funcao,
				   nome_funcao,
				   codigo_subfuncao,
				   codigo_programa,
				   nome_programa,
				   codigo_acao,
				   nome__acao,
				   linguagem_cidada,
				   codigo_favorecido,
				   nome_favorecido,
				   valor_transferido;
		

	// Este método com filtro nos dados
	public Recursos(String mes_ano, String tipo_transferencia, String tipo_favoreceido, String uf, String codigo_siafi,
			String municipio, String codigo_funcao, String nome_funcao, String codigo_subfuncao, String codigo_programa,
			String nome_programa, String codigo_acao, String nome__acao, String linguagem_cidada,
			String codigo_favorecido, String nome_favorecido, String valor_transferido) {
		super();
		this.mes_ano = mes_ano.substring(1,mes_ano.length()-1); // remove 1o e último caracteres, no exemplo são as aspas
		this.tipo_transferencia = tipo_transferencia.substring(1,tipo_transferencia.length()-1);
		this.tipo_favoreceido = tipo_favoreceido;
		this.uf = uf;
		this.municipio = municipio;
		this.codigo_funcao = codigo_funcao;
		this.nome_funcao = nome_funcao;
		this.codigo_subfuncao = codigo_subfuncao;
		this.codigo_programa = codigo_programa;
		this.nome_programa = nome_programa;
		this.codigo_acao = codigo_acao;
		this.nome__acao = nome__acao;
		this.linguagem_cidada = linguagem_cidada;
		this.codigo_favorecido = codigo_favorecido;
		this.nome_favorecido = nome_favorecido;
		this.valor_transferido = valor_transferido;
	}
	

	public String getMes_ano() {
		return mes_ano;
	}

	public String getTipo_transferencia() {
		return tipo_transferencia;
	}

	public String getTipo_favoreceido() {
		return tipo_favoreceido;
	}

	public String getUf() {
		return uf;
	}

	public String getCodigo_siafi() {
		return codigo_siafi;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getCodigo_funcao() {
		return codigo_funcao;
	}

	public String getNome_funcao() {
		return nome_funcao;
	}

	public String getCodigo_subfuncao() {
		return codigo_subfuncao;
	}

	public String getCodigo_programa() {
		return codigo_programa;
	}

	public String getNome_programa() {
		return nome_programa;
	}

	public String getCodigo_acao() {
		return codigo_acao;
	}

	public String getNome__acao() {
		return nome__acao;
	}

	public String getLinguagem_cidada() {
		return linguagem_cidada;
	}

	public String getCodigo_favorecido() {
		return codigo_favorecido;
	}

	public String getNome_favorecido() {
		return nome_favorecido;
	}

	public String getValor_transferido() {
		return valor_transferido;
	}

	@Override
	public String toString() {
		return "Recursos [mes_ano=" + mes_ano + ", tipo_transferencia=" + tipo_transferencia + ", tipo_favoreceido="
				+ tipo_favoreceido + ", uf=" + uf + ", codigo_siafi=" + codigo_siafi + ", municipio=" + municipio
				+ ", codigo_funcao=" + codigo_funcao + ", nome_funcao=" + nome_funcao + ", codigo_subfuncao="
				+ codigo_subfuncao + ", codigo_programa=" + codigo_programa + ", nome_programa=" + nome_programa
				+ ", codigo_acao=" + codigo_acao + ", nome__acao=" + nome__acao + ", linguagem_cidada="
				+ linguagem_cidada + ", codigo_favorecido=" + codigo_favorecido + ", nome_favorecido=" + nome_favorecido
				+ ", valor_transferido=" + valor_transferido + ", getMes_ano()=" + getMes_ano()
				+ ", getTipo_transferencia()=" + getTipo_transferencia() + ", getTipo_favoreceido()="
				+ getTipo_favoreceido() + ", getUf()=" + getUf() + ", getCodigo_siafi()=" + getCodigo_siafi()
				+ ", getMunicipio()=" + getMunicipio() + ", getCodigo_funcao()=" + getCodigo_funcao()
				+ ", getNome_funcao()=" + getNome_funcao() + ", getCodigo_subfuncao()=" + getCodigo_subfuncao()
				+ ", getCodigo_programa()=" + getCodigo_programa() + ", getNome_programa()=" + getNome_programa()
				+ ", getCodigo_acao()=" + getCodigo_acao() + ", getNome__acao()=" + getNome__acao()
				+ ", getLinguagem_cidada()=" + getLinguagem_cidada() + ", getCodigo_favorecido()="
				+ getCodigo_favorecido() + ", getNome_favorecido()=" + getNome_favorecido()
				+ ", getValor_transferido()=" + getValor_transferido() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
			

}
