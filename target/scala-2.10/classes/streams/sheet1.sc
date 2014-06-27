package streams
import streams.{Solver,GameDef}
import streams.Block
import streams.Pos
import streams Move

object sheet1 {
  println("Welcome to the Scala worksheet")
  
  val s = new Solver
  {
    
  
  };
  
  val set =Set(
  (Block(Pos(1,2),Pos(1,3)), List(Right,Left,Up)),
  (Block(Pos(2,1),Pos(3,1)), List(Down,Left,Up))
)
}