<div>
  <form class="form-horizontal">
    <fieldset>
      <legend>Spot an Article</legend>

      <div class="control-group">
        <div class="controls">
          <input type="text" placeholder="title" class="span6" data-ng-model="currentArticle.title"/>
        </div>
      </div>

      <div class="control-group">
        <div class="controls">
          <input type="text" placeholder="url" class="span6" data-ng-model="currentArticle.url"/>
        </div>
      </div>

      <div class="control-group">
        <div class="controls">
          <textarea placeholder="description" class="span6" rows="5"
                    data-ng-model="currentArticle.description"></textarea>
        </div>
      </div>

      <div class="control-group">
        <div class="controls">
          <button type="submit" class="btn btn-primary" data-ng-click="saveArticle()">Submit</button>
        </div>
      </div>

    </fieldset>
  </form>
</div>