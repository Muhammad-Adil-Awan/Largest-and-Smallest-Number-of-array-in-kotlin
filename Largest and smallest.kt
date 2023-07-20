fun main() {
  val number = Array(5) { i -> i * 1 }
  var largest : Int
  var smallest : Int
  println("Enter the elements : ")
  for (x in 0..4)
  {
    number[x]=readln().toInt()
  }
  largest = number[0]
 for(x in 1..4)
 {
   if(largest <= number[x] )
   {
     largest = number[x]
   }
 }
  smallest = number[0]
  for(x in 1..4)
  {
    if(smallest >= number[x])
    {
      smallest = number[x]
    }
  }
  println("Largest : $largest \nSmallest : $smallest ")
}
