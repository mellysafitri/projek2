
fun main(){
    println("Masukkan nilai UTS")
    val UTS: Int= readLine()!!.toInt()
    println("Masukkan nilai UAS")
    val UAS: Int=  readLine()!!.toInt()

    val NA:Double=(0.4 * UTS) + (0.6 * UAS)
    println(NA)
    if (NA > 80){
        println("Selamat Anda Naik Semester")
    }
    else
        println("Anda Cuti")

    println("masukkan pilihan angka 1-2")
    val angka: Int= readLine()!!.toInt()

    when (angka){
        3,4,5-> println("It is Summer eason")
    }


}

