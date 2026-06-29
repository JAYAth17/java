import java.util.Scanner;
class sample1{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int n = 20;
System.out.println("\n welcome to movies 17");
System.out.println("\n Film(s) in Movies 17");
System.out.println("\n 1.SpiderMan");
System.out.println("\n 2.Ironman");
System.out.println("\n 3. Batman");
for( int i = 1; i<n; i++){
System.out.print("\n Pls select the above movies to Watch Dude(1-3):");
int m = s.nextInt();

System.out.println();

switch(m) {
case 1:
System.out.println("You selected : Spiderman");
System.out.println("Date : 29/03/2027");
System.out.println("Time : 12:00 Noon");
break;

case 2:
System.out.println("You selected : Iron man");
System.out.println("Date : 30/03/2027");
System.out.println("Time : 12:00 Noon");
break;

case 3:
System.out.println("You selected : Batman");
System.out.println("Date : 31/03/2027");
System.out.println("Time : 12:00 Noon");
break;

default:
System.out.println("Invalid Movie Selection");
return;
}

System.out.print("\n HOW MANY SEATS U NEED :");
int g = s.nextInt();
    if(g<=n){
        n=n-g;
        System.out.println(g+" "+" BOOKED BRUHH ");
        System.out.println(n+" "+"Tickerts are avaliable");
    }
    else{
        System.out.print("\n Only"+ n+ " Ticket are avaliable");
    }
    if(n==0){
        System.out.println("\n HouseFull ");
    }
    System.out.print("\n Wanna Buy Tickets Again (yes/no) :");
    String k = s.next();
    if(k.equalsIgnoreCase("no")){
        System.out.println(" Thank you ");
        break;
    }
}
}
}



