
    fun main(args:Array<String>){
        val day= 50

       val result=when(day){

           3,4,5,-> "It is summer season"
           6,7,9 -> "It is raint season"
           8,11-> "It is auntumn season"
           10,12,1,2 -> "It is winter season"

           else -> "Invalid Input"

       }
    println(result)
}