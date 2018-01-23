package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import dto.Menu_dto;



public class Menu_dao {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/Practice";
	String uid = "yaeger";
	String pw = "21300267";
	
	public Menu_dao() {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, uid, pw);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void write(String type, String name, int price, String location, boolean single, boolean delivery, int portion, String phone, String address, String imgFile) {
		// TODO Auto-generated method stub	
		
		try {
			
			String query = "insert into menu (type, name, price, location, single, delivery, portion, phone,address, imgFile) values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, type);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, price);
			preparedStatement.setString(4, location);
			preparedStatement.setBoolean(5, single);
			preparedStatement.setBoolean(6, delivery);
			preparedStatement.setInt(7, portion);
			preparedStatement.setString(8, phone);
			preparedStatement.setString(9, address);
			preparedStatement.setString(10, imgFile);
			int rn = preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public ArrayList<Menu_dto> list() {
		
		ArrayList<Menu_dto> dtos = new ArrayList<Menu_dto>();
		ResultSet resultSet = null;
		
		try {
			
			String query = "select id, type, name, price, location, single, delivery, portion, phone, address, imgFile, victory from product";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String type = resultSet.getString("type");
				String name = resultSet.getString("name");
				int price = resultSet.getInt("price");
				String location = resultSet.getString("location");
				boolean single = resultSet.getBoolean("single");
				boolean delivery = resultSet.getBoolean("delivery");
				int portion = resultSet.getInt("portion");
				String phone = resultSet.getString("phone");
				String address = resultSet.getString("address");
				String imgFile = resultSet.getString("imgFile");
				int victory = resultSet.getInt("victory");
			
				Menu_dto dto = new Menu_dto(id, type, name, price, location, single, delivery, portion, phone, address, imgFile, victory);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	
	public Menu_dto content(String strID) {
		// TODO Auto-generated method stub
			
		Menu_dto dto = null;
		ResultSet resultSet = null;
		
		try {
			
			String query = "select * from menu where productId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(strID));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int id = resultSet.getInt("id");
				String type = resultSet.getString("type");
				String name = resultSet.getString("name");
				int price = resultSet.getInt("price");
				String location = resultSet.getString("location");
				boolean single = resultSet.getBoolean("single");
				boolean delivery = resultSet.getBoolean("delivery");
				int portion = resultSet.getInt("portion");
				String phone = resultSet.getString("phone");
				String address = resultSet.getString("address");
				String imgFile = resultSet.getString("imgFile");
				int victory = resultSet.getInt("victory");
			
				dto = new Menu_dto(id, type, name, price, location, single, delivery, portion, phone,address, imgFile, victory);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
	public void delete(String id) {
		// TODO Auto-generated method stub

		try {
			String query = "delete from menu where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(id));
			int rn = preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public void modify(int id ,String type, String name, int price, String location, boolean single, boolean delivery, int portion,String phone, String address, String imgFile) {
		// TODO Auto-generated method stub
	
		try {
			
			String query = "update menu set  = ?, date = ?, explanation = ? price = ?, location=?, single=?, delivery=?, portion=?, phone=?, address=?, imgFile =?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, type);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, price);
			preparedStatement.setString(4, location);
			preparedStatement.setBoolean(5, single);
			preparedStatement.setBoolean(6, delivery);
			preparedStatement.setInt(7, portion);
			preparedStatement.setString(8, phone);
			preparedStatement.setString(9, address);
			preparedStatement.setString(10, imgFile);
			preparedStatement.setInt(11, id);
			int rn = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}	
}
