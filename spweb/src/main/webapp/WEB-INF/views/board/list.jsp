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

		<div class="row">

			<c:forEach var="boardVO" items="${list}">
				<div class="col-sm-4 col-lg-4 col-md-4" style="width: 350px;">
					<div class="thumbnail">
						<!-- <ul style="margin-left:150px; width:102;height:70px;"> -->
						<img src="img/mina.jpeg">
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
	<form id="cri">
		<input type="hidden" name="pageNo" >
		<input type="hidden" name="searchType">
		<input type="hidden" name="keyword">
		<input type="hidden" name="totalCount">
		<input type="hidden" name="perPage">
		<input type="hidden" name="perPageNum">		
	</form>
	<div class="row text-center">
		<div class="col-lg-12">
			<select id="searchType">
				<option value="n">----</option>
				<option value="t">제목</option>
				<option value="c">내용</option>
				<option value="w">작성자</option>
				<option value="tc">제목+내용</option>
				<option value="cw">내용+작성자</option>
				<option value="tcw">전체</option>
			</select>
			<input id="keyword" type="text" name="keyword">
			<button value="검색" id="search" size="50px">
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
    var cri = {
    		pageNo:${cri.pageNo}, perPage:${cri.perPage}, totalCount:${cri.totalCount},
    		perPageNum:${cri.perPageNum}, keyword:${cri.keyword}, searchType:${cri.searchType}
    
    };
    var options = $("#searchType option");
    $("#searchType option[value="+cri.searchType+"]").attr("selected", "true")
    $("#keyword").val(cri.keyword);
    
    var criform = $("#cri");
    console.log(criform);
    (function(){
    	criform[0][0].value = cri.pageNo;
    	criform[0][1].value=cri.searchType;
    	criform[0][2].value = cri.keyword;
    	criform[0][3].value = cri.totalCount;
    	criform[0][4].value = cri.perPage;
    	criform[0][5].value = cri.perPageNum;
    })();
    console.log(criform[0]);
    
	
    $("#pageUL").html(makePage(cri));
    console.log($("#pageUL"))
	
    $("#pageUL").on("click","li a", function(event){
        event.preventDefault();
        console.log(this);
        var targetPage = $(this).attr("href");
        console.log(targetPage);
        criform[0][0].value = targetPage;
        criform.attr("action","/board/list").submit(); 
    });
    
    $("#search").on("click",function(event){
    	
    	criform[0][1].value=$("#searchType option").value;
    	criform[0][1].value=$("#searchType option").value;
    	criform.attr("action","/board/list").submit();
    });

   

    /**
     * 
     */
    });


</script>
</body>
</html>