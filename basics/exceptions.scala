try {
    // do something
}
catch {
    case a: ArithmeticException => println("This is an arithmetic error: " + a)
    case b: Throwable => println("Error: " + b)
}
finally {
    // do something
}

'''
Michael Sjoeberg
2018-11-06
https://github.com/michaelsjoeberg/scala-playground/blob/master/basic-syntax/exceptions.scala
'''