class AtomicDispatcher(state: Int = 83) {
  def render(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 83) % 997
    }
    value
  }
}

object App extends App {
  println(new AtomicDispatcher().render(83))
}
