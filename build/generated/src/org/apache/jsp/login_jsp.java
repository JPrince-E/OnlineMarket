package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/signup-style.css\">\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id='container'>\r\n");
      out.write("  <div class='signup'>\r\n");
      out.write("      <form action=\"loginAction.jsp\" method=\"post\">\r\n");
      out.write("          <input type=\"email\" name=\"email\" placeholder=\"Enter Email\" required=\"\">\r\n");
      out.write("          <input type=\"password\" name=\"password\" placeholder=\"Enter Password\" required=\"\">\r\n");
      out.write("          <input type=\"submit\" value=\"login\">\r\n");
      out.write("          \r\n");
      out.write("      </form>\r\n");
      out.write("      <h2><a href=\"signup.jsp\">SignUp</a></h2>\r\n");
      out.write("       <h2><a href=\"forgotPassword.jsp\">Forgot Password?</a></h2>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class='whysignLogin'>\r\n");
      out.write("  \r\n");

String msg=request.getParameter("msg");
if("notexist".equals(msg)){

      out.write("\r\n");
      out.write("<h1>Incorrect Username or Password</h1>\r\n");
      out.write("\r\n");
}
      out.write('\r');
      out.write('\n');
if("invalid".equals(msg)) {
      out.write("\r\n");
      out.write("<h1>Some thing Went Wrong! Try Again !</h1>\r\n");
      out.write("    \r\n");
}
      out.write("\r\n");
      out.write("    <h2>Online Shopping</h2>\r\n");
      out.write("    <p>The Online Shopping System is the application that allows the users to shop online without going to the shops to buy them.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
