package org.apache.jsp.Ejercicio_002014;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"#\">\n");
      out.write("        <p>Lista de cursos</p>\n");
      out.write("        <label>\n");
      out.write("            <input type=\"checkbox\" name=\"courses\" value=\"JavaScript\">JavaScript\n");
      out.write("        </label>\n");
      out.write("        <label>\n");
      out.write("            <input type=\"checkbox\" name=\"courses\" value=\"MySQL\">MySQL\n");
      out.write("        </label>\n");
      out.write("        <label>\n");
      out.write("            <input type=\"checkbox\" name=\"courses\" value=\"Matemática I\">Matemática I\n");
      out.write("        </label>\n");
      out.write("        <label>\n");
      out.write("            <input type=\"checkbox\" name=\"courses\" value=\"UML\">UML\n");
      out.write("        </label>\n");
      out.write("        <label>\n");
      out.write("            <input type=\"checkbox\" name=\"courses\" value=\"Angular\">Angular\n");
      out.write("        </label>\n");
      out.write("        <input type=\"button\" name=\"\" id=\"button\" value=\"Procesar\">\n");
      out.write("    </form>\n");
      out.write("    <textarea name=\"result\" id=\"result\" cols=\"30\" rows=\"10\"></textarea>\n");
      out.write("    <script src=\"script.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
