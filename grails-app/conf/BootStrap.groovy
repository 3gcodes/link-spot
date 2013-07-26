import com.linkSpot.Article
import com.linkSpot.Vote
import com.linkSpot.web.VoteDirection

class BootStrap {

  def init = { servletContext ->
    def article1 = new Article(title: 'Injecting Grails Config Properties Into Services', url: 'http://blog.greggbolinger.com/blog/2013/07/19/injecting-grails-config-properties-into-services/', description: 'One of the things I really like about looking at other engineer’s code is that I pick up tips and tricks that I might never have thought of doing before. This only improves my own skillset. Recently, I started doing a small bit of work for a new client with an established Grails application. ')
    (1..5).each {
      article1.addToVotes(new Vote(voteDirection: VoteDirection.UP))
    }
    article1.save()

    def article2 = new Article(title: 'A Month with a Standing Desk', url: 'http://blog.greggbolinger.com/blog/2013/07/18/a-month-with-a-standing-desk/', description: 'A little over a month ago I hacked together a makeshift standing desk. I had read quite a bit about them and given the benefits I wanted to give it a go. After just a few days, I knew I wanted something more permanent. I started doing research on how to build my own since all the existing standing desk options were completely out of my price range.')
    (1..3).each {
      article2.addToVotes(new Vote(voteDirection: VoteDirection.DOWN))
    }
    (1..5).each {
      article2.addToVotes(new Vote(voteDirection: VoteDirection.UP))
    }
    article2.save()

    def article3 = new Article(title: 'Standing Desk and Other Productivity Boosters', url: 'http://blog.greggbolinger.com/blog/2013/06/03/standing-desk-and-other-productivity-boosters/', description: 'Today is my first day trying a standing desk. I hacked one together last night with some spare parts around the office. I wanted to try it out and see how I like it before investing in a more permanent solution. This was my tweet from last night:')
    (1..2).each {
      article3.addToVotes(new Vote(voteDirection: VoteDirection.UP))
    }
    (1..3).each {
      article3.addToVotes(new Vote(voteDirection: VoteDirection.DOWN))
    }
    article3.save()


  }
  def destroy = {
  }
}
