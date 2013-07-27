'use strict';

var linkSpotApp = angular.module('linkSpotApp', []);

linkSpotApp.config(function ($routeProvider, $locationProvider) {
  $locationProvider.html5Mode(true);

  $routeProvider.when('/', { redirectTo: '/articles' });

  $routeProvider.when('/articles', {
    controller: "ArticlesCtrl",
    templateUrl: "/article/index"
  });

  $routeProvider.when("/articles/new", {
    controller: "CreateArticleCtrl",
    templateUrl: "/article/create"
  });
});