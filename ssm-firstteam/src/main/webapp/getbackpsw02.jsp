<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>找回密码</title>
		<link rel="stylesheet" href="static/css/bootstrap.css" />
		<link rel="stylesheet" href="static/css/bootstrap-select.css" />
		<link rel="stylesheet" href="static/css/getbackpsw.css" />

		<script type="text/javascript" src="static/js/jquery-3.3.1.js"></script>
		<script type="text/javascript" src="static/js/bootstrap.js"></script>
		<script type="text/javascript" src="static/js/bootstrap-select.js"></script>
		<script type="text/javascript" src="static/js/getbackpsw.js" ></script>
	</head>

	<body class="container">
		<div class="container">
			<!--头部-->
			<div>
				<div class="for-liucheng">
					<div class="liulist"></div>
					<div class="liulist  for-cur"></div>
					<div class="liulist"></div>
					<div class="liulist"></div>
					<div class="liutextbox">
						<div class="liutext"><em>1</em><br /><strong>填写账户名</strong></div>
						<div class="liutext for-cur"><em>2</em><br /><strong>验证身份</strong></div>
						<div class="liutext"><em>3</em><br /><strong>设置新密码</strong></div>
						<div class="liutext"><em>4</em><br /><strong>完成</strong></div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4"></div>
				<div class="col-lg-4">
					<div class="form-group" style="margin-bottom: 0px;">
						<c:set var="user" value="${sessionScope.userfindback }"></c:set>
						<c:choose>
							
							<c:when test="${empty sessionScope.userfindback}">
								<span class="bebold">密保问题:</span>
							    <span class="bebold">未知错误！</span>
							</c:when>
							<c:otherwise>
								<span class="bebold">密保问题：</span>
							    <span class="bebold">${user.question }</span>
					        </c:otherwise>
					     </c:choose>
					</div>
					<label id="UserName-error" class="error" for="UserName"></label>
					<div class="form-group" style="margin-bottom: 0px; margin-top: 10px;">
						<label for="exampleInputPassword1" style="font-size: 16px;margin-bottom: 5px;">请输入答案：</label>
						<input type="text" class="form-control" id="answer" placeholder="密保问题答案" oninput="checkAnswer()" onblur="checkAnswer()">
					</div>
					<label id="answer-error" class="error" for="answer"></label>
					<br />
					<button class="btn btn-primary" style=";margin-left: 100px;" disabled="disabled" id="submit02" onclick="submitdata02()">确认提交</button>
				</div>

				<div class="col-lg-4"></div>
			</div>
		</div>

	</body>

</html>