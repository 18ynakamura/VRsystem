<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ja">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>店舗登録</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/form.css" rel="stylesheet">
 <!-- Custom styles for this template -->
    <link href="css/carousel.css" rel="stylesheet">

</head>

<body>]
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
	<form action="adminShopDetailInsertInput" class="form-signin">
		<img class="mb-4"
			src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg"
			alt="" width="72" height="72">
		<h1 class="h3 mb-3 font-weight-normal">店舗情報登録</h1>
		<div class="row">
		<div class="col">
		<input class="form-control" type="text" placeholder="店舗名">
		</div>
		<div class="col">
		<input class="form-control" type="text" placeholder="TEL">
		</div>
		</div><br>
		<div class="row">
		<div class="col">
			<label class="mr-sm-2" for="inlineFormCustomSelect">エリア</label> <select
				class="custom-select mr-sm-2" id="inlineFormCustomSelect">
				<option selected>エリアを選んでください</option>
				<option value="1">八重洲</option>
				<option value="2">日本橋</option>
				<option value="3">神田</option>
				<option value="3">六本木</option>
			</select>
		</div>
		<div class="col">
			<label class="mr-sm-2" for="inlineFormCustomSelect">料理のジャンル</label> <select
				class="custom-select mr-sm-2" id="inlineFormCustomSelect">
				<option selected>ジャンルを選んでください</option>
				<option value="1">和食</option>
				<option value="2">中華</option>
				<option value="3">イタリアン</option>
				<option value="3">フレンチ</option>
			</select>
		</div>
		</div><br>
		<div class="row">
		<div class="col-3">
			<label class="mr-sm-2" for="inlineFormCustomSelect">価格設定</label> <select
				class="custom-select mr-sm-2" id="inlineFormCustomSelect">
				<option selected>価格帯を選んでください</option>
				<option value="1">~1000</option>
				<option value="2">1000~2000</option>
				<option value="3">2000~3000</option>
				<option value="3">3000~4000</option>
			</select>
		</div>
	</div><br>

		<div class="form-group">
			<label for="exampleFormControlFile1">料理画像</label> <input type="file"
				class="form-control-file" id="exampleFormControlFile1">
		</div>

		<div class="form-group">
			<label for="exampleFormControlFile1">店内画像</label> <input type="file"
				class="form-control-file" id="exampleFormControlFile1">
		</div>
		<br>
		<div class="row">
		<div class="col">
		<button class="btn btn-lg btn-warning btn-block" type="submit">登録</button>
		</div>
		<div class="col">
		<button class="btn btn-lg btn-default btn-block" type="button" onclick="location.href='adminMenu'">メニュー</button>
		</div>
		</div>
		<p class="mt-5 mb-3 text-muted">&copy; 2018 VandRSytem AllRights Reserved</p>
	</form>
</body>
</html>
