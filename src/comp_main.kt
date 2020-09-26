fun main(){
    Compass.NORTH
    println("${goDirection(Compass.SOUTH)}")
    println(Compass.EAST.displayIt())

}

fun goDirection(dir:Compass): String{
    when (dir) {
        Compass.NORTH -> return  "North"
        Compass.SOUTH -> return  "South"
        Compass.WEST -> return  "West"
        Compass.EAST -> return  "East"
        else -> return  "Go Nowhere"
    }
}