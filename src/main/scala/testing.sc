
val list = List(1, 2, 3, 4, 5, 6, 7)
val zipped = list.zip(list.reverse)
val pairs = zipped filter { t => t._1 < t._2}
val single = zipped find { t => t._1 == t._2}

(1 to 4).foldLeft(0){(res, e) => res + e*e }