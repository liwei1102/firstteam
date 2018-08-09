/*第一阶段：提交用户名，邮箱和身份*/
/*验证用户名是否为空*/
function checkUserName(){
	var username = $("#UserName").val();
	if (username==""){
		$("#UserName-error").html("用户名不能为空");
		$("#submit").attr({
			disabled:"disabled",
		});
	}
	else{
		$("#UserName-error").html("");
		usernamecheck=true;
		checkall();
	}
}
/*验证邮箱格式是否正确*/
function checkMail() {
	var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
	var mail = $("#Mail").val();
	if(!reg.test(mail)) {
		$("#Mail-error").html("不是正确的邮箱格式");
		$("#submit").attr({
			disabled:"disabled",
		});
	}
	else{
		$("#Mail-error").html("");
		mailcheck=true;
		checkall();
	}
}
/*判断第一阶段所有验证是否完成*/
function checkall(){
	if (usernamecheck&&mailcheck){
		$("#submit").removeAttr("disabled");
	}

}
/*第一阶段提交数据*/
function submitdata(){
	var jsondata = {
		"username":$("#UserName").val(),
		"email":$("#Mail").val(),
		"identity":$("#slpk").val(),
	}
	$.ajax({
		type:"post",
		url:"/ssm-firstteam/findback_01",
		async:true,
		data:jsondata,
		success:function(result){
			if(result=="success"){
				alert("用户名和邮箱匹配成功");
				$(location).attr('href', "getbackpsw02.jsp");
			}
			else if(result=="nofailure"){
				alert("用户名不存在");
			}
			else{
				alert("用户名和密码不匹配");
			}
		},
		error:function(){
			alert("上传失败");
		}
	});
	
}

/*第二阶段：提交密保答案*/
/*检查答案是否为空*/
function checkAnswer(){
	var answer = $("#answer").val();
	if (answer == ""){
		$("#answer-error").html("答案不能为空");
		$("#submit02").attr({
			disabled:"disabled",
		});
	}
	else{
		$("#answer-error").html("");
		$("#submit02").removeAttr("disabled");
		
	}
}
/*传输第二阶段数据*/
function submitdata02(){
	var jsondata = {
		"answer":$("#answer").val(),
	}
	$.ajax({
		type:"post",
		url:"/ssm-firstteam/findback_02",
		async:true,
		data:jsondata,
		success:function(result){
			if(result=="success"){
				alert("答案正确！");
				$(location).attr('href', "getbackpsw03.jsp");
			}
			else {
				alert("答案不正确！");
			}
		},
		error:function(){
			alert("上传失败");
		}
	});
}


/*第三阶段：设置新密码*/

/*检查新密码是否为空*/
function checknewpsw() {
	var newpsw = $("#newpsw").val();
	if(newpsw.length<6) {
		$("#newpsw-error").html("新密码不能低于6位 ");
		$("#submit03").attr({
			disabled: "disabled",
		});
	} else {
		$("#newpsw-error").html("");
		newpswcheck = true;
		checkall03();
	}
}
/*检查第二次输入与第一次是否一致*/
function checkrenewpsw() {
	var newpsw = $("#newpsw").val();
	var repsw = $("#renewpsw").val();
	if(repsw != newpsw) {
		$("#renewpsw-error").html("两次密码输入不一致");
		$("#submit03").attr({
			disabled: "disabled",
		});
	} else {
		$("#renewpsw-error").html("");
		recheck = true;
		checkall03();
	}
}
/*是否全部通过检查*/
function checkall03() {
	if(newpswcheck && recheck) {
		$("#submit03").removeAttr("disabled");
	}
}
/*上传数据*/
function submitdata03() {
	var jsondata = {
		"password": $("#newpsw").val(),
	}
	$.ajax({
		type: "post",
		url: "/ssm-firstteam/findback_03",
		async: true,
		data: jsondata,
		success: function(result) {
			if(result=="success")
				$(location).attr('href', "getbackpsw04.jsp");
			else
				alert("数据库错误");
		},
		error: function() {
			alert("请求失败");
		}
	});
}