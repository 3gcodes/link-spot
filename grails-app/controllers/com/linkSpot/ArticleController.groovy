package com.linkSpot

import com.linkSpot.web.VoteDirection
import grails.converters.JSON

class ArticleController {

  def index() {}

  def list() {
    def articles = Article.list().collect {
      [id: it.id, title: it.title, url: it.url, description: it.description, upVotes: it.upVotes.size(), downVotes: it.downVotes.size()]
    }
    render articles as JSON
  }

  def create() {}

  def save() {
    def article = new Article(params)
    article.save(flush: true)
    render (contentType: "text/json") {
      [title: article.title, url: article.url, description: article.description, upVotes: article.upVotes.size(), downVotes: article.downVotes.size()]
    }
  }

  def upVote() {
    def article = Article.get(params.id)
    def upVote = new Vote(voteDirection: VoteDirection.UP)
    article.addToVotes(upVote)
    article.save(flush: true)
    render (contentType: "text/json") {
      [title: article.title, url: article.url, description: article.description, upVotes: article.upVotes.size(), downVotes: article.downVotes.size()]
    }

  }

  def downVote() {
    def article = Article.get(params.id)
    def downVote = new Vote(voteDirection: VoteDirection.DOWN)
    article.addToVotes(downVote)
    article.save(flush: true)
    render (contentType: "text/json") {
      [title: article.title, url: article.url, description: article.description, upVotes: article.upVotes.size(), downVotes: article.downVotes.size()]
    }

  }

}