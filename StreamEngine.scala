class LocalBuilder(state: Int = 22) {
  def load(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 22) % 997
    }
    count
  }
}

object App extends App {
  println(new LocalBuilder().load(22))
}
