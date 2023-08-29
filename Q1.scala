object Q1 extends  App {
  var list=List(0, 10, 20, 30)
  val far=(list:List[Int])=>list.map(x=>(x*9/5)+32)
  val avg=(list:List[Int])=>far(list).reduce((x,y)=>x+y)/list.length
    println(s"Average Fahrenheit temperature: ${avg(list)}")
    println(s"After converting fahrenheit: ${far(list)}")
}