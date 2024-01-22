package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import entity.Category;
import entity.Products;

/**
 * Servlet implementation class LoadProduct
 */
@WebServlet("/loadProduct")
public class LoadProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pID = request.getParameter("pid");
		
		ProductDAO productDAO = new ProductDAO();
		Products p = productDAO.getProductByID(pID);
		
		request.getSession().setAttribute("detail", p);
		List<Category> listAllCategory = new ArrayList<Category>();
		listAllCategory = productDAO.getAllCategory();
		request.setAttribute("listAllCategory", listAllCategory);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Edit.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
