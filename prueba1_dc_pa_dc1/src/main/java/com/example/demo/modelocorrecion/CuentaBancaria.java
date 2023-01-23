package com.example.demo.modelocorrecion;



import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cuenta_bancaria")
public class CuentaBancaria {

	@Id
	@Column(name="numero_cuen")
	private String numero;
	@Column(name="tipo_cuen")
	private String tipo;
	@Column(name="saldo_cuen")
	private BigDecimal saldo;
	@Column(name="cedula_cuen")
	private String cedula;
	
	
	//Gets y sets
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + ", cedula=" + cedula + "]";
	}
	
	
	
	
}
