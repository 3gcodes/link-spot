'use strict';

linkSpotApp.factory('articleService', function($http) {
	return {
		list: function() {
			return $http.get('/link-spot/articles').then(function(result) {
				return result.data;
			});
		},

		save: function(article) {
			return $http.post('/link-spot/articles', article).then(function(result) {
				return result.data;
			});
		},

    upVote: function(article) {
      return $http.post('/link-spot/articles/upVote/' + article.id).then(function(result) {
          return result.data;
      });
    },

    downVote: function(article) {
      return $http.post('/link-spot/articles/downVote/' + article.id).then(function(result) {
        return result.data;
      });
    }
	}
});