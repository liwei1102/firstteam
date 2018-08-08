/*取消登陆返回首页*/
function returnToIndex() {
	$(location).attr('href', "index.html");
}
/*检查用户名是否为空*/
function checkUsername(){
	var username = $("#Username").val();
	if (username==""){
		$("#Username-error").html("用户名不能为空");
		$("#lord").attr({
			disabled:"disabled",
		});
	}
	else{
		$("#Username-error").html("");
		usernamecheck=true;
		checkAll();
	}
}
/*检查邮箱格式是否合法*/
function checkMail() {
	var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
	var mail = $("#Mail").val();
	if(!reg.test(mail)) {
		$("#mail-error").html("不是正确的邮箱格式");
		$("#lord").attr({
			disabled:"disabled",
		})
	}
	else{
		$("#mail-error").html("");
		mailcheck=true;
		checkAll();
	}
}
/*检查密码是否合法*/
function checkPsw(){
	var password = $("#Password").val();
	if(password.length < 6) {
		$("#Password-error").html("密码不能低于6位");
		$("#lord").attr({
			disabled:"disabled",
		});
	} else {
		$("#Password-error").html("");
		pswchecked = true;
		checkAll();
	}
}
/*检查重复密码是否一致*/
function checkRePsw(){
	var password = $("#Password").val();
	var repassword = $("#repassword").val();
	if (password!=repassword){
		$("#repassword-error").html("与密码不一致");
		$("#lord").attr({
			disabled:"disabled",
		});
	}
	else{
		$("#repassword-error").html("");
		repswcheck=true;
		checkAll();
	}
}
/*检查密保问题是否为空*/
function checkQuestion(){
	var question = $("#question").val();
	if (question.length==0){
		$("#question-error").html("密保问题不能为空");
		$("#lord").attr({
			disabled:"disabled",
		});
	}
	else{
		$("#question-error").html(""); 
		questioncheck=true;
		checkAll();
	}
}
/*检查密保答案是否为空*/
function checkAnswer(){
	var question = $("#answer").val();
	if (question.length==0){
		$("#answer-error").html("密保答案不能为空");
		$("#lord").attr({
			disabled:"disabled",
		});
	}
	else{
		$("#answer-error").html("");
		answercheck=true;
		checkAll();
	}
}
/*检查所有验证是否完成*/
function checkAll(){
	if (usernamecheck&&pswchecked&&mailcheck&&repswcheck&&questioncheck&&answercheck){
		$("#lord").removeAttr("disabled");
	}
}
/*传输注册数据*/
function submitInfo() {
	var jsonstr = {
		"identity":$("#slpk").val(),
		"username": $("#Username").val(),
		"mail":$("#Mail").val(),
		"password": $("#Password").val(),
		"question":$("#question").val(),
		"answer":$("#answer").val(),
	};
	$.ajax({
		type: "post",
		url: "/ssm-firstteam/register",
		async: true,
		data: jsonstr,
		success: function(a) {
			if(a == "success"){
				alert("注册成功！");
				$(location).attr('href', "login.jsp");
			}
			if(a == "failure"){
				alert("注册失败  用户名或邮箱已存在！");
				$(location).attr('href', "register.jsp");
			}
		},
		error: function() {
			alert("上传失败");

		}
	});

}