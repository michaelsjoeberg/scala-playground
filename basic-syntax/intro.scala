// filename.scala

object Main {
    // do something

    def main(args: Array[String]) {
        // do something
    }
}

// compile: $ scalac filename.scala
// run: $ scala filename

// add to build system and run with https://www.sublimetext.com
{
    "cmd": ["scala", "$file"],
    "path": "$PATH:/usr/local/bin",
    "file_regex": "^(.+):(\\d+): .+: (.+)",
    "selector": "source.scala"
}

'''
Michael Sjoeberg
2018-11-05
https://github.com/michaelsjoeberg/scala-playground/blob/master/basic-syntax/intro.scala
'''