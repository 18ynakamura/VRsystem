   <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ja">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/css/favicon.ico">

    <title>Carousel Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">

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
            </li>

          </ul>

        </div>
      </nav>
    </header>

<style>
body {
  background-color: #ffffff;
}


.hoge {

	border: solid 1px #ccc;
	padding: 2.5px 30px;
	margin:0 0 0 1250px;

	font-family: Arial, sans-serif;
	font-size: 1.0em;
	text-transform: uppercase;
	font-weight: bold;
	color: #333;
	cursor: pointer;
	background-image: -webkit-gradient(linear, left top, left bottom, from(#ddd),
		to(#aaa));
	background-image: -webkit-linear-gradient(top, #ddd, #aaa);
	background-image: -moz-linear-gradient(top, #ddd, #aaa);
	background-image: -ms-linear-gradient(top, #ddd, #aaa);
	background-image: -o-linear-gradient(top, #ddd, #aaa);
	background-image: linear-gradient(top, #ddd, #aaa);
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ddd',
		endColorstr='#aaa', GradientType=0); /* IE6-9 */
	-moz-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.5);
	-webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.5);
	box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.5);
	-moz-box-shadow: 0px 1px 2px rgba(0, 0, 0, 0.2);
	-webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.2);
	box-shadow: 0px 1px 2px rgba(0, 0, 0, 0.2);
	-moz-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.5), 0px 1px 2px
		rgba(0, 0, 0, 0.2);
	-webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.5), 0px 1px 2px
		rgba(0, 0, 0, 0.2);
	box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.5), 0px 1px 2px
		rgba(0, 0, 0, 0.2);
	-moz-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.5), 0px 1px 2px
		rgba(0, 0, 0, 0.2);
	-webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.5), 0px 1px 2px
		rgba(0, 0, 0, 0.2);
	box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.5), 0px 1px 2px
		rgba(0, 0, 0, 0.2);
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	border-radius: 3px;
	text-shadow: 0px -1px 1px rgba(255, 255, 255, 0.8);
}
.a{

font-family: "ＭＳＰ明朝","ＭＳ 明朝",serif;
}
.btn1{

position:absolute; left:200px; top:160px;
  display: inline-block;
  text-decoration: none;
  color: #668ad8;
  width: 300px;
  height: 300px;
  line-height: 300px;
  border-radius: 50%;
  border: double 4px #668ad8;
  text-align: center;
  vertical-align: middle;
  overflow: hidden;
  transition: .6s;

}
.btn2{
 position:absolute; top:500px; left:410px;
  display: inline-block;
  text-decoration: none;
  color: #66CC66;
  width: 300px;
  height: 300px;
  line-height: 300px;
  border-radius: 50%;
  border: double 4px #66CC66;
  text-align: center;
  vertical-align: middle;
  overflow: hidden;
  transition: .6s;

}
.btn3{
  position:absolute;  left:600px;top:160px;
  display: inline-block;
  text-decoration: none;
  color: #FF6699;
  width: 300px;
  height: 300px;
  line-height: 300px;
  border-radius: 50%;
  border: double 4px #FF6699;
  text-align: center;
  vertical-align: middle;
  overflow: hidden;
  transition: .6s;

}


.btn1:hover{
  -webkit-transform: rotateY(360deg);
  -ms-transform: rotateY(360deg);
  transform: rotateY(360deg);
}
.btn2:hover{
  -webkit-transform: rotateY(360deg);
  -ms-transform: rotateY(360deg);
  transform: rotateY(360deg);
}
.btn3:hover{
  -webkit-transform: rotateY(360deg);
  -ms-transform: rotateY(360deg);
  transform: rotateY(360deg);
}


</style>
<body>

<a  class="btn1"onclick="location.href='adminUpdateInput'"><font size="5">管理者情報</font></a>
<a  class="btn2"onclick="location.href='adminShopMenu'"><font size="5">店舗情報</font></a>
<a  class="btn3"onclick="location.href='adminMemberSelectInput'"><font size="5">会員情報</font></a>

<form action="logout" method="post">
		<input type="submit" class="hoge"value="ログアウト">
	</form>
</body>
</html>