<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../include/header.jsp"%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
   <!-- Content Header (Page header) -->
	<section class="content-header"  style="margin-left:10%">
      <h1>
         Create Page
      </h1>
      <hr align="left" style="border:solid 1px #CCCCCC; width:200px;">
      <ol class="breadcrumb">
         <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
         <li class="active">Dashboard</li>
      </ol>
   </section>

   <!-- Main content -->
	<section class="content"  style="margin-left:10%">

       <form id="createform">
	      <p>Title<input type="text" name ='title' ></p>
	      <p>Content<input type="text" name ='content' style="height : 200px; width:1000px;" size="50"></p>
	      <p>Writer<input type="text" name ='writer'></p>
  	   
		  <input type="hidden" name="bno" value="${board.bno}">
		  <input id="cre" type="button" value="저장">
		  <input id="cancle" type="button" value="취소">
	   </form>
			
   
   
   </section>
   <!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
<script>
    var target = $("#createform")[0];
    $("#cre").click(function(){
        target.action="/board/create";
        target.method="post";
        target.submit();
    });
    $("#cancle").click(function(){
        target.action="/board/list";
        target.submit();
    });
</script>
</body>
</html>