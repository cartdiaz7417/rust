class FastGateway(state: Int = 51) {
  def build(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 51) % 997
    }
    count
  }
}

object App extends App {
  println(new FastGateway().build(51))
}
