package streams
import streams.{Solver,GameDef}
import streams.Block
import streams.Pos
import streams Move

object sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(168); 
  println("Welcome to the Scala worksheet");$skip(41); 
  
  val s = new Solver
  {
    
  
  };System.out.println("""s  : streams.Solver = """ + $show(s ));$skip(121); ;
  
  val set =Set(
  (Block(Pos(1,2),Pos(1,3)), List(Right,Left,Up)),
  (Block(Pos(2,1),Pos(3,1)), List(Down,Left,Up))
);System.out.println("""set  : <error> = """ + $show(set ))}
}
