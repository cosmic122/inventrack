package model;

import java.sql.*;

import repository.Conexion;

public class invLogDAOImp implements invLogDAO{
	
	@Override
	public boolean registrar(invLog log) {
		
		boolean registrar = false;
		Statement stm = null;
		Connection conn = null;
		
		String sql = "insert into inventrack.invlog (upn, did, sku, companyname, ticket)" + 
					 "values ('" + log.getUpn() + "','" + log.getDid() + "','" + log.getSku() + "','" + log.getCompanyname() + "','" + log.getTicket() + "')";
		
		try {
			conn = Conexion.conectar();
			stm = conn.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			conn.close();
		}
		
		catch (SQLException e) {
			System.out.println("Error: no se pudo registrar el usuario.");
			e.printStackTrace();
		}
		
		return registrar;

	}
	
	@Override
	public boolean validar(invLog log) {
		return false;
	}
	
	@Override
	public invLog consultar(invLog log) {
		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		invLog u = new invLog(); 
		
		String sql = "select id from inventrack.invlog where upn = '" + log.getUpn() + "'";
		
		try {
			conn = Conexion.conectar();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u.setId(rs.getInt(1));
			}
			stm.close();
			rs.close();
			conn.close();
			
		}
		
		catch (SQLException e) {
			System.out.println("Error: no se pudo completar el registro de la activación.");
			e.printStackTrace();
			
		}
		
		return u;
	}
	
	
	
	

}
