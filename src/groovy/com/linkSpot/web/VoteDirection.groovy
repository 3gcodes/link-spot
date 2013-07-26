package com.linkSpot.web

/**
 * Created with IntelliJ IDEA.
 * User: gdboling
 * Date: 7/19/13
 * Time: 6:42 PM
 * To change this template use File | Settings | File Templates.
 */
enum VoteDirection {
  UP("up"),
  DOWN("down")

  String value

  VoteDirection(String value) {
    this.value = value
  }

  String toString() {
    value
  }
}
