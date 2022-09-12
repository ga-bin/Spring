<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   
<br /><br />
<h3>도서등록</h3>
<br />   
<form action="insert" method="post" name="insertForm" onsubmit="return false">
   <table>
      <tr>
         <td>도서번호</td>
         <td><input type="text" class="form-control"
            name="bookNo" value="${bookNo }" readonly></td>
      </tr>
      <tr>
         <td>도서명</td>
         <td><input type="text" class="form-control"
         name="bookName"  ></td>
      </tr>
      <tr>
         <td>도서표지</td>
         <td><input type="text" class="form-control"
         name="bookCoverimg" ></td>
      </tr>
      <tr>
         <td>출판일자</td>
         <td><input type="date" class="form-control"
         name="bookDate" ></td>
      </tr>
      <tr>
         <td>금액</td>
         <td><input type="number" class="form-control"
         name="bookPrice" ></td>
      </tr>
      <tr>
         <td>출판사</td>
         <td><input type="text" class="form-control"
         name="bookPublisher" ></td>
      </tr>
      <tr>
         <td>도서소개</td>
         <td><textarea class="form-control" cols="30" rows="4" style="resize: none;"
         name="bookInfo" ></textarea></td>
      </tr>
   </table>
   <button type="submit" onclick="insertBook()">등록</button>
</form>
<script>
   function insertBook(){
      let bookName = document.getElementsByName("bookName")[0];
      if(bookName.value==""){
         alert("도서명이 입력되지 않았습니다.");
         return;
      }
      insertForm.submit();
   }
</script>