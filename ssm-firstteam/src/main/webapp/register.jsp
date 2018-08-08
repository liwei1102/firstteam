<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>用户注册</title>
		<link rel="stylesheet" href="static/css/bootstrap.css" />
		<link rel="stylesheet" href="static/css/bootstrap-select.css" />
		<link rel="stylesheet" href="static/css/register.css" />
		
		
		<script type="text/javascript" src="static/js/jquery-3.3.1.js"></script>
		<script type="text/javascript" src="static/js/bootstrap.js"></script>
		<script type="text/javascript" src="static/js/bootstrap-select.js" ></script>
		<script type="text/javascript" src="static/js/register.js" ></script>
	</head>

	<body class="container" style="background:url(static/img/grass.jpg) no-repeat;background-size: 100%;">
				<div class="container">
			<div class="row">
				<div class="col-lg-3"></div>
				<div class="col-lg-6">
					<div id="registerbox" style="width:450px ;margin-top: 10px;border-radius: 8px;padding-left: 50px;margin-top: 150px;background-color:rgba(0,0,0,0.5);">
						<h3  style="color: white;padding-top: 15px;margin-left: 100px;">用户注册</h3>
						<!--选择注册身份-->
						
						<span style="color: white;">请选择您想要注册的身份：</span>
						<select id="slpk" class="selectpicker">
							<option>毕业生</option>
							<option>企业</option>
							<option>管理员</option>
						</select>
						<div class="input-group" style="padding-top: 10px;">
							<span class="input-group-addon " id="basic-addon1">用户名</span>
							<input type="text" id="Username" class="form-control" placeholder="Username" oninput="checkUsername()" onblur="checkUsername()" aria-describedby="basic-addon1" style="width: 250px;">
						</div>
						<label id="Username-error" class="error" for="Username"></label>

						<div class="input-group" style="margin-top: 10px;">
							<span class="input-group-addon" id="basic-addon2">邮箱</span>
							<input type="text" id="Mail" class="form-control" placeholder="Mail" oninput="checkMail()" onblur="checkMail()" aria-describedby="basic-addon1" style="width: 250px;">
						</div>
						<label id="mail-error" class="error" for="Mail"></label>
						
						<div class="input-group" style="margin-top: 10px;">
							<span class="input-group-addon" id="basic-addon2">密码</span>
							<input type="password" id="Password" class="form-control" placeholder="Password" oninput="checkPsw()" onblur="checkPsw()" aria-describedby="basic-addon1" style="width: 250px;">
						</div>
						<label id="Password-error" class="error" for="Password"></label>
						
						<div class="input-group" style="margin-top: 10px;">
							<span class="input-group-addon" id="basic-addon2">重复密码</span>
							<input type="password" id="repassword" class="form-control" placeholder="repassword" oninput="checkRePsw()" onblur="checkRePsw()" aria-describedby="basic-addon1" style="width: 250px;">
						</div>
						<label id="repassword-error" class="error" for="repassword"></label>
						
						<div class="input-group" style="margin-top: 10px;">
							<span class="input-group-addon" id="basic-addon2">密保问题</span>
							<input type="text" id="question" class="form-control" placeholder="密保问题" oninput="checkQuestion()" onblur="checkQuestion()" aria-describedby="basic-addon1" style="width: 250px;">
						</div>
						<label id="question-error" class="error" for="question"></label>
						
						<div class="input-group" style="margin-top: 10px;">
							<span class="input-group-addon" id="basic-addon2">密保答案</span>
							<input type="text" id="answer" class="form-control" placeholder="密保答案" oninput="checkAnswer()" onblur="checkAnswer()" aria-describedby="basic-addon1" style="width: 250px;">
						</div>
						<label id="answer-error" class="error" for="answer"></label>
						<br />
								<button class="btn btn-default" style="margin-left: 50px;width: 80px;" onclick="returnToIndex()">取消</button>
								<button class="btn btn-default" id="lord" disabled="disabled" style="margin-left: 80px;width: 80px;" onclick="submitInfo()">注册</button>
								<br /><br />
					</div>
				</div>
				<div class="col-lg-3"></div>
			</div>

		</div>
	</body>

</html>