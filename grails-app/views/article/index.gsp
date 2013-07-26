<div class="container">
  <div class="row" data-ng-repeat="article in articles">
    <div class="span8 article-block">
      <h4><a href="{{article.url}}">{{article.title}}</a></h4>
      {{article.description}}
      <hr/>
      <div>
        <button class="btn btn-mini btn-success" data-ng-click="voteUp($index)">{{article.upVotes}}</button>
        <button class="btn btn-mini btn-warning" data-ng-click="voteDown($index)">{{article.downVotes}}</button>
      </div>
    </div>
  </div>
</div>