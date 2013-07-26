package com.linkSpot

import com.linkSpot.web.VoteDirection

class Article {

  String title
  String url
  String description
  Date dateCreated
  Date lastUpdated

  static hasMany = [votes: Vote]

  static constraints = {
    title nullable: false, blank: false, maxSize: 255
    url nullable: false, blank: false, unique: true, url: true, maxSize: 255
    description nullable: false, blank: false, maxSize: 500
    dateCreated nullable: true
    lastUpdated nullable: true
  }

  Set<Vote> getUpVotes() {
    def upVotes = [] as Set<Vote>
    votes.each { vote ->
      if (vote.voteDirection == VoteDirection.UP) {
        upVotes << vote
      }
    }
    upVotes
  }

  Set<Vote> getDownVotes() {
    def downVotes = [] as Set<Vote>
    votes.each { vote ->
      if (vote.voteDirection == VoteDirection.DOWN) {
        downVotes << vote
      }
    }
    downVotes
  }
}
