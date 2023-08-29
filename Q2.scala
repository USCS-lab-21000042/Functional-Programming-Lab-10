object Q2 extends App{
    var list=List("Banana","Apple","Orange","Pineapple")
    val count=(list:List[String])=>list.map(x=>x.length).reduce((x,y)=>x+y)
    print(s"Total count of letter occurrences: ${count(list)}")
}