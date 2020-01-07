package filesystem

import commands.Command
import files.Directory

object Filesystem extends App {

  val root = Directory.ROOT
//  var state = State(root, root)
//  val scanner = new Scanner(System.in)
//
//  while (true) {
//    state.show
//    val input = scanner.nextLine()
//    state = Command.from(input).apply(state)
//  }

  io.Source.stdin.getLines().foldLeft(State(root, root))((currentState, newLine) => {
    currentState.show
    Command.from(newLine).apply(currentState)
  })
}
