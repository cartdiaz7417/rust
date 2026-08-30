class DynamicHandler(state: Int = 38) {
  def run(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 38) % 997
    }
    total
  }
}

object App extends App {
  println(new DynamicHandler().run(38))
}
