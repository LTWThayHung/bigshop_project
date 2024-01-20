package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import context.DBContext;
import entity.Products;

public class ProductDAO {
	public Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public List<Products> getAllProduct() {
		List<Products> list = new ArrayList<Products>();
		String query = "select * from product";
		try {
			conn = new DBContext().getConnection();
			if (conn != null) {
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new Products(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5),
							rs.getString(6), rs.getString(7)));

				}
			} else {
				System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
		}

		return list;

	}

	// tra ve danh sach 4 san pham ngau nhien
	public List<Products> get4RandomProduct() {
		List<Products> list = new ArrayList<Products>();
		String query = "SELECT TOP 4 * FROM Product ORDER BY NEWID();";
		try {
			conn = new DBContext().getConnection();
			if (conn != null) {
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new Products(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5),
							rs.getString(6), rs.getString(7)));

				}
			} else {
				System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
		}

		return list;

	}

	// lay ra tat ca san pham co cat_id la 10 ( kitchen)
	public List<Products> getKitchenProDuct() {
		List<Products> list = new ArrayList<Products>();
		String query = "SELECT * FROM Product WHERE category_id = 10;";
		try {
			conn = new DBContext().getConnection();
			if (conn != null) {
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new Products(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5),
							rs.getString(6), rs.getString(7)));

				}
			} else {
				System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
		}

		return list;
	}

	
	// lay ra tat ca san pham co cat_id la 11 ( PersonCare)
		public List<Products> getPersonCareProDuct() {
			List<Products> list = new ArrayList<Products>();
			String query = "SELECT * FROM Product WHERE category_id = 11;";
			try {
				conn = new DBContext().getConnection();
				if (conn != null) {
					ps = conn.prepareStatement(query);
					rs = ps.executeQuery();
					while (rs.next()) {
						list.add(new Products(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5),
								rs.getString(6), rs.getString(7)));

					}
				} else {
					System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
			}

			return list;
		}
	
		
		// lay ra tat ca san pham co cat_id la 12 ( HoldHouse)
				public List<Products> getHoldHouseProDuct() {
					List<Products> list = new ArrayList<Products>();
					String query = "SELECT * FROM Product WHERE category_id = 12;";
					try {
						conn = new DBContext().getConnection();
						if (conn != null) {
							ps = conn.prepareStatement(query);
							rs = ps.executeQuery();
							while (rs.next()) {
								list.add(new Products(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5),
										rs.getString(6), rs.getString(7)));

							}
						} else {
							System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
						}

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
					}

					return list;
				}
				
				
				// tra ve danh sach 4 san pham ngau nhien
				public List<Products> get10RandomProduct() {
					List<Products> list = new ArrayList<Products>();
					String query = "SELECT TOP 10 * FROM Product ORDER BY NEWID();";
					try {
						conn = new DBContext().getConnection();
						if (conn != null) {
							ps = conn.prepareStatement(query);
							rs = ps.executeQuery();
							while (rs.next()) {
								list.add(new Products(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5),
										rs.getString(6), rs.getString(7)));

							}
						} else {
							System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
						}

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
					}

					return list;

				}
	
//	public static void main(String[] args) {
//		try {
//			System.out.println(new ProductDAO().getKitchenProDuct());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//	}
}
