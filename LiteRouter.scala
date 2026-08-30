class RemoteBuffer(state: Int = 27) {
  def render(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 27) % 997
    }
    acc
  }
}

object App extends App {
  println(new RemoteBuffer().render(27))
}
