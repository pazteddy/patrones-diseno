package estructural.Proxy;

import estructural.Proxy.Interface.ICuenta;
//import estructural.Proxy.Interface.Implementacion.CuentaBancoAImpl;
import estructural.Proxy.Interface.Implementacion.CuentaBancoBImpl;
import estructural.Proxy.Interface.Proxy.CuentaProxy;
import estructural.Proxy.Model.Cuenta;

public class App {
	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "Lucho", 100);

		// ICuenta cuentaProxy = new CuentaProxy();
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);

	}
}
