import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] jerseyValues = new int[5];
      int[] ratingValues = new int[5];
      char chooseOption;
      int above,i;
      int jersey;
      for(i=0; i<5; i++) {
       System.out.println("Enter player " + (i+1) + "'s jersey number:");
       jerseyValues[i] = scnr.nextInt();
       System.out.println("Enter player "+(i+1)+"'s rating:");
       ratingValues[i] = scnr.nextInt();
       System.out.println();
      }
      System.out.println("ROSTER");
      for(i=0; i<5; i++){
       System.out.println("Player "+(i+1)+" -- Jersey number: "+jerseyValues[i]+", Rating: "+ratingValues[i]);  
      }
      
      while(true) {
         
       System.out.println("\nMENU"+
                           "\nu - Update player rating"+
                           "\na - Output players above a rating"+
                           "\nr - Replace player"+
                           "\no - Output roster"+
                           "\nq - Quit"+
                           "\n"+
                           "\nChoose an option:");
       chooseOption = scnr.next().charAt(0);
       switch(chooseOption){
        case 'u':
           System.out.println("Enter a jersey number:");
           jersey = scnr.nextInt();
           for(i=0; i<5; i++){
            if(jerseyValues[i] == jersey){
             System.out.println("Enter a new rating for player:");  
             ratingValues[i] = scnr.nextInt();
            }
            }break;
        case 'a':
           System.out.println("Enter a rating:");
           above = scnr.nextInt();
           System.out.println("\nABOVE "+above);
           for(i=0; i<5; i++){
            if(ratingValues[i] > above)
            System.out.println("Player "+(i+1)+" -- Jersey number: "+jerseyValues[i]+", Rating: "+ratingValues[i]);  
            }break;          
        case 'r':
           System.out.println("Enter a jersey number:");
           jersey = scnr.nextInt();
           for(i=0; i<5; i++){
             if(jerseyValues[i] == jersey){
             System.out.println("Enter a new jersey number:");
             jerseyValues[i] = scnr.nextInt();
             System.out.println("Enter a rating for the new player:");  
             ratingValues[i] = scnr.nextInt();
           }}
	   break;
        case 'o':
	    System.out.println("ROSTER");
            for(i=0; i<5; i++){
                System.out.println("Player "+(i+1)+" -- Jersey number: "+jerseyValues[i]+", Rating: "+ratingValues[i]);  
            }
	    break; 
        case 'q':
           return;
       }
      }
   }
}
