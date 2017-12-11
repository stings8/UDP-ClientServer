package model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
*
* @Sting
* 
* */

public class Veiculo implements Serializable {
	private String modelo;
	private String marca;
	private int ano;
	private String placa;
	private String nomeProprietario;
	private String endereco;
	private Date dataNascimento;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		DateFormat df = new SimpleDateFormat("dd-MM-YYYY");
		return "Veiculo  :\n" + "    Modelo      : " + this.modelo + "\n    Marca       : " + this.marca
				+ "\n    Ano         : " + this.ano + "\n    Placa       : " + this.placa + "\n    Propietario : "
				+ this.nomeProprietario + "\n    Nascimento  : " + df.format(dataNascimento) + "\n    Endereço    : "
				+ this.endereco;
	}

}
