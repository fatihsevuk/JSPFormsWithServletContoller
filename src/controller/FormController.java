package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormController
 */
@WebServlet("/FormController")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("ISO-8859-9");
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
		String ad=request.getParameter("ad");
		String soyad=request.getParameter("soyad");
		String il=request.getParameter("il");
		String dil=request.getParameter("dil");
		String os=request.getParameter("os");
		
		
		pw.write("<html>");
		pw.write("<body>");
		pw.write("Ad:"+ad+"<br/>");
		pw.write("Soyad:"+soyad+"<br/>");
		pw.write("Ýl:"+il+"<br/>");
		pw.write("Programlama Dili:"+dil+"<br/>");
		pw.write("Ýþletim Sistemi:"+os+"<br/>");
		pw.write("</body></html>");
		
	}

}
