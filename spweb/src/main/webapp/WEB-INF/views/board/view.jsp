<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../include/header.jsp"%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			View Page <small>Control panel</small>
		</h1>
		
		<hr align="left">
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li class="active">Dashboard</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">

		<div class="row">
		
				<div class="col-sm-4 col-lg-4 col-md-4" style="width: 430px">
					<div class="thumbnail">
						<img src="http://placehold.it/320x150" alt="">
						<div class="caption">
							<h4 class="pull-right">[댓글수]</h4>
							<h4>
								<a href="/board/view?bno=${board.bno}">${board.title}</a>
							</h4>
							<p>${board.content}</p>
						</div>
						<div class="ratings">
							<p class="pull-right">조회수${board.hit}</p>
							<p class="pull-right">등록일${board.regdate}</p>
							<p>
								<span class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span>
							</p>
						</div>
					</div>
				</div>
		

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