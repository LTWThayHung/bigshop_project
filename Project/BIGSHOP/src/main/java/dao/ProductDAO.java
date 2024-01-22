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

//	public static void main(String[] args) {
//		try {
//			new ProductDAO().deleteProduct("7001");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//	}
}
