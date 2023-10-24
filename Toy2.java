import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
 
public class Toy2 {
    // /**
    //  * @param args
    //  */
    public static void main(String [] args){
int ids [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
String[] names = {"Машинка", "Робот", "Мягкая игрушка", "Кукла", "Пистолет", "Коструктор", "Мяч", "Юла", "Вертолет", "Погремушка"};
double [] weights = {0.5, 0.4, 0.3, 0.5, 0.1, 0.6, 0.4, 0.7, 0.9, 0.2};
 
final PriorityQueue  toysQueue  = new   PriorityQueue  ((t1, t2) -> Double.compare(((Toy1) t2).getWeight(), ((Toy1) t1).getWeight()));
for(int i = 0; i<ids.length; i++){
    Toy1 toy = new Toy1 (ids [i], names [i], weights [i]);
    toysQueue.add(toy);
}
//System.out.println(toysQueue);
List  <Toy1> resList  = new ArrayList<Toy1>();
for(int i = 0; i<10; i++){
    Toy1 currentToy = (Toy1) toysQueue .poll();
        resList.add(currentToy);
}
//System.out.println(resList);
String fileName = "result.txt";
try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
   for  (Toy1 toy:  resList){
    writer.write (String.format("id: %d, \n Название: %s, \n Частота выпадения: %2fn, \n", toy.getId(),
     toy.getName(), toy.getWeight()));
   }
}catch(IOException e) {
    System.err.format("IOException: %s%n", e);
}
}
}
