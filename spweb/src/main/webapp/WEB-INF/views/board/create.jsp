<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../include/header.jsp"%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
   <!-- Content Header (Page header) -->
   <section class="content-header">
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
   <section class="content">

       <form action="/board/create" method="post">
	      <p>Title<input type="text" name ='title' ></p>
	      <p>Content<input type="text" name ='content' style="height : 200px; width:1000px;" size="50"></p>
	      <p>Writer<input type="text" name ='writer'></p>
      	  <input type="submit" value="저장">
  	   </form>
	   <form action="list">
	   	  <input type="submit" value="취소">
	   </form>
   
   </section>
   <!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
<script>
 
 </script>
</body>
</html>