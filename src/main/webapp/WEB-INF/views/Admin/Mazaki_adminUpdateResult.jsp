<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!doctype html>
<html lang="ja">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>管理者情報結果画面</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/signin.css" rel="stylesheet">


    <!-- Custom styles for this template -->
    <link href="css/carousel.css" rel="stylesheet">
</head>

<body>
<header>
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="#">VandRsystem</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
          <ul class="navbar-nav mr-auto">
           <li class="nav-item active">
               <a class="nav-link"onclick="location.href='adminMenu'">Menu<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
             <a class="nav-link"onclick="location.href='adminLogout'">Logout</a>
            </li>

          </ul>

        </div>
      </nav>
    </header>
	<form action="adminUpdateResult" class="form-signin">
		<img class="mb-6"
			src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg"
			alt="" width="100" height="100">

		<h1 class="h3 mb-8 font-weight-normal">正常に更新されました</h1><br><h2>ありがとうございました</h2>


		<div class="row">
		<div class="col">
		<button class="btn btn-lg btn-warning btn-block"  type="button"onclick="location.href='adminMenu'">メニュー</button>
		</div>

		</div>
		<p class="mt-5 mb-3 text-muted">&copy;  2018 VandRSytem AllRights Reserved</p>
	</form>
</body>
</html>
