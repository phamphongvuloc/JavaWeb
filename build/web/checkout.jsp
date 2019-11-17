
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
    </head>
    <body>
        <% 
            
            %>
        <jsp:include page="header.jsp"></jsp:include>
        <div class="container">
            <div class="account">
                    <h2 class="account-in">Checkout</h2>
                    <form action="CheckoutServlet" method="Post" >
                        <div> 	
                            <span class="mail">Địa chỉ*</span>
                            <input type="text" name="address" required="yes"  class="form-control">
                        </div>
                        <div> 
                            <span class="word">Phương thức thanh toán*</span>
                            <select name="payment" class="form-control">
                                <option value="live">Thanh toán khi nhận hàng</option>
                                <option value="before">Thanh toán bằng tín dụng</option>
                            </select>
                        </div>
                        <input type="submit" value="Đặt hàng"> 
                    </form>
                    
                </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
