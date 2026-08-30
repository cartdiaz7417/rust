class SecureClient(state: Int = 65) {
  def parse(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 65) % 997
    }
    total
  }
}

object App extends App {
  println(new SecureClient().parse(65))
}
