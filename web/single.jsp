<%-- 
    Document   : single
    Created on : Nov 1, 2019, 12:16:47 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.product, DAL.productDAL" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Bonfire một thương mại cần câu cá</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <!--theme-style-->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
        <!--//theme-style-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--fonts-->
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <!--//fonts-->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!--slider-script-->
        <script src="js/responsiveslides.min.js"></script>
        <script>
            $(function () {
                $("#slider1").responsiveSlides({
                    auto: true,
                    speed: 500,
                    namespace: "callbacks",
                    pager: true,
                });
            });
        </script>
        <!--//slider-script-->
        <script>$(document).ready(function (c) {
                $('.alert-close').on('click', function (c) {
                    $('.message').fadeOut('slow', function (c) {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close1').on('click', function (c) {
                    $('.message1').fadeOut('slow', function (c) {
                        $('.message1').remove();
                    });
                });
            });
        </script>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        
          <%
            productDAL p = new productDAL();
            String product_id="";
    if(request.getParameter("ProductID")!=null ){
        product_id=request.getParameter("ProductID");
}
    
%>
        <div class="container">
			<div class="single">
				<div class="col-md-9 top-in-single">
                                    <%
                                        product x = p.productByProductID(Long.parseLong(product_id));
                                        %>
					<div class="col-md-5 single-top">	
						<ul id="etalage">
							<li>
								<a href="optionallink.html">
									<img class="etalage_thumb_image img-responsive" src="<%= x.getProduct_image() %>" alt="" >
																	</a>
							</li>   
						</ul>
					</div>	
					<div class="col-md-7 single-top-in">
						<div class="single-para">
							<h4><%= x.getProduct_name() %></h4>
							<div class="para-grid">
								<span  class="add-to">$<%= x.getProduct_price() %></span>
								<a href="CartServlet?command=add&ProductID=<%= x.getProduct_id() %>" class="hvr-shutter-in-vertical cart-to">Add to Cart</a>					
								<div class="clearfix"></div>
							 </div>
							<h5>100 items in stock</h5>
							<p><%= x.getProduct_description() %></p>
							
								<a href="#" class="hvr-shutter-in-vertical ">More details</a>
							
						</div>
					</div>
				<div class="clearfix"> </div>
				
				</div>
				
				<div class="clearfix"> </div>
		</div>
	</div>
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
