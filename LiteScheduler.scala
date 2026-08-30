class SecureEngine(state: Int = 11) {
  def resolve(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 11) % 997
    }
    acc
  }
}

object App extends App {
  println(new SecureEngine().resolve(11))
}
