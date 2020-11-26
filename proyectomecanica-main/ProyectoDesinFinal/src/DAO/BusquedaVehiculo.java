package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Exception.BBdd;
import Models.Vehiculo;

/**
 * Esta clase buscamos el vehículo en la Bd y lo mostramos o por lo contrario
 * si no se encuentra da un error.
 */
public class BusquedaVehiculo {
	
	public Vehiculo obtenerVehiculoNum (Vehiculo vehiculo) {
		Vehiculo vehi = null;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		//conexion
		try {
			con = BBdd.conectar();
			String sql = "select * from vehiculo where num_bastidor= ?";
			
			
			pst = con.prepareStatement(sql);
			pst.setString(1, vehiculo.getNumBastidor()); //nombre_bastidor= ?
			
			rs = pst.executeQuery();
			
			//obtener registros
			while (rs.next()) {
				vehi = new Vehiculo(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),
						rs.getString(9),rs.getString(10),rs.getString(11), rs.getString(12), rs.getString(13), rs.getFloat(14), rs.getString(15),rs.getInt(16));
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener vehículo");
		}
		
		return vehi;
	}
	
	public Vehiculo obtenerVehiculoKm (Vehiculo vehiculo) {
		Vehiculo vehi = null;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		//conexion
		try {
			con = BBdd.conectar();
			String sql = "select * from vehiculo where km= ?";
			
			
			pst = con.prepareStatement(sql);
			pst.setInt(1, vehiculo.getKm()); 
			
			rs = pst.executeQuery();
			
			//obtener registros
			while (rs.next()) {
				vehi = new Vehiculo(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),
						rs.getString(9),rs.getString(10),rs.getString(11), rs.getString(12), rs.getString(13), rs.getFloat(14), rs.getString(15),rs.getInt(16));
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener vehículo");
		}
		
		return vehi;
	}
	
	public Vehiculo obtenerVehiculoAnio (Vehiculo vehiculo) {
		Vehiculo vehi = null;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		//conexion
		try {
			con = BBdd.conectar();
			String sql = "select * from vehiculo where anio = ?";
			
			
			pst = con.prepareStatement(sql);
			pst.setString(1, vehiculo.getAnio()); 
			
			rs = pst.executeQuery();
			
			//obtener registros
			while (rs.next()) {
				vehi = new Vehiculo(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),
						rs.getString(9),rs.getString(10),rs.getString(11), rs.getString(12), rs.getString(13), rs.getFloat(14), rs.getString(15),rs.getInt(16));
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener vehículo");
		}
		
		return vehi;
	}
	
	public Vehiculo obtenerVehiculoCombustible (Vehiculo vehiculo) {
		Vehiculo vehi = null;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		//conexion
		try {
			con = BBdd.conectar();
			String sql = "select * from vehiculo where combustible= ?";
			
			
			pst = con.prepareStatement(sql);
			pst.setString(1, vehiculo.getCombustible()); 
			
			rs = pst.executeQuery();
			
			//obtener registros
			while (rs.next()) {
				vehi = new Vehiculo(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),
						rs.getString(9),rs.getString(10),rs.getString(11), rs.getString(12), rs.getString(13), rs.getFloat(14), rs.getString(15),rs.getInt(16));
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener vehículo");
		}
		
		return vehi;
	}

}