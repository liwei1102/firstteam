<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>登陆</title>
		<link rel="stylesheet" href="static/css/bootstrap-theme.css" />
		<link rel="stylesheet" href="static/css/bootstrap.css" />
		<link rel="stylesheet" href="static/css/bootstrap-select.css" />
		<link rel="stylesheet" href="static/css/login.css" />
		
		<script type="text/javascript" src="static/js/jquery-3.3.1.js"></script>
		<script type="text/javascript" src="static/js/bootstrap.js"></script>
		<script type="text/javascript" src="static/js/login.js"></script>
		<script type="text/javascript" src="static/js/验证输入框.js" ></script>
		<script type="text/javascript" src="static/js/bootstrap-select.js" ></script>
	</head>

	<body class="container" style="background:url(static/img/grass.jpg) no-repeat;background-size: 100%;">
		<div class="container">
			<div class="row">
				<div class="col-lg-3"></div>
				<div class="col-lg-6">
					<!--登陆box-->
					<div style="">
						<div style="width:450px ;margin-top: 10px;border-radius: 8px;padding-left: 50px;margin-top: 150px;background-color:rgba(0,0,0,0.5);">
							<br />
							<!--选项卡-->
							<div>
								<ul class="nav nav-pills">
									<li role="presentation" id="changeToAccount" class="active">
										<a href="#" onclick="accountLogin()">账户登陆</a>
									</li>
									<li role="presentation" id="changeToMail">
										<a href="#" onclick="mailLogin()">邮箱登陆</a>
									</li>
									<!--选择登陆身份-->
									<select id="slpk" class="selectpicker"  >
										<option>毕业生</option>
										<option>企业</option>
										<option>管理员</option>
									</select>	
								</ul>
							</div>
							<br />
							<!--账户登陆-->
							<div class="login" id="byAccount" style="display: block;;">
									<div class="input-group" style="margin-top: 10px;">
										<span class="input-group-addon " id="basic-addon1">账号</span>
										<input type="text" id="myAccount" class="form-control" placeholder="Username" oninput="checkAccount()" onblur="checkAccount()" aria-describedby="basic-addon1" style="width: 300px;">
									</div>
									<label id="myAccount-error" class="error" for="myAccount"></label>

									<div class="input-group" style="margin-top: 20px;">
										<span class="input-group-addon" id="basic-addon2">密码</span>
										<input type="password" id="myPassword" class="form-control" placeholder="Password" oninput="checkpassword()" onblur="checkpassword()" aria-describedby="basic-addon1" style="width: 300px;">
									</div>
									<label id="myPassword-error" class="error" for="myPassword"></label>

								<br />
								<a style="margin-left: 50px; color: white;" href="register.jsp">新用户注册</a>
								<a style="margin-left: 100px;color: white;" href="getbackpsw01.jsp">忘记密码</a>
								<br /><br />
								<button class="btn btn-default" style="margin-left: 50px;width: 80px;" onclick="returnToIndex()">取消</button>
								<button class="btn btn-default" id="lord" disabled="disabled" style="margin-left: 80px;width: 80px;" onclick="submitInfo1()">登陆</button>
								<br /><br /><br />
							</div>
							<!--邮箱登陆-->

							<div class="login" id="byMail" style="display: none;;">
								<div class="input-group" style="margin-top: 10px;">
									<span class="input-group-addon" id="basic-addon1">邮箱</span>
									<input type="text" class="form-control" id="myMail" oninput="checkMail()" onblur="checkMail()" placeholder="Mailaddress" aria-describedby="basic-addon1" style="width: 300px;">
								</div>
								<label id="myMail-error" class="error" for="myMail"></label>

								<div class="input-group" style="margin-top: 20px;">
									<span class="input-group-addon" id="basic-addon2">密码</span>
									<input type="password" class="form-control" id="mailPassword" oninput="checkMailPassword()" onblur="checkMailPassword()" placeholder="Password" aria-describedby="basic-addon1" style="width: 300px;">
								</div>
								<label id="mailPassword-error" class="error" for="mailPassword"></label>
								<br />
								<a style="margin-left: 50px;color: white;" href="register.jsp">新用户注册</a>
								<a style="margin-left: 100px;color: white;">忘记密码</a>
								<br /><br />
								<button class="btn btn-default" style="margin-left: 50px;width: 80px;" onclick="returnToIndex()">取消</button>
								<button class="btn btn-default" id="maillord" disabled="disabled" style="margin-left: 80px;width: 80px;" onclick="submitInfo2()">登陆</button>
								<br /><br /><br />
							</div>
						</div>

					</div>
				</div>

				<div class="col-lg-3"></div>
			</div>
		</div>

		</div>
	</body>

</html>