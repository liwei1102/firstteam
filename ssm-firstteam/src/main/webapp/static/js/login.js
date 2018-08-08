/*切换至账户登陆模式*/
function accountLogin() {
	$("#byAccount").show();
	$("#byMail").hide();
	$("#changeToAccount").attr({
		class: "active"
	});
	$("#changeToMail").attr({
		class: ""
	});
}
/*切换至邮箱登陆模式*/
function mailLogin() {
	$("#byAccount").hide();
	$("#byMail").show();
	$("#changeToAccount").attr({
		class: ""
	});
	$("#changeToMail").attr({
		class: "active"
	});
}
/*取消登陆返回首页*/
function returnToIndex() {
	$(location).attr('href', "index.html");

}

/*账户注册提交登陆信息*/
function submitInfo1() {
	var identity = $("#slpk").val();
	var jsonstr = {
		"identity":identity,
		"account": $("#myAccount").val(),
		"password": $("#myPassword").val()
	};
	
	$.ajax({
		type: "post",
		url: "/ssm-firstteam/userlogin",
		async: true,
		data: jsonstr,
		success: function(a) {
			if(a == "studentsuccess"){
				alert("学生登录成功！");
				$(location).attr('href', "studentsuccess.jsp");
			}
			if(a == "companysuccess"){
				alert("企业登录成功！");
				$(location).attr('href', "companysuccess.jsp");
			}
			if(a == "administratorsuccess"){
				alert("管理员登录成功！");
				$(location).attr('href', "administatorsuccess.jsp");
			}
			if(a == "failure"){
				alert("登录失败，用户名或者密码错误！");
				$(location).attr('href', "login.jsp");
			}
		},
		error: function() {
			alert("上传失败");
		}
	});

}
/*邮箱注册提交登陆信息*/
function submitInfo2() {
	var identity = $("#slpk").val();
	var jsonstr = {
		"identity":identity,
		"email": $("#myMail").val(),
		"password": $("#mailPassword").val()
	};
	$.ajax({
		type: "post",
		url: "/ssm-firstteam/emaillogin",
		async: true,
		data: jsonstr,
		success: function(a) {
			if(a == "studentsuccess"){
				alert("学生登录成功！");
				$(location).attr('href', "studentsuccess.jsp");
			}
			if(a == "companysuccess"){
				alert("企业登录成功！");
				$(location).attr('href', "companysuccess.jsp");
			}
			if(a == "administratorsuccess"){
				alert("管理员登录成功！");
				$(location).attr('href', "administatorsuccess.jsp");
			}
			if(a == "failure"){
				alert("登录失败，邮箱或者密码错误！");
				$(location).attr('href', "login.jsp");
			}
		},
		error: function() {
			alert("上传失败");
		}
	});
}
