<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">






<link rel="stylesheet" href="<%=request.getContextPath()%>/static/Houtai/css/style.css" type="text/css" />
	<script
	src="<%=request.getContextPath()%>/static/Homepage/js/sHover.min.js"></script>
	<script
	src="<%=request.getContextPath()%>/static/User_Data_Update/js/jquery-1.8.3.min.js"></script>

	
		<!-- 这里还是用ajax提交 -->
		 <!-- 这里是自定义的js -->
<script
src="<%=request.getContextPath()%>/static/adminjs/chaxunjs.js"></script>


<title>DiliDili-视频管理后台</title>
</head>
<body>	
<script type="text/JavaScript"> 

var $=function(id) {
   return document.getElementById(id);
}

function show_menu(num){
for(i=0;i<100;i++){
	if($('li0'+i)){
	$('li0'+i).style.display='none';
	$('f0'+i).className='';
	 }
}
	  $('li0'+num).style.display='block';//触发以后信息块
	  $('f0'+num).className='left02down01_xia_li';//触发以后TAG样式
}

function show_menuB(numB){
	for(j=0;j<100;j++){
		 if(j!=numB){
			if($('Bli0'+j)){
		  $('Bli0'+j).style.display='none';
		  $('Bf0'+j).style.background='url(<%=request.getContextPath()%>/static/Houtai/images/01.gif)';
		}
		 }
	}
	if($('Bli0'+numB)){   
		if($('Bli0'+numB).style.display=='block'){
		  $('Bli0'+numB).style.display='none';
		 $('Bf0'+numB).style.background='url(<%=request.getContextPath()%>/static/Houtai/images/01.gif)';
		}else {
		  $('Bli0'+numB).style.display='block';
		  $('Bf0'+numB).style.background='url(<%=request.getContextPath()%>/static/Houtai/images/02.gif)';
		}
	}
}


var temp=0;
function show_menuC(){
		if (temp==0){
		 document.getElementById('LeftBox').style.display='none';
	  	 document.getElementById('RightBox').style.marginLeft='0';
		 document.getElementById('Mobile').style.background='url(<%=request.getContextPath()%>/static/Houtai/images/center.gif)';

		 temp=1;
		}else{
		document.getElementById('RightBox').style.marginLeft='222px';
	   	document.getElementById('LeftBox').style.display='block';
		document.getElementById('Mobile').style.background='url(<%=request.getContextPath()%>/static/Houtai/images/center0.gif)';

	   temp=0;
			}
	 }
</script>
</head>

<body>
<div class="header">
	<div class="header03"></div>
	<div class="header01"></div>
	<div class="header02">视频管理系统</div> 
	
</div>
<div class="left" id="LeftBox">
	<div class="left01">
		<div class="left01_right"></div>
		<div class="left01_left"></div>
		<div class="left01_c">超级管理员：admin</div>
	</div>
	<div class="left02">
		<div class="left02top">
			<div class="left02top_right"></div>
			<div class="left02top_left"></div>
			<div class="left02top_c">视频信息管理</div>
		</div>
	  <div class="left02down">
			<div class="left02down01"><a  onclick="show_menuB(80)" href="javascript:;"><div id="Bf080" class="left02down01_img"></div>视频信息查询</a></div>
			<div class="left02down01_xia noneBox" id="Bli080">
				<ul>
					<li onmousemove="show_menu(10)" id="f010"><a href="#">&middot;精确查询</a></li>
					<li onmousemove="show_menu(11)" id="f011"><a href="#">&middot;组合条件查询</a></li>
				</ul>
			</div>
		  
			
		</div>
	</div>
	
	<div class="left01">
		<div class="left03_right"></div>
		<div class="left01_left"></div>
		<div class="left03_c">安全退出</div>
	</div>
</div>
<div class="rrcc" id="RightBox">
	<div class="center" id="Mobile" onclick="show_menuC()"></div>
	<div class="right" id="li010">
		<div class="right01"><img src="<%=request.getContextPath()%>/static/Houtai/images/04.gif" /> 用户信息查询 &gt; <span>精确查询</span></div>
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="3">


  <tr>
    <td height="100%" valign="top">
    <div style="overflow:auto;height:100%; width:100%">
      <table width="100%" border="0" cellpadding="3" cellspacing="1" class="table1">
        <TR>
          <th align="center"><input type="checkbox" name="checkbox" id="checkbox"></th>
          <th align="center">视频ID</th>
          <th align="center">视频名字</th>
          <th align="center">作者ID</th>
          <th align="center">类别</th>
          <th align="center">打赏数</th>
          <th align="center">审核状态</th>
         
          <th width="160" align="center">操作</th>
          </TR>
          <c:forEach items="${videos}" var="Videos">
        <TR>
          <TD align="center"><input type="checkbox" name="checkbox2" id="checkbox2"></TD>
          <TD align="center">${Videos.videoId}</TD>
          <TD align="center">${Videos.videoName}</TD>
          <TD align="center">${Videos.videoUserid}</TD>
          <TD align="center">${Videos.videoType}</TD>
          <TD align="center">${Videos.videoRewardmoney }</TD>
          <TD align="center">${Videos.videoFlag }</TD>
          
         
          <TD width="160" align="center"><BUTTON style="height:21px; font-size:12px" 
          onClick="javascript:if (confirm('永久删除该视频？')) window.location.href='backstageControl/deleteVideo?id=${Videos.videoId}';else return;">删除</BUTTON> 
          <BUTTON style="height:21px; font-size:12px" onClick="javascript:if (confirm('通过审核？')) location.href='backstageControl/passVideo?id=${Videos.videoId}';else return;">审核通过</BUTTON>
          </TD>
        </TR>
			</c:forEach>
      </table>
    </div>
  </td>
  </tr>
</table>

	</div>
	
	<div class="right noneBox" id="li011">
		<div class="right01"><img src="<%=request.getContextPath()%>/static/Houtai/images/04.gif" /> 用户信息查询 &gt; <span>组合条件查询</span></div>
		<form action="${pageContext.request.contextPath}/backstageControl/selectVideoById" method="post">
		 
		根据视频ID查询:<input type="text" name="videoId" >  <input type="submit"   value="查询">
		</form>
		<br>
		
          
		<div id="chaxunqu" ></div>
		<form action="${pageContext.request.contextPath }/backstageControl/selectVideoByName" method="post">

		根据视频名称查询:<input type="text" name="videoName" >  <input type="submit"  value="查询">
		
		</form>
		<br>
          
		<div id="chaxunqu2"></div>
		<form action="${pageContext.request.contextPath }/backstageControl/selectVideoByUserId" method="post">

		根据发布者ID查询:<input type="text" name="userId" >  <input type="submit"  value="查询">
		
		</form>
		<br>

		
	</div>
	
</div>
	

</body>
</html>