package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.ConnectionProviderClass;
import java.sql.*;

public final class loginAction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

  String email=request.getParameter("email");
  String password=request.getParameter("password");
  if("admin@gmail.com".equals(email) && "admin".equals(password)){
      session.setAttribute("email", email);
      response.sendRedirect("admin/adminHome.jsp");
  }else{
      int z=0;
      try{
          Connection con=ConnectionProviderClass.getCon();
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select * from users where email='"+email+"' and password='"+password+"'");
          while (rs.next()){
              z=1;
              session.setAttribute("email", email);
              response.sendRedirect("home.jsp");
          }
          if(z==0){
              response.sendRedirect("login.jsp?msg=notexist");
          }
      }catch(Exception e){
          System.out.println(e);
          response.sendRedirect("login.jsp?msg=notexist");
      }
  }

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
