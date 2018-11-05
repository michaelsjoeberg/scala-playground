// maps, hash tables, with key:value pairs are immutable
val map_any = Map("Adam" -> List("adam@email.com", 2445055),
                  "Bard" -> "bard@email.com" )

map_any("Adam")                                     // List(adam@email.com, 2445055)
map_any.contains("Bard")                            // true
map_any.exists(_ == "Bard" -> "bard@email.com")     // true

// mutable map
val map_mutable = scala.collection.mutable.Map[String, Int]()

map_mutable += ("Alpha" -> 1, "Beta" -> 2)          // Map(Beta -> 2, Alpha -> 1)
map_mutable -= "Beta"                               // Map(Alpha -> 1)
map_mutable("Alpha") = 100                          // Map(Alpha -> 100)

'''
Michael Sjoeberg
2018-11-05
https://github.com/michaelsjoeberg/scala-playground/blob/master/basic-syntax/maps.scala
'''