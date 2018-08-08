

/*账户登陆部分*/
/*验证账户*/
function checkAccount() {
	var account = $("#myAccount").val();
	if(account == "") {
		$("#myAccount-error").html("账户不能为空");
		$("#lord").attr({
			disabled:"disabled",
		})
	} else {
		$("#myAccount-error").html("");
		accountchecked = true;
		allChecked();
	}
}
/*验证密码*/
function checkpassword() {
	var password = $("#myPassword").val();
	if(password.length < 6) {
		$("#myPassword-error").html("密码不能低于6位");
		$("#lord").attr({
			disabled:"disabled",
		})
	} else {
		$("#myPassword-error").html("");
		pswchecked = true;
		allChecked();
	}
}
/*检查是否所有都经过验证*/
function allChecked() {
	if(accountchecked && pswchecked) {
		$("#lord").removeAttr("disabled");
	}
}

/*邮箱登陆部分*/
/*验证邮箱*/
function checkMail() {
	var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
	var mail = $("#myMail").val();
	if(!reg.test(mail)) {
		$("#myMail-error").html("不是正确的邮箱格式");
		$("#maillord").attr({
			disabled:"disabled",
		})
	}
	else{
		$("#myMail-error").html("");
		mailcheck=true;
		allmailChecked();
	}
}
/*验证密码*/
function checkMailPassword() {
	var password = $("#mailPassword").val();
	if(password.length < 6) {
		$("#mailPassword-error").html("密码不能低于6位");
		$("#maillord").attr({
			disabled:"disabled",
		})
	} else {
		$("#mailPassword-error").html("");
		mailpswchecked = true;
		allmailChecked();
	}
}
/*检查是否所有都经过验证*/
function allmailChecked() {
	if(mailcheck && mailpswchecked) {
		$("#maillord").removeAttr("disabled");
	}
}