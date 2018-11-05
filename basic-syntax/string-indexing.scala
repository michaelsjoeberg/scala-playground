val string: String = "proton"

string.charAt(0)                                        // p
string.slice(0,4)                                       // prot

// using length
string.length                                           // 6
string.substring(0, string.length)                      // proton
string.substring(string.length - 4, string.length)      // oton

'''
Michael Sjoeberg
2018-11-05
https://github.com/michaelsjoeberg/scala-playground/blob/master/basic-syntax/string-indexing.scala
'''