package lab_Ten;

public class Craps{
    public static void main(String[] args){
        Die die1 = new Die();
        Die die2 = new Die();
        
        Die die3 = new Die();
        Die die4 = new Die();
        
        die1.roll();
        die2.roll();
        
        
        int count = 0;
        
        int point1 = die1.getSide();
        int point2 = die2.getSide();
        

        
        int target = die1.getSide() + die2.getSide();
         
        System.out.println("Target Roll: " + point1  +" + " + point2 + " = " + target);
        
        //System.out.println("You rolled: " + point1  +" + " + point2);
    

        while(true){
            die3.roll();
            die4.roll();
            
            int point3 = die3.getSide();
            int point4 = die4.getSide();
            
            int userRoll = die3.getSide() + die4.getSide();
            count++;
            if(userRoll == target){
            		 System.out.println("You rolled: " + point3  +" + " + point4 + " = " + userRoll);
                     System.out.println("You rolled your target. You won!!!!" + " in " + count + " rolls!");
                     break;
            }else if(userRoll != target){
                    System.out.println("You rolled: " + point3  +" + " + point4 + " = " + userRoll);
            }else if(userRoll == 7 || target == 7){
                    System.out.println("You rolled your target. You won!!!!" + " in " + count + " rolls!");
                    break;
            }else if(userRoll == 7 || target != 7){
                    System.out.println("You Crapped out!" + " in " + count + " rolls!");
                    //System.out.print("in " + count + " rolls!");
                    break;
            } 
        }
    }
}
