package mocks
import base._


class MockGame (val board: Array[String]) extends GameRules {
var boards = List[Array[String]]()
var takeTurnCalled = false

  def getCurrentBoard(): Array[String] = {
    board
  }
  def clearBoard(): Unit = ???
  def isDraw(): Boolean = {
      false 
  }
  def isEnd(): Boolean = {
    true
  }
  def isWin(): Boolean = {
    true
  }
  
  def winnerMark() :String = {
    "x"
  }
  
  def clearAt(cell: String): Unit = ???
  
  def availableCells(): List[String] = {
    List("5", "6", "7", "8", "9")
  }
  
  override def takeTurn(moveSelection: String, playerMark: String): Array[String] = {
    takeTurnCalled = true
    if (boards.isEmpty) Array[String]("") else boards.head
  }
  
  //expectations
  def isTakeTurnCalled(): Boolean = {
    takeTurnCalled
  }
  
  
  
}