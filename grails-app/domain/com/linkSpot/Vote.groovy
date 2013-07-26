package com.linkSpot

import com.linkSpot.web.VoteDirection

class Vote {

  Date dateCreated
  VoteDirection voteDirection

  static belongsTo = [article: Article]

  static constraints = {
  }
}
