<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
							<li class="active"><a href="dept_find_findAll.action">部门管理</a></li>
							<li><a href="emp_find_findAll.action">员工管理</a></li>
							<li><a href="#">招聘管理</a></li>
							<li><a href="#">薪酬管理</a></li>
							<li><a href="#">考勤管理</a></li>
							<li><a href="#">请假管理</a></li>
							<li><a href="#">加班管理</a></li>
							<li><a
								href="${pageContext.request.contextPath }/router_report.action">报表查看</a></li>
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
					<div class="col-md-6 column" style="margin-top: 100px;">
						<form
							action="${pageContext.request.contextPath}/user_registry.action"
							method="post" class="form-horizontal" role="form">
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
								<div class="col-sm-10">
									<input class="form-control" name="login.username" id="username"
										type="text" style="width: 200px;" />
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
								<div class="col-sm-10">
									<input class="form-control" name="login.password" id="password"
										type="password" style="width: 200px;" />
								</div>
							</div>

							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">优先权</label>
								<div class="col-sm-10">
									<input class="form-control" id="priority" name="login.priority"
										type="number" style="width: 200px;" />
								</div>
							</div>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">真实姓名</label>
								<div class="col-sm-10">
									<input class="form-control" id="inputEmail3"
										name="detail.realname" type="text" style="width: 200px;" />
								</div>
							</div>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">出生日期</label>
								<div class="col-sm-10">
									<input class="form-control" id="inputEmail3"
										name="detail.birthday" type="date" style="width: 200px;" />
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10" style="clear: both;">
									<button type="submit" class="btn btn-default">注册</button>
									<input type="reset" value="RESET" class="btn btn-default">
								</div>

							</div>
						</form>
					</div>
					<div class="col-md-2 column"></div>
				</div>

			</div>
		</div>
	</div>
</body>

</html>