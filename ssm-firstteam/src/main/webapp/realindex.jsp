<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>毕业生就业管理系统</title>
		<link rel="stylesheet" href="static/css/bootstrap-theme.css" />
		<link rel="stylesheet" href="static/css/bootstrap.css" />
		<link rel="stylesheet" href="static/css/index.css" />
		<script type="text/javascript">
		function submitInfo1() {
			var jsonstr = {
				"account": $("#myAccount").val(),
				"password": $("#myPassword").val()
			};
			
			$.ajax({
				type: "post",
				url: "/ssm-firstteam/studentlogin",
				async: true,
				data: jsonstr,
				dataType:"json",
				success: function(){
					alert("登录成功！");
					$(location).attr('href', "/ssm-firstteam/success.jsp");
				},
				error: function() {
					alert("登录失败，用户名或者密码错误！ ");
				}
			});

		}
		</script>
	</head>

	<body class="container-fluid">
		<!--logo部分-->
		<div class="container " style="background-image: url(static/img/logobgcolor.png);">
			<div class="row">
				<!--logo-->
				<div class="col-lg-8">
					<img src="static/img/logo.png" />
				</div>
				<!--用户注销-->
				<div class="col-lg-4 text-right" style="margin-top:30px ;padding-right: 20px;">
					<a href="#"></a>
				</div>
			</div>
		</div>
		<!--选择子系统-->
		<div class="container" style="background:url(static/img/grass.jpg) no-repeat;background-size: 100%;">
			<div class="row">
				<!--毕业生登陆-->
				<div class="col-lg-4" style="margin-top: 70px;margin-left: 50px;display: block;height: 400px; ">
					<a href="studentlogin.jsp" style=";">
						<img src="static/img/login_bg.png" width="350px" style="position: absolute;" />
						<img src="static/img/毕业生登陆.png" style=";width: 200px;position: absolute;top: 230px;left: 80px;" />
						<img src="static/img/enter.png" style="z-index: 2;width: 245px;position: absolute;top: 290px;left: 52px;" />
						<p style="position: absolute;top: 300px;left: 165px;z-index: 3;font-size: 18px;color: #FFF;font-family: Arial, Helvetica, sans-serif;font-weight: bolder;">
							登陆
						</p>
					</a>
				</div>
				<!--企业登陆-->
				<div class="col-lg-4" style="margin-top: 70px;height: 400px;">
					<a href="#"  >
						<img src="static/img/login_bg.png" width="350px" style="position: absolute;display: block;" />
						<img src="static/img/企业登陆.png" style="z-index: 2;width: 200px;position: absolute;top: 230px;left: 80px;" />
						<img src="static/img/enter.png" style="z-index: 2;width: 245px;position: absolute;top: 290px;left: 66px;" />
						<p style="position: absolute;top: 300px;left: 165px;z-index: 3;font-size: 18px;color: #FFF;font-family: Arial, Helvetica, sans-serif;font-weight: bolder;">
							登陆
						</p>
					</a>
				</div>
				<!--管理员登陆-->
				<div class="col-lg-4" style="margin-top: 70px;margin-right: -50px;400px">
					<a href="#" >
						<img src="static/img/login_bg.png" width="350px" style="position: absolute;display: block;" />
						<img src="static/img/管理员登陆.png" style="z-index: 2;width: 200px;position: absolute;top: 230px;left: 80px;" />
						<img src="static/img/enter.png" style="z-index: 2;width: 245px;position: absolute;top: 290px;left: 66px;" />
						<p style="position: absolute;top: 300px;left: 165px;z-index: 3;font-size: 18px;color: #FFF;font-family: Arial, Helvetica, sans-serif;font-weight: bolder;">
							登陆
						</p>
					</a>
				</div>
			</div>
		</div>
		<!--底部版权声明和友情链接-->
		<div class="container">
			<div class="row text-center" style="background-image: url(static/img/logobgcolor.png);">
				
				<p style="margin-bottom: 0px;margin-top: 5px;">友情链接</p>
				<div class="col-lg-4">
					<ul >
						<li>高校链接:</li>
						<li><a href="https://www.xidian.edu.cn/" target="_blank">西安电子科技大学</a></li>
						<li><a href="http://www.xjtu.edu.cn/" target="_blank">西安交通大学</a></li>
						<li><a href="http://www.nwpu.edu.cn/" target="_blank">西北工业大学</a></li>
					</ul>
				</div>
				<div class="col-lg-4">
					<ul >
						<li>企业链接:</li>
						<li><a href="https://job.alibaba.com/zhaopin/index.htm" target="_blank">阿里巴巴</a></li>
						<li><a href="https://hr.tencent.com/" target="_blank">腾讯</a></li>
						<li><a href="https://talent.baidu.com/external/baidu/index.html" target="_blank">百度</a></li>
					</ul>
				</div>
				<div class="col-lg-4">
					<ul >
						<li>招聘平台:</li>
						<li><a href="http://ts.zhaopin.com/jump/index_new.html?utm_source=other&utm_medium=cnt&utm_term=&utm_campaign=121122523&utm_provider=zp&sid=121122523&site=u2757483.k56330535607.a14507984702.pb" target="_blank">智联招聘</a></li>
						<li><a href="https://www.51job.com/?from=baidupz" target="_blank">51job</a></li>
						<li><a href="https://www.lagou.com/lp/html/common.html?utm_source=m_cf_cpc_baidu_pc&m_kw=baidu_cpc_cd_28b9be_1380d3_%E6%8B%9B%E8%81%98" target="_blank">拉钩网</a></li>
					</ul>
				</div>
			</div>
		</div>
	</body>

</html>