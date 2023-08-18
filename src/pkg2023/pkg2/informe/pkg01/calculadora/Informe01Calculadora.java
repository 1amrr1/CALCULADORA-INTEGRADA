
package pkg2023.pkg2.informe.pkg01.calculadora;

import java.util.Scanner;


public class Informe01Calculadora {
    
    public static void main(String[] args) {
     
    Scanner leer= new Scanner(System.in); 
            
    double num1,num2; 
    int opc=0,opc1=0,opc2=0; 
    double res=0, res1= 0, res2=0;
  
    do{
        System.out.println("       Calculadora     ");
        System.out.println("1. Operaciones matematicas. ");
        System.out.println("2. Funciones trigonometricas. ");
        System.out.println("3. % IVA . ");
        System.out.println("4. Salir. \n");
        opc= leer.nextInt(); 
        System.out.println("\n");
        
         switch(opc) {
          
            case 1: 
                do{
                    System.out.println("\n Seleccione una opcion");
                    System.out.println("1. Suma.");
                    System.out.println("2. Resta.");
                    System.out.println("3. Multiplicacion");
                    System.out.println("4. Division");
                    System.out.println("5. Potencia.");
                    System.out.println("6. Raiz.");
                    System.out.println("7. Salir. \n");

                    opc1= leer.nextInt(); 

                    switch(opc1){

                        case 1: 

                            System.out.println("Ingrese el numero 1");
                            num1= leer.nextDouble();
                            System.out.println("Ingrese el numero 2");
                            num2= leer.nextDouble();
                            res= num1 + num2; 
                            System.out.println("La Suma es igual a: "+ res + "\n");

                        break; 

        
                        case 2: 

                            System.out.println("Ingrese el numero 1");
                            num1= leer.nextDouble();
                            System.out.println("Ingrese el numero 2");
                            num2= leer.nextDouble();
                            res= num1 - num2; 
                            System.out.println("La Resta es igual a: "+ res + "\n");

                        break; 

                        case 3: 

                            System.out.println("Ingrese el numero 1");
                            num1= leer.nextDouble();
                            System.out.println("Ingrese el numero 2");
                            num2= leer.nextDouble();
                            res= num1 * num2; 
                            System.out.println("La producto es igual a: "+ res + "\n");

                        break; 

                        case 4: 

                            System.out.println("Ingrese el numero 1");
                            num1= leer.nextDouble();
                            System.out.println("Ingrese el numero 2");
                            num2= leer.nextDouble();
                            if(num2==0){
                                System.out.println("Error matematico. \n"); 
                            }
                            else{
                                res= num1 / num2; 
                            System.out.println("La division es igual a: "+ res + "\n");
                            }

                        break;    

                        case 5: 

                            System.out.println("Ingrese el numero base");
                            num1= leer.nextDouble();
                            System.out.println("Ingrese el numero potencia");
                            num2= leer.nextDouble();
                            res= Math.pow(num1, num2);  
                            System.out.println("El resultado es: "+ res + "\n");

                        break; 

                        case 6: 
                 
                            System.out.println("Ingrese el numero");
                            num1= leer.nextDouble();
                            if(num1<0){
                                System.out.println("Error matematico");
                            }
                            else {
                                 System.out.println("Ingrese el valor de la raiz");
                                 num2= leer.nextDouble();
                                 res= Math.pow(num1, 1/num2);
                                 System.out.println("El resultado es: "+ res + "\n");
                            }
                        break;         
                    }
                }while(opc1 != 7); 
                
            break; 
            
            case 2:
                
                do{
                    System.out.println("\n Seleccione una opcion");
                    System.out.println("1. Sen().");
                    System.out.println("2. Cos().");
                    System.out.println("3. Tan()");
                    System.out.println("4. Salir. \n");
                    
                    opc2= leer.nextInt();
                    
                    switch(opc2){
                        
                        case 1: 
                            System.out.println("Ingrese el angulo");
                            num1= leer.nextDouble();
                            res= Math.sin(Math.toRadians(num1));
                            System.out.println("El sen " + num1 + "es: " + res + "\n");
                        break;
                        
                        case 2:
                            System.out.println("Ingrese el angulo");
                            num1= leer.nextDouble();
                            res= Math.cos(Math.toRadians(num1));
                            System.out.println("El sen " + num1 + " es: " + res + "\n");
                            break;
                            
                        case 3:
                            System.out.println("Ingrese el angulo");
                            num1= leer.nextInt();
                            if(num1==90 || num1==270 || num1==-90 || num1==-270){
                                System.out.println("Error matematico. \n");
                            }
                            else{
                                res= Math.tan(Math.toRadians(num1));
                                System.out.println("El sen " + num1 + "es: " + res + "\n");
                            }
                        break; 
                        
                        case 4: 
                        break; 
     
                    }
                    
                }while(opc2 != 4); 
            break; 
            
            case 3: 
                 System.out.println("Ingrese un valor");
                 num1= leer.nextDouble();
                 System.out.println("Ingrese el porcentaje % que quiere calcular");
                 num2= leer.nextDouble();
                 res1= num1 * num2/100; 
                 res2= num1 + res1;
                 System.out.println("El % IVA de " + num1 + " es: " + res1+ " $"  );
                 System.out.println("Valor total: " + res2 + " $ \n");
            break; 
            
            case 4:
            break; 
            
            }
        
         } while(opc != 4); 
   
           
    }
  
}

