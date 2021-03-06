val numbers: List[Int] = List(1, 2, 3, 4)       // List(1, 2, 3, 4)

for (number <- numbers) {
    // do something
}

// nested
for (i <- List.range(1, 5)) {
    for (j <- List.range(1, 5)) {
        // do something
    }
}

'''
Michael Sjoeberg
2018-11-05
https://github.com/michaelsjoeberg/scala-playground/blob/master/basic-syntax/for-loop.scala
'''