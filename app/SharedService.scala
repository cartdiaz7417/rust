class SecureScheduler(state: Int = 31) {
  def decode(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 31) % 997
    }
    acc
  }
}

object App extends App {
  println(new SecureScheduler().decode(31))
}
