$(function (){
	$("#checkForm").validate({
		rules: {
			account: {
				required: true,
				minlength: 6
			},
			password: {
				required: true,
				digits: true,
				minlength: 6
			}
		},
		messages: {
			account: {
				required: "用户名不能为空!",
				minlength: "用户名不得少于6位！"
			},
			password: {
				required: "密码不能为空!",
				digits: "密码必须是整数!",
				minlength: "密码不得少于6位!"
			}
		}
	});
});
function check(){
	var submit=$("#checkForm");
	submit.submit();
}
