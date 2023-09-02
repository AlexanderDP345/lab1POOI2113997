
package tareasem3;

public class TareaSem3 {

    public static void main(String[] args) {
        if (6<6*5)
            System.out.print("hello");
            System.out.print("There");
            
            //Resultado Hello There//
            
      int x=1, y=2, z=3;
if(x>y)
if(x>z)
System.out.println("1111");
else
System.out.println("2222");      
//Resultado 2222, el codigo no lo imprime porque el 2222 no esta asociado con el primer if, sino el 1111 lo esta, pero como este no es el caso el 2222 no se imprime//


if (x < z)
    System.out.println("*"); 
else if (x == 2) 
    System.out.println("&");
else
    System.out.println("$");

// Resultado (*) //

      if(x<y)
System.out.println("####");
        else
System.out.println("&&&&"); 
System.out.println("****");
       
//RESULTADO:#### y ****//
       
       
if(x>y)
System.out.println("####");
else { 
System.out.println("&&&&"); 
System.out.println("****");
}
     
///RESULTADO:&&&& y ****//

if (++x > y++ || x-->0) 
    z ++;
else
    z --;
System.out.println(x+"+y+"+z);

///RESULTADO: 1+y+4

if(x<y){
System.out.println("####");
System.out.println("****");
}
else
System.out.println("&&&&");


///RESULTADO:####
//           ****

if ('x' > 'y' || 66> (int)('A'))
System.out.println("#*#");


///RESULTADO:(#*#)

if (x < z)
System.out.println("*"); 
else if(x==z) 
System.out.println("&");
else
System.out.println("$");


//RESULTADO:    *
    }
    
}
