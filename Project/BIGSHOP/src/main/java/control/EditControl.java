package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductDAO;

/**
 * Servlet implementation class EditControl
 */
@WebServlet("/edit")
public class EditControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("pid");
		String pimage = request.getParameter("image");
		String pprice = request.getParameter("price");
		String ptitle = request.getParameter("title");
		String pdescription = request.getParameter("description");
		
		System.out.println(pid);
		System.out.println(pimage);
		System.out.println(pprice);
		System.out.println(ptitle);
		System.out.println(pdescription);
		
		
		
		ProductDAO dao = new ProductDAO();
		dao.editProduct(pid, ptitle, pimage, pprice, pdescription);
		response.sendRedirect("manager");
	}

}
