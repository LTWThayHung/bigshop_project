package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import context.DBContext;
import entity.Category;
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

//	// lay ra tat ca san pham co cat_id la 10 ( kitchen)
//	public List<Products> getKitchenProDuct() {
//		List<Products> list = new ArrayList<Products>();
//		String query = "SELECT * FROM Product WHERE category_id = 10;";
//		try {
//			conn = new DBContext().getConnection();
//			if (conn != null) {
//				ps = conn.prepareStatement(query);
//				rs = ps.executeQuery();
//				while (rs.next()) {
//					list.add(new Products(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5),
//							rs.getString(6), rs.getString(7)));
//
//				}
//			} else {
//				System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
//		}
//
//		return list;
//	}

//	// lay ra tat ca san pham co cat_id la 11 ( PersonCare)
//		public List<Products> getPersonCareProDuct() {
//			List<Products> list = new ArrayList<Products>();
//			String query = "SELECT * FROM Product WHERE category_id = 11;";
//			try {
//				conn = new DBContext().getConnection();
//				if (conn != null) {
//					ps = conn.prepareStatement(query);
//					rs = ps.executeQuery();
//					while (rs.next()) {
//						list.add(new Products(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5),
//								rs.getString(6), rs.getString(7)));
//
//					}
//				} else {
//					System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
//				}
//
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
//			}
//
//			return list;
//		}

//		// lay ra tat ca san pham co cat_id la 12 ( HoldHouse)
//				public List<Products> getHoldHouseProDuct() {
//					List<Products> list = new ArrayList<Products>();
//					String query = "SELECT * FROM Product WHERE category_id = 12;";
//					try {
//						conn = new DBContext().getConnection();
//						if (conn != null) {
//							ps = conn.prepareStatement(query);
//							rs = ps.executeQuery();
//							while (rs.next()) {
//								list.add(new Products(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5),
//										rs.getString(6), rs.getString(7)));
//
//							}
//						} else {
//							System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
//						}
//
//					} catch (Exception e) {
//						e.printStackTrace();
//						System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
//					}
//
//					return list;
//				}

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

	public List<Category> getAllCategory() {
		List<Category> list = new ArrayList<Category>();
		String query = "select * from category";
		try {
			conn = new DBContext().getConnection();
			if (conn != null) {
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new Category(rs.getInt(1), rs.getString(2)));

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

	public List<Products> getProductByCID(String cid) {
		List<Products> list = new ArrayList<Products>();
		String query = "SELECT * FROM product WHERE category_id = ?";

		try {
			conn = new DBContext().getConnection();
			if (conn != null) {
				ps = conn.prepareStatement(query);

				ps.setString(1, cid);

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

	public Products getProductByID(String cid) {

		String query = "select * from product where id = ?";
		try {
			conn = new DBContext().getConnection();
			if (conn != null) {
				ps = conn.prepareStatement(query);
				ps.setString(1, cid);
				rs = ps.executeQuery();
				while (rs.next()) {
					return new Products(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5),
							rs.getString(6), rs.getString(7));

				}
			} else {
				System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
		}

		return null;

	}

	public List<Products> getProductBySellID(int id) {
		List<Products> list = new ArrayList<Products>();
		String query = "select * from Product where uID = ?";

		try {
			conn = new DBContext().getConnection();
			if (conn != null) {
				ps = conn.prepareStatement(query);

				ps.setInt(1, id);

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

	public void deleteProduct(String pid) {
		String query = "delete from Product where id = ?";

		try {
			conn = new DBContext().getConnection();
			if (conn != null) {
				ps = conn.prepareStatement(query);

				ps.setString(1, pid);

				ps.executeUpdate();

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
		}
	}

	public void insertProduct(String pid, String cid, String title, String discount, String thumbnail,
			String description, int uid) {
		String query = "insert into Product(id, category_id, title, price, discount, thumbnail, description, create_at, update_at , uID) values\r\n"
				+ "\r\n" + "(?,?,?,?,?,?,?,?,?,?)";
		try {
			conn = new DBContext().getConnection();
			if (conn != null) {
				ps = conn.prepareStatement(query);

				ps.setString(1, pid);
				ps.setString(2, cid);
				ps.setString(3, title);
				ps.setString(4, "0");
				ps.setString(5, discount);
				ps.setString(6, thumbnail);
				ps.setString(7, description);
				ps.setString(8, null);
				ps.setString(9, null);
				ps.setInt(10, uid);
				ps.executeUpdate();

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
		}

	}
	
	public void editProduct(String pid ,String title, String image, String price, String description) {
		String query = "update Product \r\n"
				+ "set [title] = ?,\r\n"
				+ "[thumbnail] =? ,\r\n"
				+ "[discount] = ?,\r\n"
				+ "[description] =? where id = ?";
		
		try {
			conn = new DBContext().getConnection();
			if (conn != null) {
				ps = conn.prepareStatement(query);

				ps.setString(1, title);
				ps.setString(2, image);
				ps.setString(3, price);
				ps.setString(4, description);
				ps.setString(5, pid);
				ps.executeUpdate();

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi khi thuc thi truy van: " + e.getMessage());
		}
		
		
	}

//	public static void main(String[] args) {
//		try {
//			new ProductDAO().editProduct("7002", "Banana", "images/kitchen/kc-oil.png", "70","Cooking oils, derived from sources like olive, vegetable, or coconut, play a crucial role\r\n"
//					+ "in culinary practices. They are used for frying, sautéing, and as dressings,\r\n"
//					+ "providing essential fats and enhancing the flavor of dishes.");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//	}
}
