<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../include/header.jsp"%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
   <!-- Content Header (Page header) -->
   <section class="content-header">
      <h1>
         Modify Page
      </h1>
	  <hr align="left" style="border:solid 1px #CCCCCC; width:200px;">
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
      
 
         <button type="submit" class="btn btn-primary" style="border-color: black;">저장</button>
         <button type="submit" class="btn btn-warning" style="border-color: orange;">취소</button>
      
   <script>
         $(document).ready(function(){
            
            var formObj= $("form[role='form']");
            
            $(".btn-warning").on("click",function(){
               self.location="/board/listAll";
            });
            
            $(".btn-primary").on("click",function(){
               formObj.submit();
            });
            
         });
      
   
   </script>
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