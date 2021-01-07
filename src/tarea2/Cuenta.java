package tarea2;


/* Creacion de la clase cuenta con los parámetros que se pide */
public class Cuenta {
	
	private int nCuenta;
	private int saldo;
	private Cliente cliente;
	
	public Cuenta() {
		
		nCuenta = 0;
		saldo = 0;
		cliente = new Cliente();
		
	}
	
	public Cuenta(int n, int s, Cliente cliente) {
		
		this.nCuenta = n;
		this.saldo = s;
		this.cliente = cliente;
	}

	public int getnCuenta() {
		return nCuenta;
	}

	public void setnCuenta(int nCuenta) {
		this.nCuenta = nCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Cuenta [nCuenta=" + nCuenta + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}
	
	
	
	

}