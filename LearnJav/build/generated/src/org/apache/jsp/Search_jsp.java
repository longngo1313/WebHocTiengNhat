package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("  \n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>H</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"JS/jquery-1.4.2.min.js\"></script>\n");
      out.write("        <script src=\"JS/jquery.autocomplete.js\"></script>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"css/shop-homepage.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write(" <script>\n");
      out.write("            jQuery(function () {\n");
      out.write("                $(\"#key\").autocomplete(\"list.jsp\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\">a</span>\n");
      out.write("                        <span class=\"icon-bar\">a</span>\n");
      out.write("                        <span class=\"icon-bar\">a</span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Học tiếng Nhật online</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <div class=\"row\"> <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">About</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"HocTap.html\">Học Tập</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- /.navbar-collapse -->         <!-- /.container -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Page Content --><hr>\n");
      out.write("<ul class=\"nav nav-tabs\" style=\"margin-left:250px;padding-bottom: 10px\">\n");
      out.write("            <li role=\"presentation\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                <a href=\"index\" class=\"label label-warning\">Home</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li role=\"presentation\" ><a href=\"Hoctap\" class=\"label label-warning\">Học Tập</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li role=\"presentation\" ><a href=\"error\"class=\"label label-warning\">eror</a></li>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <form class=\"form-horizontal\">\n");
      out.write("                    <div class=\"form-group form-group-lg\">\n");
      out.write("                        <label class=\"col-sm-2 control-label row form-group\" for=\"formGroupInputLarge\" style=\"margin-left:250px\">Tra tu</label>\n");
      out.write("                        <div class=\"col-xs-4\">\n");
      out.write("                           \n");
      out.write("                            <input class=\"form-control\" type=\"text\" id=\"key\" placeholder=\"Nhập Kanji,Hiragana hoặc Katakana\" name=\"key\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${word.wordSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                        <div class=\"col-xs-2\">\n");
      out.write("                            <button class=\"btn btn-default btn-lg\" type=\"text\" name=\"action\" value=\"Search\" />\n");
      out.write("                            <span class=\"glyphicon glyphicon-search\" aria-hidden=\"false\"></span> Search\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("<div class=\"container\">\n");
      out.write("                \n");
      out.write("                   <thead >   <table class=\"table\">\n");
      out.write("\n");
      out.write("                        <tr class=\"info\">\n");
      out.write("                            <th>Word</th>\n");
      out.write("\n");
      out.write("                            <th>Kanji</th>\n");
      out.write("                            <th>Âm Hán Việt</th>\n");
      out.write("                            <th>Nghĩa</th>\n");
      out.write("                            <th>Trình độ</th>\n");
      out.write("                        </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody class=\"active\">\n");
      out.write("                       \n");
      out.write("                            <tr class=\"active\">\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${word.wordSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${word.wordKanji}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${word.wordKata}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${word.wordMean}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${word.wordCatalog}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("            </div>\n");
      out.write("                <!-- Footer -->\n");
      out.write("                <footer>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container -->\n");
      out.write("\n");
      out.write("     \n");
      out.write("            \n");
      out.write("                </body>\n");
      out.write("\n");
      out.write("                </html>\n");
      out.write("\n");
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
