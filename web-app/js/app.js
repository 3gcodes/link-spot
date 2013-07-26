'use strict';

var linkSpotApp = angular.module('linkSpotApp', []);

linkSpotApp.config(function ($routeProvider) {

  $routeProvider.when('/', { redirectTo: '/articles' });

  $routeProvider.when('/articles', {
    controller: "ArticlesCtrl",
    templateUrl: "/link-spot/article/index"
  });

  $routeProvider.when("/articles/new", {
    controller: "CreateArticleCtrl",
    templateUrl: "/link-spot/article/create"
  });
});