
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Học Tiếng Nhật Ez VKL</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script type="text/javascript" src="JS/jquery-1.4.2.min.js"></script>
        <script src="JS/jquery.autocomplete.js"></script>


        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">

        <link href="css/shop-homepage.css" rel="stylesheet">

        <script>
            jQuery(function () {
                $("#key").autocomplete("list.jsp");
            });
        </script>
    </head>

    <body>

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar">a</span>
                        <span class="icon-bar">a</span>
                        <span class="icon-bar">a</span>
                    </button>
                    <a class="navbar-brand" href="#">Học tiếng Nhật online</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <div class="row"> <ul class="nav navbar-nav">

                            <li>
                                <a href="#">About</a>
                            </li>
                            <li>
                                <a href="HocTap.html">Học Tập</a>
                            </li>

                        </ul>

                    </div>
                </div>

            </div>

            <!-- /.navbar-collapse -->         <!-- /.container -->
        </nav>

        <!-- Page Content -->
        <ul class="nav nav-tabs" style="margin-left:250px;padding-bottom: 10px">
            <li role="presentation" >


                <a href="index" class="label label-warning">Home</a></li>



            <li role="presentation" ><a href="Hoctap" class="label label-warning">Học Tập</a></li>


            <li role="presentation" ><a href="error"class="label label-warning">eror</a></li>

        </ul>
        <div class="container">

            <div class="container">

                <form class="form-horizontal" style="margin-top: 20px;border: none !important">
                    <div class="form-group form-group-lg">
                        <label class="col-sm-2 control-label row form-group" for="formGroupInputLarge" style="margin-left:250px">Tra tu</label>
                        <div class="col-xs-4">

                            <input class="form-control" type="text" id="key" placeholder="Nhập Kanji,Hiragana hoặc Katakana" name="key" value="${word.wordSearch}"/>
                        </div>

                        <div class="col-xs-2">
                            <button class="btn btn-default btn-lg" type="text" name="action" value="Search" />
                            <span class="glyphicon glyphicon-search" aria-hidden="false"></span> Search
                            </button>
                        </div>
                    </div>
                </form>
                <div class="container">

                    <thead >   <table class="table">

                        <tr class="info">
                            <th>Word</th>

                            <th>Kanji</th>
                            <th>Âm Hán Việt</th>
                            <th>Nghĩa</th>
                            <th>Trình độ</th>
                        </tr>
                        </thead>
                        <tbody class="active">

                            <tr class="active">
                                <td>${word.wordSearch}</td>
                                <td>${word.wordKanji}</td>
                                <td>${word.wordKata}</td>
                                <td>${word.wordMean}</td>
                                <td>${word.wordCatalog}</td>

                            <tr>




                        </tbody>
                    </table>
                </div>
                <!-- Footer -->
                <footer>
                    <div class="row">
                        <div class="col-lg-12">

                        </div>
                    </div>
                </footer>

            </div>
            <!-- /.container -->



    </body>

</html>

