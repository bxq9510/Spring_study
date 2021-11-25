<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> <!-- html 5 version -->
<html lang="en"> <!-- 개발 언어가 영문 -->
<head>
    <meta charset="UTF-8"> <!-- 글자 코드방식 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title> <!-- 문서 제목 -->
    <style>

    </style>
</head>

<body>
    <h2 id="MainLabel"> 게시판 글쓰기</h2>
    <form action="bbsinput" method=post>
    <!-- action은 컨트롤러 이름, method는 파라미터 전달방식 get or post
    	 form 태그 범위에 name으로 지정된 것이 변수가 되어 파라미터로 전송이 된다 -->
    <table border="1" id="logintable">
        <tr>
            <td>제목</td>
            <td><input type="text" name="title" id="title"></td>
        </tr>
        <tr>
            <td>작성자</td>
            <td><input type="text" name="name" id="name" value=""></td>
        </tr>
        <tr>
            <td>내용</td>
            <td><input type="text" name="memo" id=""></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="button" value="다시쓰기">
                <input type="button" value="글쓰기" onClick="t1()">
                <input type="button" value="글쓰기2" onClick="t2()">
                <input type="submit" value="저장"> <!-- submit액션은 form 지정된 action으로 이동하라의 의미 -->
            </td>
        </tr>
    </table>
    </form>
</body>
<script>
    function t1(){  // 함수 정의부
        let title = document.getElementById("title").value;
        let name = document.getElementById("name").value;
        alert("제목 : " + title + " / " + "작성자 : " + name);
    }
    function t2(){  // 함수 정의부
        let title = document.getElementById("title").value;
        let name = document.getElementById("name").value;
        document.getElementById("MainLabel").innerHTML = "<font color = red>제목 : " + title + "/" + "작성자 : " + name;
    }
</script>
</html>