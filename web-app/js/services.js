'use strict';

linkSpotApp.factory('articleService', function($http) {
	return {
		list: function() {
			return $http.get('/articles').then(function(result) {
				return result.data;
			});
		},

		save: function(article) {
			return $http.post('/articles', article).then(function(result) {
				return result.data;
			});
		},

    upVote: function(article) {
      return $http.post('/articles/upVote/' + article.id).then(function(result) {
          return result.data;
      });
    },

    downVote: function(article) {
      return $http.post('/articles/downVote/' + article.id).then(function(result) {
        return result.data;
      });
    }
	}
});