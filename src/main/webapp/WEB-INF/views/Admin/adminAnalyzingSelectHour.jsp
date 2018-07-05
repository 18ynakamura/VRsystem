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

<title>分析データ</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/table.css" rel="stylesheet">
<script src="/js/jquery.min.js"></script>
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
              <a class="nav-link"onclick="location.href='adminMenu'">Menu <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
               <a class="nav-link"onclick="location.href='adminLogout'">Logout</a>

          </ul>

        </div>
      </nav>
    </header>



<div class="maxWidth">
<div class="blank">
<br><br><br>
<h1 class="h3 mb-3 font-weight-normal">Analyzing Data/4月3日</h1><br>
</div>
<table class="table">
  <thead class="thead-dark">

    <tr>
      <th scope="col">時間</th>
      <th scope="col">空席率</th>

    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">0~1</th>
      <td>100%</td>

    <tr>
      <th scope="row">1~2</th>
      <td>80%</td>

    </tr>
    <tr>
      <th scope="row">2~3</th>
      <td>70%</td>
    </tr>

    <tr>
      <th scope="row">3~4</th>
      <td>80%</td>
    </tr>

    <tr>
      <th scope="row">4~5</th>
      <td>80%</td>
    </tr>

    <tr>
      <th scope="row">5~6</th>
      <td>80%</td>

    </tr>
  </tbody>
</table>
</div>
<script>
jQuery( function($) {
$('tbody tr[data-href]').addClass('clickable').click( function() {
window.location = $(this).attr('data-href');
}).find('a').hover( function() {
$(this).parents('tr').unbind('click');
}, function() {
$(this).parents('tr').click( function() {
window.location = $(this).attr('data-href');
});
});
});
</script>
</body>
</html>