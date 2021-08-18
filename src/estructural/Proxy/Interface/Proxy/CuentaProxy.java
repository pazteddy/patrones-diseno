package estructural.Proxy.Interface.Proxy;
// 2 MOSTRAMOS IMPLEMENTACION LOGGER

// PODEMOS IMPLEMENTAR CODIGO ADICIONAL SIN REALIZAR CAMBIOS EN LA CLASE BASE
import java.util.logging.Logger;

import estructural.Proxy.Interface.ICuenta;
import estructural.Proxy.Interface.Implementacion.CuentaBancoAImpl;
import estructural.Proxy.Model.Cuenta;

public class CuentaProxy implements ICuenta {

	// private CuentaBancoAImpl cuentaReal;

	private ICuenta cuentaReal;

	private final static Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName());

	// 3 LOGRAR QUE NUESTRO WRPPER SE PUEDA CONECTAR Y DESCONECTAR A OTROS OBJETOS
	// DE LA MISMA CLASE
	public CuentaProxy(ICuenta cuentaReal) {
		this.cuentaReal = cuentaReal;
	}

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		LOGGER.info("----Cuenta Proxy - Retirar Dinero----");
		// 1.- ENCAPSULAMOS LA LOGICA DE CREACIOM DE UN RECURSO COSTOSO (OPCIONAL)
		crearRecursoCostoso();
		return cuentaReal.retirarDinero(cuenta, monto);
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		LOGGER.info("----Cuenta Proxy - Depositar Dinero----");
		crearRecursoCostoso();
		return cuentaReal.depositarDinero(cuenta, monto);
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		LOGGER.info("----Cuenta Proxy - Mostrar Dinero----");
		crearRecursoCostoso();
		cuentaReal.mostrarSaldo(cuenta);
	}

	private void crearRecursoCostoso() {
		if (cuentaReal == null) {
			cuentaReal = new CuentaBancoAImpl();
		}
	}

}
