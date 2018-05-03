import java.util.*;

public class myATOI{

    static ArrayList<Pair> pairs = new ArrayList<Pair>();
     public static void main(String []args){
        System.out.println("Hello World");
        int[] testArray = {1,2,3,6,7,8,9,1,5};
        int target = 10;
        int s = numberOfPairs(testArray,target);
        System.out.println(s);
     }
     
     public static int numberOfPairs(int[] array, int target){
         pairs.clear();
         for(int i =0; i <array.length; i++){
             int x = array[i];
             for(int j =0; j <array.length; j++){
                 int y = array[j];
                 if(i != j){
                     if(x+y == target){ 
                     Pair z = new Pair(x,y);
                     if(isDistinct(pairs,z)){
                         pairs.add(z);
                     }
                    }
                 }
             }
         }
         for(Pair p: pairs){
             p.print();
         }
         return pairs.size();
         
     }
     
     public static boolean isDistinct(ArrayList<Pair> p, Pair check){
         boolean d = true;
         for(Pair x: p){
             if(x.equals(check)){
              d = false;
              break;
             }
         }
         return d;
     }
     
}

class Pair{
    int x,y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean equals(Pair other){
        if (this.x == other.x && this.y == other.y) return true;
        else if (this.y == other.x && this.x == other.y) return true;
        else return false;
    }
    public void print(){
        System.out.println("(" + x + ", " + y + ")" );
    }
}