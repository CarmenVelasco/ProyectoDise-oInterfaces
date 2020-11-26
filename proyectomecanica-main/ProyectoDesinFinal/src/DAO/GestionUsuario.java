package DAO;

import java.security.MessageDigest;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.xml.bind.DatatypeConverter;

import Exception.BBdd;
import Models.RolUsuario;
import Models.Usuario;

public class GestionUsuario {
	
	public Usuario obtenerUsuario (Usuario usu) {
		Usuario usuario = null;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		//conexion
		try {
			
			MessageDigest md = MessageDigest.getInstance("MD5");
			
			con = BBdd.conectar();
			String sql = "select*from usuario where nombre_usuario= ? and contrasenia= ?";
			
			md.update(usu.getContrasenia().getBytes());
		    byte[] digest = md.digest();
		    String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
			
			pst = con.prepareStatement(sql);
			pst.setString(1, usu.getNombre_usuario()); //nombre_usuario= ?
			pst.setString(2, myHash); //contrasenia= ?
			
			rs = pst.executeQuery();
			
			//obtener registros
			while (rs.next()) {
				
				usuario = new Usuario(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10), RolUsuario.valueOf(rs.getString(11)));
				
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener usuario");
		}
		
		return usuario;
	}

}