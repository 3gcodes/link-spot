class UrlMappings {

  static mappings = {
    "/$controller/$action?/$id?" {
      constraints {
        // apply constraints here
      }
    }

    "/articles"(controller: "article", parseRequest: true) {
      action = [GET: "list", POST: "save"]
    }

    "/articles/upVote/$id"(controller: "article", action: "upVote")
    "/articles/downVote/$id"(controller: "article", action: "downVote")

    "/"(view: "/index")
    "500"(view: '/error')
  }
}
