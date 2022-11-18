
public class Test {
    
public static void main(String[] args){
    
ADTPila <Integer>  pila = new ADTPila();    
    
pila.Vacia();
System.out.println("\n");
    
pila.push(1);
pila.push(2);
pila.push(3);
pila.push(4);
pila.push(5);
pila.push(6);
pila.transversal();

System.out.println("\n");
pila.peek();

System.out.println("\n");
pila.pop();
pila.pop();

System.out.println("\n");
pila.peek();

System.out.println("\n");
pila.transversal();

System.out.println("\n");
pila.push(10);
pila.transversal();


}        
    
}
