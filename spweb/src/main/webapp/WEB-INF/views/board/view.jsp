<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../include/header.jsp"%>



<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header"  style="margin-left:10%">
		<h1>
			View Page
		</h1>
		<hr align="left" style="border:solid 1px #CCCCCC; width:200px;">
		<hr align="left">
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li class="active">Dashboard</li>
		</ol>
	</section>


	<!-- Main content -->
	<section class="content" style="margin-left:10%">
		<div class="row">
			<div class="col-sm-4 col-lg-4 col-md-4" style="width: 1000px">
				<div style="border:solid 1px #CCCCCC; background-color: white;">
					<h4 style="margin-left:20px" >${board.title}</h4>
					<h5 style="margin-left:20px">${board.writer}</h5>
				    <h5 align="right">조회수:${board.hit}&nbsp;|&nbsp;&nbsp;공감:100&nbsp;&nbsp;|&nbsp;&nbsp;${board.regdate}&nbsp;</h5>
				</div>	
			</div>
		</div>
		<p><br></p>
		<div class="row">
			<div class="col-sm-4 col-lg-4 col-md-4" style="width: 1000px">
				<div style="border:solid 1px #CCCCCC; background-color: white;; height:500px;">
					<h1 align="center"> 사진 사진 사진 사진 사진 사진 사진 사진 사진 사진 사진 사진 사진 사진 사진 사진 사진 사진</h1>
				</div>	
			</div>
		</div>
		<p><br></p>
		<div class="row">
			<div class="col-sm-4 col-lg-4 col-md-4" style="width: 1000px">
				<div style="border:solid 1px #CCCCCC; background-color: white;">
					<h4 style="margin-left:20px" >태그 태그 태그 태그 태그 태그 태그 태그 태그 태그 태그 태그</h4>
					<hr align="left" style="border:solid 1px #CCCCCC; width:940px; margin-left:10px;">
					<h5 style="margin-left:20px">${board.content}</h5>
				</div>	
			</div>
		</div>
		<p><br></p>
		<div style="margin:0 360px 0 360px;width:1000px; padding-top:0px;">
			<div style="width:280px" >
				<ul style="width:102;height:70px;">
				<li style="list-style:none">
				<img src="img/like.png">
				</li>
				</ul>
	    	</div>
	    	<div style="width:280px">
	    		<ul style="margin-left:150px; width:102;height:70px;">
				<li style="list-style:none">
				<img src="img/unlike.png">
				</li>
				</ul>
	    	</div>
		</div>
			<div>
				<form action="/board/modify">
					<input type="hidden" name="bno" value="${board.bno}">
					<input type="submit" value="수정">
				</form>
				<form action="/board/delete" method="post">
					<input type="hidden" name="bno" value="${board.bno}">
					<input type="submit" value="삭제">
				</form>
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