package com.example.demo.modelocorrecion;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="registro_transferencia")
public class RegistroTransferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "registro_seq")
	@SequenceGenerator(name = "registro_seq",sequenceName = "registro_seq",allocationSize = 1)
	@Column(name="id_trans")
	private Integer id;
	@Column(name="fecha_trans")
	private LocalDateTime fecha;
	@Column(name="cuenta_origen_trans")
	private String cuentaOrigen;
	@Column(name="cuenta_destino_trans")
	private String cuentaDestino;
	@Column(name="monto_trans")
	private BigDecimal monto;
	@Column(name="comision_trans")
	private BigDecimal comision;
	//Gets y sets
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public String getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getComision() {
		return comision;
	}
	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}
	@Override
	public String toString() {
		return "RegistroTransferencia [id=" + id + ", fecha=" + fecha + ", cuentaOrigen=" + cuentaOrigen
				+ ", cuentaDestino=" + cuentaDestino + ", monto=" + monto + ", comision=" + comision + "]";
	}
	
	
	

}
