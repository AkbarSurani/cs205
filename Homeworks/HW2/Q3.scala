object Q3{
	def sortInsert(list: List[Int], m: Int):List[Int]=
	list match {
		case Nil => m::inputlist
		case hd::rest if m <= hd => m::list
		case hd::rest if hd < m => hd::sortInsert(rest,m)
	}
	def main(args: Array[String]): Unit= 
	{
		println("Inserting 19 in (2, 6, 12, 24, 30, 45): ", sortInsert(List(2, 6, 12, 24, 30, 45),55))
	}
}