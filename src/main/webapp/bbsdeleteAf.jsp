<%@page import="dao.BbsDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
int seq = Integer.parseInt( request.getParameter("seq") );

BbsDao dao = BbsDao.getInstance();
boolean isS = dao.deleteBbs(seq);
if(isS){
	%>    
	<script type="text/javascript">
	alert("삭제완료!");
	location.href = "bbslist.jsp";
	</script>
	<%
}else{	
	%>
	<script type="text/javascript">
	alert("삭제 실패!");
	let seq = "<%=seq %>";
	location.href = "bbsdetail.jsp?seq=" + seq;
	</script>
	<%
}	
%>

</body>
</html>