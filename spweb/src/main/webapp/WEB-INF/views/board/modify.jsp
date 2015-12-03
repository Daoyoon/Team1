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
      
      <hr align="left">
      <ol class="breadcrumb">
         <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
         <li class="active">Dashboard</li>
      </ol>
   </section>

   <!-- Main content -->
   <section class="content">

      <form action="/board/modify" method="post">
      <input type="hidden" name="bno" value="${board.bno}">
      <p>Title &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name ='title' value="${board.title}" ></p>
      <p>Content<input type="text" name ='content' style="height : 200px" size="50" value="${board.content}"></p>
      <p>Writer &nbsp;<input type="text" name ='writer' value="${board.writer}"></p>
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