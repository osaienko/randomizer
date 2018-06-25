/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-25 09:43:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"/apple-touch-icon.png\">\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"/favicon-32x32.png\">\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"/favicon-16x16.png\">\n");
      out.write("<link rel=\"manifest\" href=\"/site.webmanifest\">\n");
      out.write("<link rel=\"mask-icon\" href=\"/safari-pinned-tab.svg\" color=\"#5bbad5\">\n");
      out.write("<meta name=\"msapplication-TileColor\" content=\"#da532c\">\n");
      out.write("<meta name=\"theme-color\" content=\"#ffffff\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\n");
      out.write("<script src=\"myjs.js\"></script>\n");
      out.write("<title>Randomize!</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Randomize!</h2>\n");
      out.write("      <form class = \"centered\">\n");
      out.write("              <table>\n");
      out.write("                <tr>\n");
      out.write("                  <td align=\"left\" class = \"styledText\">Player One:</td>\n");
      out.write("                  <td align=\"left\"><input type=\"text\" class = \"input\" name=\"player0\" id=\"name0\" value=\"Meli4\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td align=\"left\" class = \"styledText\">Player Two:</td>\n");
      out.write("                  <td align=\"left\"><input type=\"text\" class = \"input\"  name=\"player1\" id=\"name1\" value=\"Misha\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td align=\"left\" class = \"styledText\">Player Three:</td>\n");
      out.write("                  <td align=\"left\"><input type=\"text\" class = \"input\"  name=\"player2\" id=\"name2\" value=\"Valeriy\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"left\" class = \"styledText\">Player Four:</td>\n");
      out.write("                    <td align=\"left\"><input type=\"text\" class = \"input\"  name=\"player3\" id=\"name3\" value=\"Andrew\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"left\" class = \"styledText\">Player Five:</td>\n");
      out.write("                    <td align=\"left\"><input type=\"text\" class = \"input\"  name=\"player4\" id=\"name4\" value=\"Oleg\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"left\" class = \"styledText\">Player Six:</td>\n");
      out.write("                    <td align=\"left\"><input type=\"text\" class = \"input\"  name=\"player5\" id=\"name5\" value=\"Alex\"></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("      <div class=\"centered\">\n");
      out.write("      <input type=\"checkbox\" name=\"targ\" id=\"house0\" value=\"T\" checked/>\n");
      out.write("      <img src=\"img/targ.png\"/>\n");
      out.write("      <input type=\"checkbox\" name=\"bara\" id=\"house1\" value=\"B\" checked/>\n");
      out.write("      <img src=\"img/baratheon.png\"/>\n");
      out.write("      <input type=\"checkbox\" name=\"stark\" id=\"house2\"value=\"S\" checked/>\n");
      out.write("      <img src=\"img/stark.png\"/><br>\n");
      out.write("      <input type=\"checkbox\" name=\"martel\" id=\"house3\" value=\"M\" checked/>\n");
      out.write("      <img src=\"img/martel.png\"/>\n");
      out.write("      <input type=\"checkbox\" name=\"greyjoy\" id=\"house4\" value=\"G\" checked/>\n");
      out.write("      <img src=\"img/greyjoy.png\"/>\n");
      out.write("      <input type=\"checkbox\" name=\"lannister\" id=\"house5\" value=\"L\" checked/>\n");
      out.write("      <img src=\"img/lannister.png\"/>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class = \"centered\">\n");
      out.write("      <button class=\"btn\" onclick = \"makeJson()\">Randomize!!</button>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("     <form class = \"centered\">\n");
      out.write("                   <table>\n");
      out.write("                     <tr>\n");
      out.write("                       <td align=\"left\" id=\"pResult0\" class = \"styledText\"></td>\n");
      out.write("                       <td align=\"left\" id=\"hResult0\"></td>\n");
      out.write("                       <td align=\"left\" id=\"pResult1\" class = \"styledText\"></td>\n");
      out.write("                       <td align=\"left\" id=\"hResult1\"></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                       <td align=\"left\" id=\"pResult2\" class = \"styledText\"></td>\n");
      out.write("                       <td align=\"left\" id=\"hResult2\"></td>\n");
      out.write("                       <td align=\"left\" id=\"pResult3\" class = \"styledText\"></td>\n");
      out.write("                       <td align=\"left\" id=\"hResult3\"></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                       <td align=\"left\" id=\"pResult4\" class = \"styledText\"></td>\n");
      out.write("                       <td align=\"left\" id=\"hResult4\"></td>\n");
      out.write("                       <td align=\"left\" id=\"pResult5\" class = \"styledText\"></td>\n");
      out.write("                       <td align=\"left\" id=\"hResult5\"></td>\n");
      out.write("                     </tr>\n");
      out.write("      </table>\n");
      out.write("     </form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}