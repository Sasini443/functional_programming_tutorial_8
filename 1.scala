case class Point(var x: Int, var y: Int) {
    def add(z:Point) =  Point(this.x + z.x, this.y + z.y)   //add two given points

    def move(x:Int, y:Int):Unit = {       //move a point by a given distance
        this.x = this.x + x
        this.y = this.y + y
    }

    def distance(z:Point) : Double = {     //distance between two given points
        var xDistant:Int = this.x - z.x
        var yDistant:Int = this.y - z.y
        var distant: Int = xDistant*xDistant + yDistant*yDistant
        scala.math.sqrt(distant)
    }

    def invert() :Unit = {  //switch the x and y coordinates
        var tmp = this.x
        this.x = this.y
        this.y = tmp
    }

}

object Point extends App {

    var a = Point(3,5)
    var b = Point(8,12)
    
    println(a.add(b))

    a.move(x = 2, y = 4)
    println(a)
    b.move(x = 1, y = 5)
    println(b)
    
    var c = a.distance(b)
    println(c)

    a.invert()
    println(a)
}