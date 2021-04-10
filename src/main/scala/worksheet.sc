val words = Array("abcw","baz","foo","bar","xtfn","abcdef")

val sets = words.map(_.toSet)

sets(0)

sets(1)

sets(0) & sets(1)