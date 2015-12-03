<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../include/header.jsp"%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper" >
	<!-- Content Header (Page header) -->
	<section class="content-header" style="margin-left:5%">
		<h1>
			List Page <small>Control panel</small>
		</h1>
		<hr align="left" style="border:solid 1px #CCCCCC; width:200px;">
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li class="active">Dashboard</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content"  style="margin-left:5%">

		<div class="row">
		    
			<c:forEach var="boardVO" items="${list}">
				<div class="col-sm-4 col-lg-4 col-md-4" style="width: 430px">
					<div class="thumbnail">
						<!-- <ul style="margin-left:150px; width:102;height:70px;"> -->
						<img src="img/mina.jpeg" style="width:320px; height:150px;">
						<div class="caption">
							<h4 class="pull-right">[댓글수]</h4>
							<h4>
								<a href="/board/view?bno=${boardVO.bno}">${boardVO.title}</a>
							</h4>
							<p>${boardVO.content}</p>
						</div>
						<div class="ratings">
							<p class="pull-right">조회수${boardVO.hit}</p>
							<p>
								<span class="glyphicon glyphicon-star"></span>
								<span class="glyphicon glyphicon-star"></span>
								<span class="glyphicon glyphicon-star"></span>
								<span class="glyphicon glyphicon-star"></span>
								<span class="glyphicon glyphicon-star"></span>
							</p>
						</div>
					</div>
				</div>
			</c:forEach>
			
		</div>
		<div class="pull-right" style="margin-right:150px">
			<button><a href="/board/create">글쓰기</a></button>
		</div>
	</section>
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
<script>
 
 </script>
</body>
</html>