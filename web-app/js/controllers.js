'use strict';

linkSpotApp.controller("ArticlesCtrl", function ($scope, $location, $log, articleService) {

  articleService.list().then(function (data) {
    $scope.articles = data;
  });

  $scope.voteUp = function (index) {
    var article = $scope.articles[index];
    articleService.upVote(article).then(function(data) {
      article.upVotes = data.upVotes;
    });
  }

  $scope.voteDown = function(index) {
    var article = $scope.articles[index];
    articleService.downVote(article).then(function(data) {
      article.downVotes = data.downVotes;
    });
  }
});

linkSpotApp.controller("CreateArticleCtrl", function ($scope, $location, $log, articleService) {
  $scope.currentArticle = null;
  $scope.saveArticle = function () {
    articleService.save($scope.currentArticle).then(function (data) {
      $location.path("/articles");
    });
  }

});



