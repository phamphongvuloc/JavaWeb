package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.product;
import DAL.productDAL;
import java.util.ArrayList;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Bonfire một thương mại cần câu cá</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <!--theme-style-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("        <!--//theme-style-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!--fonts-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--//fonts-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($) {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--slider-script-->\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#slider1\").responsiveSlides({\n");
      out.write("                    auto: true,\n");
      out.write("                    speed: 500,\n");
      out.write("                    namespace: \"callbacks\",\n");
      out.write("                    pager: true,\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--//slider-script-->\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close').on('click', function (c) {\n");
      out.write("                    $('.message').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close1').on('click', function (c) {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("         <div class=\"banner-mat\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"banner\">\n");
      out.write("\n");
      out.write("                        <!-- Slideshow 4 -->\n");
      out.write("                        <div class=\"slider\">\n");
      out.write("                            <ul class=\"rslides\" id=\"slider1\">\n");
      out.write("                                <li><img src=\"images/banner.jpg\" alt=\"\">\n");
      out.write("                                </li>\n");
      out.write("                                <li><img src=\"images/banner1.jpg\" alt=\"\">\n");
      out.write("                                </li>\n");
      out.write("                                <li><img src=\"images/banner.jpg\" alt=\"\">\n");
      out.write("                                </li>\n");
      out.write("                                <li><img src=\"images/banner2.jpg\" alt=\"\">\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"banner-bottom\">\n");
      out.write("                            <div class=\"banner-matter\">\n");
      out.write("                                <p>Childish Gambino - Camp Now Available for just $9.99</p> \n");
      out.write("                                <a href=\"single.html\" class=\"hvr-shutter-in-vertical \">Purchase</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"purchase\">\n");
      out.write("                                <a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">Purchase</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\t\t\t\t\n");
      out.write("                    <!-- //slider-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!---->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"content-top\">\n");
      out.write("                        <h3 class=\"future\">SẢN PHẨM</h3>\n");
      out.write("                    ");

                        productDAL prod = new productDAL();
               
                        ArrayList<product> listprod = prod.showAll();
                    
      out.write("\n");
      out.write("                    <div class=\"content-top-in\">\n");
      out.write("                        ");

                            for (product item : listprod) {
                        
      out.write("\n");
      out.write("                        <div class=\"col-md-3 md-col\">\n");
      out.write("                            <div class=\"col-md\">\n");
      out.write("                                <a href=\"single.jsp?ProductID=");
      out.print( item.getProduct_id());
      out.write("\"><img width=\"204\" height=\"177\"  src=\"");
      out.print( item.getProduct_image());
      out.write("\" alt=\"\" /></a>\t\n");
      out.write("                                <div class=\"top-content\">\n");
      out.write("                                    <h5><a href=\"single.jsp?ProductID=");
      out.print( item.getProduct_id());
      out.write('"');
      out.write('>');
      out.print( item.getProduct_name());
      out.write("</a></h5>\n");
      out.write("                                    <div class=\"white\">\n");
      out.write("                                        <a href=\"CartServlet?command=add&ProductID=");
      out.print( item.getProduct_id());
      out.write("\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">ADD TO CART</a>\n");
      out.write("                                        <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>");
      out.print( item.getProduct_price());
      out.write("</span></p>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"start\">\n");
      out.write("                    <li ><a href=\"#\"><i></i></a></li>\n");
      out.write("                              <li class=\"arrow\"><a href=\"#\">1</a></li>\n");
      out.write("                              <li class=\"arrow\"><a href=\"#\">2</a></li>\n");
      out.write("                        \n");
      out.write("                    <li ><a href=\"#\"><i  class=\"next\"> </i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
