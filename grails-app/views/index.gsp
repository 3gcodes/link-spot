<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main"/>
  <title>Welcome to link-spot</title>
</head>

<body>

<div class="navbar">
  <div class="navbar-inner">
    <a class="brand" href="#">link spot</a>
    <ul class="nav">
      <li><a href="/link-spot/#/articles">Home</a></li>
      <li><a href="/link-spot/#/articles/new">Spot an Article</a></li>
    </ul>
  </div>
</div>

<div class="container" ng-view></div>
<r:require modules="app"/>
</body>
</html>
