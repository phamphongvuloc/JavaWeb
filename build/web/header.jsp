<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.category,Model.user,Model.cart,Model.cartItem" %>
<%@page import="DAL.categoryDAL,DAL.userDAL" %>
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
        <%
            categoryDAL cat = new categoryDAL();
        %>
        <div class="header">
            <div class="header-top">
                <div class="container">	
                    <div class="header-top-in">			
                        <div class="logo">
                            <a href="index.jsp"><img src="images/logo.png" alt=" " ></a>
                        </div>
                        <div class="header-in">
                            <ul class="icon1 sub-icon1">
                                <li  >
                                    <%   user kh = new user();
                                        if (session.getAttribute("KhachHang") != null) {
                                            user u = (user) session.getAttribute("KhachHang");
                                    %>
                                    <a href="account.html"><%= u.getUser_fullname()%></a>
                                    <%
                                    } else {
                                    %>
                                    <a href="login.jsp">ĐĂNG NHẬP</a>
                                    <% } %>
                                </li>
                                <li > <a href="checkout.jsp" >GIỎ HÀNG</a> </li>	
                                <li><div class="cart">
                                        <%
                                            if (session.getAttribute("GioHang") != null) {
                                                cart giohang = (cart) session.getAttribute("GioHang");
                                        %>
                                        <a href="#" class="cart-in"> </a>
                                        <span><%= giohang.countItem()%> </span>
                                    </div>
                                    <ul class="sub-icon1 list">
                                        <%
                                                                    if (giohang.countItem() > 0) {%>
                                        <h3>Recently added items(<%= giohang.countItem()%>)</h3>
                                        <div class="shopping_cart">
                                            <% for (cartItem item : giohang.getCart()) {%>
                                            <div class="cart_box">
                                                <div class="message">
                                                    <a href="CartServlet?command=delete&ProductID=<%= item.getProductId() %>"><div class="alert-close"> </div></a>
                                                    <div class="list_img"><img src="<%= item.getProductImage()%>" class="img-responsive" alt=""></div>
                                                    <div class="list_desc"><h4><a href="#"><%= item.getProductName()%></a></h4><%= item.getQuantity()%> x<span class="actual">
                                                            $<%= item.getPrice()%></span></div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                            <% }%>
                                        </div>
                                        <div class="total">
                                            <div class="total_left">Tổng giỏ hàng : </div>
                                            <div class="total_right">$<%= giohang.total()%></div>
                                            <div class="clearfix"> </div>
                                        </div>
                                        <div class="login_buttons">
                                            <div class="check_button"><a href="CheckoutServlet">Check out</a></div>
                                            <div class="clearfix"></div>
                                        </div>
                                        <%  }
                                            }
                                        %>
                                        <div class="clearfix"></div>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>
            <div class="header-bottom">
                <div class="container">
                    <div class="h_menu4">
                        <a class="toggleMenu" href="#">Menu</a>
                        <ul class="nav">
                            <li class="active"><a href="index.jsp"><i> </i>Trang Chủ</a></li>
                            <li ><a href="#" >Danh Mục</a>
                                <ul class="drop">
                                    <%
                                                        for (category x : cat.showAll()) {%>
                                    <li><a href="product.jsp?CatID=<%= x.getCategoy_id()%>"><%= x.getCategory_name()%></a></li>
                                        <%
                                            }
                                        %>
                                </ul>
                            </li> 						
                                      
                            <li><a href="product.jsp" >LNH KIỆN</a></li>						  				 
                            <li><a href="product.jsp" >Phần mềm</a></li>
                            <li><a href="product.jsp" >Điện thoại và máy tính xách tay </a></li>
                            <li><a href="product.jsp" >  Máy ảnh  </a></li>
                            <li><a href="contact.jsp" >Liên hệ </a></li>
                        </ul>
                        <script type="text/javascript" src="js/nav.js"></script>
                    </div>
                </div>
            </div>
            <div class="header-bottom-in">
                <div class="container">
                    <div class="header-bottom-on">
                        <p class="wel"><a href="register.jsp">Chào bạn, bạn có thể tạo tài khoản.</a></p>
                        <div class="header-can">
                            <ul class="social-in">
                                <li><a href="#"><i> </i></a></li>
                                <li><a href="http://fb.com/loc.pham.71465"><i class="facebook"> </i></a></li>
                                <li><a href="#"><i class="twitter"> </i></a></li>					
                                <li><a href="#"><i class="skype"> </i></a></li>
                            </ul>	
                            <div class="down-top">		
                                <select class="in-drop">
                                    <option value="Dollars" class="in-of">Dollars</option>
                                    <option value="Euro" class="in-of">Euro</option>
                                    <option value="Yen" class="in-of">Yen</option>
                                </select>
                            </div>
                            <div class="search">
                                <form>
                                    <input type="text" value="Tìm kiếm" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                this.value = '';}" >
                                    <input type="submit" value="">
                                </form>
                            </div>

                            <div class="clearfix"> </div>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
