package Exemplo_EDI;

import java.text.NumberFormat;

public class RecursosNovo {

	private String mes_ano,
	   tipo_transferencia,
	   tipo_favorecido,
	   uf;
	private int codigo_siafi;				   
	private String municipio;
	private int codigo_funcao;
	private String nome_funcao;
	private int codigo_subfuncao;
	private int codigo_programa;
	private String nome_programa;
	private String codigo_acao;
	private String nome__acao,
	   linguagem_cidada;
	private String codigo_favorecido;
	private String nome_favorecido;
	private float valor_transferido;
	
	public RecursosNovo(String mes_ano, String tipo_transferencia, String tipo_favorecido, String uf, int codigo_siafi,
			String municipio, int codigo_funcao, String nome_funcao, int codigo_subfuncao, int codigo_programa,
			String nome_programa, String codigo_acao, String nome__acao, String linguagem_cidada, String codigo_favorecido,
			String nome_favorecido, float valor_transferido) {
		super();
		this.mes_ano = mes_ano;
		this.tipo_transferencia = tipo_transferencia;
		this.tipo_favorecido = tipo_favorecido;
		this.uf = uf;
		this.codigo_siafi = codigo_siafi;
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
	
	public RecursosNovo(String mes_ano, String tipo_transferencia, String tipo_favorecido, String uf, String codigo_siafi,
			String municipio, String codigo_funcao, String nome_funcao, String codigo_subfuncao, String codigo_programa,
			String nome_programa, String codigo_acao, String nome__acao, String linguagem_cidada,
			String codigo_favorecido, String nome_favorecido, String valor_transferido) {
		super();
		this.mes_ano = mes_ano.substring(1,mes_ano.length()-1); // remove 1o e último caracteres, no exemplo são as aspas
		this.tipo_transferencia = tipo_transferencia.substring(1,tipo_transferencia.length()-1);
		this.tipo_favorecido = tipo_favorecido;
		this.uf = uf;
		this.municipio = municipio;
		
		// remove as aspas e converte para inteiro
		try{
			this.codigo_siafi = Integer.parseInt(codigo_siafi.substring(1,codigo_siafi.length()-1));
		} catch (Exception e) {
			this.codigo_siafi=0;
		}
		
		try{
			this.codigo_funcao = Integer.parseInt(codigo_funcao.substring(1,codigo_funcao.length()-1));
		} catch (Exception e) {
			this.codigo_funcao=0;
		}
		
		this.nome_funcao = nome_funcao;
		
		try{
			this.codigo_subfuncao = Integer.parseInt(codigo_subfuncao.substring(1,codigo_subfuncao.length()-1));
		} catch (Exception e) {
			this.codigo_subfuncao=0;
		}
		
		try{
			this.codigo_programa = Integer.parseInt(codigo_programa.substring(1,codigo_programa.length()-1));
		} catch (Exception e) {
			this.codigo_programa=0;
		}
		

		this.nome_programa = nome_programa;
		this.codigo_acao = codigo_acao;
		
		this.nome__acao = nome__acao;
		this.linguagem_cidada = linguagem_cidada;
		this.codigo_favorecido = codigo_favorecido;	
		
		this.nome_favorecido = nome_favorecido;
		
		//remove as aspas, converte a , em . e transforma em valor float
		try{
			this.valor_transferido = Float.parseFloat(valor_transferido.substring(1,valor_transferido.length()-1).replace(",", "."));
		} catch (Exception e) {
			this.valor_transferido=0;
		}		
	}

	public String getMes_ano() {
		return mes_ano;
	}

	public String getTipo_transferencia() {
		return tipo_transferencia;
	}

	public String getTipo_favoreceido() {
		return tipo_favorecido;
	}

	public String getUf() {
		return uf;
	}

	public int getCodigo_siafi() {
		return codigo_siafi;
	}

	public String getMunicipio() {
		return municipio;
	}

	public int getCodigo_funcao() {
		return codigo_funcao;
	}

	public String getNome_funcao() {
		return nome_funcao;
	}

	public int getCodigo_subfuncao() {
		return codigo_subfuncao;
	}

	public int getCodigo_programa() {
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

	public float getValor_transferido() {
		return valor_transferido;
	}

	@Override
	public String toString() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(valor_transferido);
		return "RecursosNovo [mes_ano=" + mes_ano + ", tipo_transferencia=" + tipo_transferencia + ", tipo_favorecido="
				+ tipo_favorecido + ", uf=" + uf + ", codigo_siafi=" + codigo_siafi + ", municipio=" + municipio
				+ ", codigo_funcao=" + codigo_funcao + ", nome_funcao=" + nome_funcao + ", codigo_subfuncao="
				+ codigo_subfuncao + ", codigo_programa=" + codigo_programa + ", nome_programa=" + nome_programa
				+ ", codigo_acao=" + codigo_acao + ", nome__acao=" + nome__acao + ", linguagem_cidada="
				+ linguagem_cidada + ", codigo_favorecido=" + codigo_favorecido + ", nome_favorecido=" + nome_favorecido
				+ ", valor_transferido=" + moneyString + "]";
	}	

	
}




