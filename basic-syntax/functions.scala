def function(): Boolean = {
    // do something

    return true
}

// example
def add(a:Int, b:Int): Int = {
    return a + b
}

add(2, 3)                               // 5

// default arguments
def add(a:Int, b:Int = 3): Int = {
    return a + b
}

add(2)                                  // 5

// multiple return values
def add(a:Int, b:Int): (Int, Int, Int) = {
    var result = a + b
    
    return (a, b, result)
}

val (a, b, result) = add(2, 3)          // (2,3,5)

// documentation (scaladoc)

/** Documentation for function.
 *
 *  @param arg an argument
 */
def function(arg:Any) = {    
    // do something
}

'''
Michael Sjoeberg
2018-11-06
https://github.com/michaelsjoeberg/scala-playground/blob/master/basic-syntax/functions.scala
'''