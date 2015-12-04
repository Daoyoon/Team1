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
					<h5 style="margin-left:20px">작성자:&nbsp;${board.writer}</h5>
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
		<br>
			<div style="width:1000px;">
				<form id="viewform" style="margin-left:805px" >
				    <input type="hidden" name="bno" value="${board.bno}">
				    <input id="list" type="button" value="목록가기">
				    <input id="mod" type="button" value="수정">
				    <input id="del" type="button" value="삭제">
				</form>
			</div>
	</section>
	<section class="content" style="margin-left:10%">
		<div style="width:1000px" align="center">
		<span>
			<img src="img/like.png" width="50px">
	    </span>
	    <span>		
			<img src="img/unlike.png" width="50px">	
	    </span>
	    </div>
	</section>
		<form id="cri">
		
		<input type="hidden" name="pageNo" value="${cri.pageNo}" >
		<input type="hidden" name="searchType" value="${cri.searchType}">
		<input type="hidden" name="keyword" value="${cri.keyword}">
		<input type="hidden" name="totalCount"  value="${cri.totalCount}">
		<input type="hidden" name="perPage"  value="${cri.perPage}">
		<input type="hidden" name="perPageNum"  value="${cri.perPageNum}">
		<input type="hidden" name="bno" >		
	</form>
</div>

<%@include file="../include/footer.jsp"%>

<script>
    var target = $("#viewform")[0];
    $("#list").click(function(){
        var criform = $("#cri");
    	criform.attr("action","/board/list").submit();
    });
    $("#mod").click(function(){
        target.action="/board/modify";
        target.submit();
    });
    $("#del").click(function(){
        target.action="/board/delete";
        target.method="post";
        target.submit();
    });
</script>
</body>
</html>