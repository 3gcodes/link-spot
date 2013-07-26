modules = {

  core {
    resource url: 'lib/angularjs/angular.min.js'
    resource url: 'lib/bootstrap/css/bootstrap.min.css', disposition: 'head'
    resource url: 'lib/bootstrap/js/bootstrap.min.js', disposition: 'head'
    resource url: 'css/article.css', disposition: 'head'
  }

  app {
    dependsOn 'core'
    resource url: 'js/app.js'
    resource url: 'js/services.js'
    resource url: 'js/controllers.js'
  }
}