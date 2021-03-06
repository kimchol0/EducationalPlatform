<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doUpdate(){
		var roName = $("#roName").val();
		var roText = $("#roText").val();

		console.info(roName);
		console.info(roText);
		
		if(roName == ""||roText == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return;
		}else{
			console.info("OK");
		}
		
		var loadingIndex = null;
		$.ajax({
        	type : "POST",
        	url  : "${pageContext.request.contextPath}/role/doUpdateRole",
        	data : {        		
        		"roName" : roName,
        		"roText" : roText
        	},
        	beforeSend : function(){
        		loadingIndex = layer.msg('处理中', {icon: 16});
        	},
        	success : function(result) {
        		layer.close(loadingIndex);
        		var resObj = JSON.parse(result);
        		console.info(resObj.result);
        		if (resObj.result) {
        			
    	        	window.location.href = "${pageContext.request.contextPath}/role/roleTable?roNo="+roNo;
        			
        		} else {
                    layer.msg("用户登录账号或密码不正确，请重新输入", {time:2000, icon:5, shift:6}, function(){
                    	
                    });
        		}
        	},
        	error : function(err){
        		layer.close("err");
        	}
        });
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<div>
	<h1 class="title1">修改用户角色</h1>
	</div>
	<br />
	<hr />
	<br />
	<br />
	<div class="col-md-offset-0">
	<div class="elegant-aero">
	<form action="${pageContext.request.contextPath}/role/doUpdateRole" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
	
		<div class="row form-group">
		<label class="control-label col-lg-3" for="name"><span>角色名称：</span></label>
			<div class="col-md-7">
			<input class="form-control" type="text" id="roName" name="roName" value = "${role.roName}">
			</div>
		</div>
		
		<div class="row form-group">
		<label class="control-label col-lg-3" for="name"><span>注释：</span></label>
			<div class="col-md-7">
			<input class="form-control" type="text" id="roText" name="roText" value = "${role.roText}">
			</div>
		</div>
		
		<br />

		<div class="row form-group">
			<input type="hidden" id=courierNo name="roNo" value="${role.roNo }" />
			<input class="btn btn-danger" type="submit" value="提交"/>
		</div>
			<div class="suspensionleft"></div>
			<div class="suspensionright"></div>
			<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
			
	</form>
	</div>
	</div>
</div>

<style type="text/css">
input[type=radio] {
    margin-right: 5px;
    cursor: pointer;
    font-size: 14px;
    width: 15px;
    height: 12px;
    position: relative;
}

input[type=radio]:after {
    position: absolute;
    width: 15px;
    height: 15px;
    top: 0;
    content: " ";
    background-color: #fff;
    color: #fff;
    display: inline-block;
    visibility: visible;
    padding: 0px 3px;
    border-radius: 50%;
    border: 1px solid #ebebeb;
}

input[type=radio]:checked:before {
    content: " ";
    display: block;
    position: relative;
    top: 0;
    width: 15px;
    height: 15px;
    color: #fff;
    font-weight: 400;
    z-index: 1;
    border-radius: 50%;
    background-color: #40c8c4;
}
input:focus{
	box-shadow:0 0 5px 2px rgba(0,0,0,0.3);
}
box-shadow: 0 0 35px 15px rgba(29,43,100,0.9) inset; 
input[type=text] {
  width: 300px;
  color: #404040;
  background: white;
  border: 1px solid;
  border-color: #c4c4c4 #d1d1d1 #d4d4d4;
  border-radius: 2px;
  outline: 5px solid #eff4f7;
  -moz-outline-radius: 3px;
  -webkit-box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
  box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
}
.title1{

       background: #EEE url(data:image/gif;base64,iVBORw0KGgoAAAANSUhEUgAAAAQAAAAECAIAAAAmkwkpAAAAHklEQVQImWNkYGBgYGD4//8/A5wF5SBYyAr+//8PAPOCFO0Q2zq7AAAAAElFTkSuQmCC) repeat;

         text-shadow: 3px -3px black, 2px -2px white;

         font-weight: bold;

         -webkit-text-fill-color: transparent;

         -webkit-background-clip: text;

}
.title2{

        color: transparent;

        -webkit-text-stroke: 1px black;

        letter-spacing: 0.04em;

}
.elegant-aero {
    margin-left:auto;
	margin-right:auto;
	max-width: 80% ;
	padding: 20px 20px 20px 20px;
	font: 12px Arial, Helvetica, sans-serif;
	color: #666;
}
.elegant-aero label>span {
	float: left;
	margin-top: 10px;
	color: #5E5E5E;
}
.elegant-aero label {
	display: block;
	margin: 0px 0px 5px;
}
.elegant-aero label>span {
	float: left;
	width: 100%;
	text-align: right;
	padding-right: 15px;
	margin-top: 10px;
	font-weight: bold;
	font-size :20px;
}
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}
input[type="text"]{
	margin-top:6px;
}
select{
	width:130px;
	height:20px;
	margin-top:4px;
}
</style>
