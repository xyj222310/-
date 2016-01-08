
<%@page import="com.myproject.Model.*"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="userBean" class="com.myproject.Model.FTPConfig" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>用户登录</title>
        <style type="text/css">
		body
		{
			font: normal 14px/1.4 "Helvetica Neue","HelveticaNeue",Helvetica,Arial,sans-serif;
		}
		div
		{
			display:block;
		}
		a
		{
			text-decoration:none;
			opacity: 1;
			color: #fff;
		 }
		input,button{ outline:none; }
		::-moz-focus-inner{border:0px;}   /*去除按钮点击时出现的虚线边框*/
        .login_bg
        {
			position: fixed;
			top: 0;
			right: 0;
			bottom: 0;
			left: 0;
			background-size: cover;
        }
		.login_header {
			position:absolute;
			top:0;
			left:0;
			right:0;
			}
		.container {
			position:relative;
			top:50%;
			margin: 0 auto;
			width: 260px;
			
			}
		#logo
		{
			display: block;
			text-align: center;
			font-weight: bold;
			font-size: 50px;
			color: white;
			height: 100%;
		}
		#subheading 
		{
		  position: relative;
		  width: 517px;
		  left: 50%;
		  margin: 10px 0 16px -258px;
		  font-size: 15px;
		  font-weight: normal;
		  color: #fff;
		  text-align: center;
		}
		.signup_forms
		{
			width:260px;	
		}
		.signup_forms_container
		{
			overflow: hidden;
			background: #fff;
			border-radius:3px;	
		}
		.form_user,.form_password,form_username
		{
			width:260px;
			height:45px;
			margin:0px;
        	padding:0px;
			border:0px;	
		}
		.form_password,.form_username,.form_confirm_password{border-top: 1px solid #e3e3e3;}
		.signup_forms input
		{
			padding: 11px 10px 11px 13px;
			width: 100%;
			margin:0px;
        	background: 0;
			font: 16px/1.4 "Helvetica Neue","HelveticaNeue",Helvetica,Arial,sans-serif;
			border:0px;	
		}
		#signup_forms_submit{
		  margin-top:8px;		
		  width:260px;
		  height:45px;
		  background:#529ECC;
		  border:0px;
		  border-radius:3px;
		  cursor:pointer;              <!--CSS属性设置鼠标为手型-->
		 }
		 #signup_forms_submit span{
			 color: #fff;
			 font: "Helvetica Neue",Arial,Helvetica,sans-serif;
			 font-size: 16px;}
		.footer
		 {
			position: fixed;
			top: auto;
			right: 0;
			bottom: 0;
			left: 0;
		 }
		 .footer_signup_link
		 {
			 position: absolute;
			 width:141px;
			 height:78px;
			 bottom: 0;
			 padding: 0 20px;
			 margin: 0 0 13px 0;
			 line-height: 25px;
			 text-align: center;
			 opacity: 1;
			 color: #fff;
		 }
		 .signup_link
		 {
			  display: block;
			  height: 45px;
			  padding: 0 10px;
			  margin: 0 0 8px 0;
			  font-size: 16px;
			  font-weight: bold;
			  line-height: 45px;
			  border: 0;
			  border-radius: 2px;
			  color: #fff;
              background: rgba(255,255,255,0.33);
		}
		.link
		{
			font-size: 14px;
			padding-right: 5px;
			margin-right: 12px;
			color: #fff;
		}
		.design_show
		{
			position: fixed;
			bottom: 0;
			right: 0;
			padding: 0 12px;
			margin: 0 0 13px 0;
			line-height: 25px;
		}
		
		#face
		{
			margin: 0 0 0 10px;
			border-radius:20px;
			padding: 0;
			vertical-align: middle;
			height: 24px;
			width: 24px;
		}
    </style>
	<script type="text/javascript">
		function sub()
            { 
                    var name=document.loginform.username.value;
                    var pass=document.loginform.Password.value;
                    if(name==null || name=="")
                    {
                            alert("请输入用户名");
                            document.loginform.username.focus();
                            return false;
                    }
                    else if(pass==null || pass=="")
                    {
                            alert("请输入密码！");
                            document.loginform.password.focus();
                            return false;
                    }
                  
                    else document.loginform.submit();
                 }
		function cle()
		{
			document.loginform.username.value="";
			pass=document.loginform.password.value="";
		}
    
	</script>
    </head>
    <body onload="cle()">
        <!--         User b=null;
                    String bb;
                    b=(User)session.getAttribute("userBean");
                    if(b==null || b.getUsername().equals(""))
                    {
                    }
                    else{
                        bb=(String)b.getUsername();
                        
                            response.sendRedirect("User_center.jsp");
                        
                        } 
                    
                    
                %-->
        <div id="login_bg" class ="login_bg" style="background-image:url(images/u3.jpg);"></div>
        <div class="login_header"><span></span></div>
    
    <div class="container">
    	<div class="form_header" >
        	<h1 id="logo"><font color="black">用户登录</h1>
        </div>
        <div class="signup_forms" class="signup_forms">
			<div id="signup_forms_container" class="signup_forms_container">
			       <form class="signup_form_form" name="loginform" method="post" action="log.action">
			           <div class="signup_account" id="signup_account">
			               <div class="form_user">	
			                   <input type="text" name="username" placeholder="UserName" >
			               </div>
			               <div class="form_password">
			                   <input type="password" name="Password" placeholder="Password" >
			               </div>
			           </div>
  						<button type="button" id="signup_forms_submit" onclick="sub()"><span><strong>Log in</strong></span></button>
				    </form> 
			</div>
        </div>
	</div>
   
</body></html>