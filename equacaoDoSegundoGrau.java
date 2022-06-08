import java.util.Scanner;
import java.lang.Math;

// Rode o código no replit.com: https://replit.com/@RaldineyRibeiro/EquacaoDoSegundoGrau#Main.java

class Main
{
  
  public static void main(String[] args) 
  {

    Scanner entrada = new Scanner(System.in); 
    
    int coeficienteA, coeficienteB, coeficienteC;

    do
    {
    
    System.out.print("\n\n\n\tEQUAÇÃO DO 2º GRAU!");
    
    
    System.out.print("\n\n\n\tInforme o valor de A: ");
    coeficienteA = entrada.nextInt();
    
    System.out.print("\n\tInforme o valor de B: ");
    coeficienteB = entrada.nextInt();
    
    System.out.print("\n\tInforme o valor de C: ");
    coeficienteC = entrada.nextInt();
    

    System.out.println("\n\n\n\tOs respectivos valores informados foram: " +
                       "\n\n\tA = "+ coeficienteA+"  B = "+ + coeficienteB +" e C = "+ coeficienteC+".");
    
    
    analisarCoeficientes(coeficienteA ,coeficienteB ,coeficienteC );
    analisarDiscriminante(coeficienteA ,coeficienteB ,coeficienteC );

    
    }while(true);
     
  }




  
  static void analisarCoeficientes(int coeficienteA, int coeficienteB, int coeficienteC)
  {
    
    if(coeficienteA == 0)
    {
      System.out.println("\n\n\tA equação informada não é de 2° Grau." +
                         "\n\tDevido o valor de A ser ZERO.");
    }
          
    else if(coeficienteB != 0 && coeficienteC != 0)
    {
      System.out.println("\n\n\tA equação: " +
                         coeficienteA + "X² + " + coeficienteB +"X + " + coeficienteC+" = 0" +" é COMPLETA.");
    }
      
    else
    {
      System.out.println("\n\n\tA equação informada é INCOMPLETA." +
                         "\n\tDevido quê: Os valores de B ou C são iguais a ZERO.");
    }

  }

  


  
   static void analisarDiscriminante( int coeficienteA, int coeficienteB, int coeficienteC )
 {
   
   double DELTA;
   
   DELTA = Math.pow(coeficienteB , 2) -4 * coeficienteA * coeficienteC;

   System.out.printf("\n\tO valor do Δ (Delta) é: %.2f", DELTA);
   
   if (DELTA > 0)
   {
     System.out.println("\n\tA equação possui duas soluções reais distintas: ");
     
     calcularEquacao(coeficienteA ,coeficienteB ,coeficienteC , DELTA);
     calcularVertices(coeficienteA, coeficienteB, coeficienteC, DELTA);
   }
     
   else if (DELTA < 0)
   {
    System.out.println("\n\tA equação não possui solução Real.");
   }
     
   else
   {
    System.out.println("\n\tA equação possui apenas uma solução Real: ");
     calcularVertices(coeficienteA, coeficienteB, coeficienteC, DELTA);
   }
     
 }

  


  
  static void calcularVertices (int coeficienteA, int coeficienteB, int coeficienteC, double DELTA)
  {
    double xVertice, yVertice;
    
    
  if (coeficienteA > 0)
  {
    xVertice = - coeficienteB / (2 * coeficienteA); 
    System.out.printf("\n\n\tO X do vertice é: %.1f", xVertice);
  }

  else if (coeficienteA < 0)
  {
    yVertice = (-DELTA) / (4 * coeficienteA);
    System.out.printf("\n\n\tO Y do vertice é: %.1f", yVertice);
  }
    
  }

  


  
  static void calcularEquacao( int coeficienteA, int coeficienteB, int coeficienteC, double DELTA)
  {
    double XI, XII;
  
    if(DELTA > 0)
    {
      XI = ((-coeficienteB) + Math.sqrt(DELTA)) / 2 * coeficienteA;
      XII = ((-coeficienteB) - Math.sqrt(DELTA)) / 2 * coeficienteA;
    
      System.out.printf("\n\tO valor de X' = %.2f\n\tO valor de X\" = %.2f", XI, XII);
    }
    
  }



  
  
}
