package model;

public interface invLogDAO {
	
   public boolean registrar(invLog log);
	
	public boolean validar(invLog log);
	
	public invLog consultar(invLog log);

}
