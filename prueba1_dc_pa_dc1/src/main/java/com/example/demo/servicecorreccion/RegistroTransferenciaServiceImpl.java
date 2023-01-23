package com.example.demo.servicecorreccion;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.modelocorrecion.CuentaBancaria;
import com.example.demo.modelocorrecion.RegistroTransferencia;
import com.example.demo.repocorreccion.ICuentaBancariaRepo;
import com.example.demo.repocorreccion.IRegistroTransferenciaRepo;


@Service
public class RegistroTransferenciaServiceImpl implements IRegistroTransferenciaService {

	@Autowired
	private ICuentaBancariaRepo bancariaRepo;
	
	@Autowired
	private IRegistroTransferenciaRepo iRegistroTransferenciaRepo;
	
	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		//ORIGEN
		CuentaBancaria origen = this.bancariaRepo.buscar(numeroOrigen);
		BigDecimal comision=monto.multiply(new BigDecimal(0.05));
		BigDecimal montoDebitar=monto.add(comision);
		
		/*VALIDACION*/
		BigDecimal saldoActualOrigen= origen.getSaldo();

		
		//-1 si el de la izquierda es menor
		if (saldoActualOrigen.compareTo(montoDebitar)<0) {
			System.out.println("Monto no permitido");

		}else {
			//ORIGEN
			origen.setSaldo(saldoActualOrigen.subtract(montoDebitar));
			this.bancariaRepo.actualizar(origen);
			
			//Se realiza la transferencia
			//DESTINO
			CuentaBancaria destino = this.bancariaRepo.buscar(numeroDestino);
			BigDecimal saldoActualDestino= destino.getSaldo();
			destino.setSaldo(saldoActualDestino.add(monto));
			this.bancariaRepo.actualizar(destino);
			
			//TRANSFERENCIA
			RegistroTransferencia tranfer=new RegistroTransferencia();
			tranfer.setComision(comision);
			tranfer.setFecha(LocalDateTime.now());
			tranfer.setMonto(monto);
			tranfer.setCuentaDestino(numeroDestino);
			tranfer.setCuentaOrigen(numeroOrigen);
			
			
			this.iRegistroTransferenciaRepo.insertar(tranfer);
		}
		
		
		
		
		
	}



}
