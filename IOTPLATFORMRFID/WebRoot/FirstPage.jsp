<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>

   <%@taglib prefix="s" uri="/struts-tags" %>	
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>注册失败</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function sub(){
			if(confirm("ȷ��ɾ��")){
				window.location.href='download.action';
			}
		}
	</script>
  </head>
  
  <body>
    !!!!<br>
     <input type="button" id="upload" value="�ϴ������ݿ� " onclick="window.location.href='upload.action'" />
	<input type="button" id="download" value="�������ݿ⵽����" onclick="window.location.href='download.action'" />
  	<input type="submit" id="delete" value="ɾ�������������ݿ�" onclick="sub()" />
	    <br><br><br>
	    <br><br><br>
	<table border="1" align = "center">
    	<tr>
    		<td >Disk rest</td>
    		<td>
    			Disk used   
    		</td>
    		<br>
	    		<tr>
		    		<td text="disk" >
						<s:property value="rest"/>
					</td>
					<td text="disk" >
						<s:property value="used"/>
					</td>
				<tr>
   		</tr>
    </table>
    
    
  </body>
</html>
