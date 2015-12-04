<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../include/header.jsp"%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			List Page <small>Total=${cri.totalCount}</small>
		</h1>
		<hr align="left" style="border: solid 1px #CCCCCC; width: 200px;">
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li class="active">Dashboard</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">

		<div class="row"  id="view">

			<c:forEach var="boardVO" items="${list}">
				<div class="col-sm-4 col-lg-4 col-md-4" style="width: 350px;">
					<div class="thumbnail">
						<!-- <ul style="margin-left:150px; width:102;height:70px;"> -->
						<img src="img/mina.jpeg">
						<div class="caption">
							<h4 class="pull-right">[댓글수]</h4>
							<h4>
								<a href="${boardVO.bno}">${boardVO.title}</a>
							</h4>
							<p>${boardVO.content}</p>
						</div>
						<div class="ratings">
							<p class="pull-right">조회수${boardVO.hit}</p>
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
			</c:forEach>

		</div>
		<div class="pull-left">
			<button>
				<a href="/board/create">글쓰기</a>
			</button>
		</div>
	</section>
	<!-- /.content -->
	<!-- cridata -->
	<form id="cri">
		
		<input type="hidden" name="pageNo" value="${cri.pageNo}" >
		<input type="hidden" name="searchType" value="${cri.searchType}">
		<input type="hidden" name="keyword" value="${cri.keyword}">
		<input type="hidden" name="totalCount"  value="${cri.totalCount}">
		<input type="hidden" name="perPage"  value="${cri.perPage}">
		<input type="hidden" name="perPageNum"  value="${cri.perPageNum}">
		<input type="hidden" name="bno" >		
	</form>
	<!-- /cridata -->
	
	<div class="row text-center">
		<div class="col-lg-12">
			<form id="searchform">
			<select name="searchType" id="searchType">
				<option value="n">----</option>
				<option value="t">제목</option>
				<option value="c">내용</option>
				<option value="w">작성자</option>
				<option value="tc">제목+내용</option>
				<option value="cw">내용+작성자</option>
				<option value="tcw">전체</option>
			</select>
			<input id="keyword" type="text" name="keyword">
			<button value="검색" id="search" size="50px">	</button>
			</form>
		</div>
		<div class="col-lg-12">
			<ul class="pagination" id="pageUL">
				aaa
			</ul>
		</div>
	</div>
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
<!-- jQuery 2.1.4 -->
<script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
$(document).ready(function () {
    
	
	var cri = ${cri.toString()};
	console.log(cri);	
	
    $("#keyword").val(cri.keyword);
    $("#pageUL").html(makePage(cri));
    console.log($("#pageUL"))
	
    var criform = $("#cri");
    
    $("#pageUL").on("click","li a", function(event){
    	event.preventDefault();
        console.log(this);
        var targetPage = $(this).attr("href");
        console.log(targetPage);
        criform[0][0].value = targetPage;
        criform.attr("action","/board/list").submit(); 
    });
    $("#view div div div h4 a").on("click",function(event){
    	event.preventDefault();
        console.log(this);
        var targetPage = $(this).attr("href");
        criform[0][6].value = targetPage;        
        criform.attr("action","/board/view").submit(); 
    });
    $("#searchType option[value="+cri.searchType+"]").attr("selected", "true")

    /**
     * 
     */
    });


</script>
</body>
</html>