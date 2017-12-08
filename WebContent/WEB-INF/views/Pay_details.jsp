<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
							<li><a href="inviteJob_find_findAll.action">招聘管理</a></li>
							<li><a href="pay_find_findAll.action">薪酬管理</a></li>
							<li><a href="check_find_findAll.action">考勤管理</a></li>
							<li><a href="leave_find_findAll.action">请假管理</a></li>
							<li><a href="overtime_find_findAll.action">加班管理</a></li>
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

					<div class="col-md-12 column">
						<ul class="breadcrumb">
							<li><a href="#">Home</a></li>
							<li><a href="#">Library</a></li>
							<li class="active">Data</li>
						</ul>
						<table class="table">
							<thead>
								<tr>
									<th>工资编号</th>
									<th>员工编号</th>
									<th>工资发放时间</th>
									<th>基本工资</th>
									<th>加班工资</th>
									<th>缺勤扣除</th>

									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${payListFromServer }" var="pay">
									<tr>
										<td>${pay.payId }</td>
										<td>${pay.empno }</td>
										<td>${pay.payTime }</td>
										<td>${pay.sal }</td>
										<td>${pay.salAdd }</td>
										<td>${pay.salSub }</td>
										<td><a
											href="${pageContext.request.contextPath }/pay_delete.action?payId=${pay.payId}"
											onclick="return confirm('确认删除吗？')">删除</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						部门ID： <input type="number" value="1" id="payId" /> <a
							href="${pageContext.request.contextPath }/pay_find_findById.action?payId="
							onclick="findByIdHandler()" id="findById">精确查询</a>
						<script>
							function findByIdHandler() {
								//1-获取input-payId
								var payId = document.querySelector("#payId").value;
								console.log(payId);
								//2-获取a节点，拼接href属性
								var aNode = document.querySelector("#findById");
								console.log(aNode.href);
								aNode.href = aNode.href + payId;
								console.log(aNode.href);
								//3-实现跳转
								return true;
							}
						</script>
						<hr />
						<div style="float: right;">
							<a
								href="${pageContext.request.contextPath}/router_savePay.action ">添加工资项</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>