<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한 줄 게시판 글목록</title>
</head>
<body>
	<h2>한 줄 게시판</h2>
	<hr>
	<table border="1" callspacing="0" callpadding="0" width="1000">
		<tr bgcolor="skyblue" height="40">
			<th>번호</th>
			<th>글쓴이</th>
			<th>한줄내용</th>
			<th>삭제</th>
		</tr>
		<tr align="center">
			<td>3</td>
			<td>홍길동</td>
			<td align="left" width="600">안녕하세요 오늘 날씨가 추워욜</td>
			<td><input type="button" value="X" onclick="javascript:window.location='delete'"></td>
		</tr>
		<tr>
			<td colspan="4" align="right">
				<input type="button" value="한줄쓰기" onclick="javascript:window.location='writeForm'">
			</td>
		</tr>
	</table>
</body>
</html>