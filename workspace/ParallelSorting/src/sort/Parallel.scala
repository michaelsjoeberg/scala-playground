package sort

object Parallel extends App {
  def parMergeSort(xs: Array[Int], maxDepth: Int): Unit = {
        
    // intermediate array
    val ys = new Array[Int](xs.length)
  }
  def sort(from: Int, until: Int, depth: Int): Unit = {
    if (depth == maxDepth) {
      quickSort(xs, from, until - from)
    } else {
      val mid = (from + until) / 2
      parallel(sort(mid, until, depth + 1), sort(from, mid, until + 1))
    }
  }
}