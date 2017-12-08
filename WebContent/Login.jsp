<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8" />
<title></title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body background="img/2.jpg"
	style="width: 100%; height: 100%; position: fixed;">
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>

				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">部门管理</a></li>
						<li><a href="#">员工管理</a></li>
						<li><a href="#">招聘管理</a></li>
						<li><a href="#">薪酬管理</a></li>
						<li><a href="#">考勤管理</a></li>
						<li><a href="#">请假管理</a></li>
						<li><a href="#">加班管理</a></li>

					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input class="form-control" type="text" />
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">登陆</a></li>

					</ul>
				</div>

				</nav>

				<div class="row clearfix">
					<div class="col-md-4 column"></div>
					<div class="col-md-5 column" style="margin-top: 100px;">
						<form
							action="${pageContext.request.contextPath }/user_login.action"
							method="post" class="form-horizontal" role="form">
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
								<div class="col-sm-10">
									<input class="form-control" id="username" name="login.username"
										type="text" style="width: 200px;" />
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
								<div class="col-sm-10">
									<input class="form-control" id="password" name="login.password"
										type="password" style="width: 200px;" />
								</div>
							</div>

							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10" style="clear: both;">
									<button type="submit" class="btn btn-default">登陆</button>
									<a href="${pageContext.request.contextPath }/router_reg.action">REGISTRY</a>
								</div>

							</div>
						</form>
					</div>
					<div class="col-md-3column"></div>
				</div>

			</div>
		</div>
	</div>
</body>

</html>