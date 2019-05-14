val string: String = "proton neutron"

string.capitalize                       // Proton neutron
string.toUpperCase                      // PROTON NEUTRON
string.toLowerCase                      // proton neutron

// counting and finding in text
string.count(_ == 'p')                  // 1
string.indexOf("t")                     // 3

// remove whitespace from string
val string: String = "    some text    "
string.trim                             // some text

'''
Michael Sjoeberg
2018-11-05
https://github.com/michaelsjoeberg/scala-playground/blob/master/basic-syntax/string-operations.scala
'''