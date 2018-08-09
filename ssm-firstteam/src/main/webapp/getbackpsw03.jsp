<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
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
					<div class="liulist for-cur"></div>
					<div class="liulist for-cur"></div>
					<div class="liulist for-cur"></div>
					<div class="liulist"></div>
					<div class="liutextbox">
						<div class="liutext for-cur"><em>1</em><br /><strong>填写账户名</strong></div>
						<div class="liutext for-cur"><em>2</em><br /><strong>验证身份</strong></div>
						<div class="liutext for-cur"><em>3</em><br /><strong>设置新密码</strong></div>
						<div class="liutext"><em>4</em><br /><strong>完成</strong></div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4"></div>
				<div class="col-lg-4">
					<div class="form-group" style="margin-bottom: 0px;">
						<label for="exampleInputEmail1">请输入新密码：</label>
						<input type="text" class="form-control" id="newpsw" placeholder="新密码" oninput="checknewpsw()" onblur="checknewpsw()">
					</div>
					<label id="newpsw-error" class="error" for="newpsw"></label>
					<div class="form-group" style="margin-bottom: 0px; margin-top: 10px;">
						<label for="exampleInputPassword1">请重复新密码：</label>
						<input type="text" class="form-control" id="renewpsw" placeholder="重复新密码" oninput="checkrenewpsw()" onblur="checkrenewpsw()">
					</div>
					<label id="renewpsw-error" class="error" for="renewpsw"></label>
					
					<br /><br />
					<button class="btn btn-primary" style=";margin-left: 100px;" disabled="disabled" id="submit03" onclick="submitdata03()">确认提交</button>
				</div>

				<div class="col-lg-4"></div>
			</div>
		</div>

	</body>

</html>