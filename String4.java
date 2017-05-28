//program which takes input the date(date month year) seprated by comma/space or both comma and space and print in format YYYY-MM-DD 
import java.util.*;
public class String4{

    public static void main(String []args){
           String s,date,month,year;
           int i,mnth=0,l;
           String []m={"january","february","march","april",
                            "may","june","july","august",
                                "september","october","november","december"};//array containing name of month
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the date(date month year)");
           s=sc.nextLine();//takes date as input 
           
           s=s.replace(", ", " ");//replace comma (followed by space) with space in the string 
           s=s.replace(" ,", " ");//replace space(folled by comma) with space
           s=s.replace(",", " ");//replace comma with space 
           l=s.length();//count the length of string
           date=s.substring(0,2);//extracting date from string
           year=s.substring(l-4,l);//extracting year from string
           month=s.substring(3,l-5);//extracting month from string
          
               for(i=0;i<12;i++){
                      if(month.equalsIgnoreCase(m[i])){//checks name of months to given input data
                            mnth=i+1;
                            break;
                  
                      }
               }
           
                   if(mnth<=9)
                        System.out.println("date  is::"+year+"-0"+mnth+"-"+date);//print date in expected format 
           
                       else
                           System.out.println("date  is::"+year+"-"+mnth+"-"+date);//print date in expected format
     }
}
