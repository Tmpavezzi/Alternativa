import java.util.Scanner;


public class Atividade2 {
   
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
   
    System.out.println("Quai são a duas adminitraçaõ estuda em sala ?");
    System.out.println("A) adminitração classica,adminitração contabil");
    System.out.println("B) adminitração cientifica,adminitração contabil");
    System.out.println("C) adminitração classica , adminitração cientifica");
    System.out.println("D) adminitração empresarial, adminitração classica");
    System.out.println("E) adminitração contabil, adminitração empensarial");
    char responda = entrada .next().charAt(0);
    
    switch(responda){
        case 'A':
            System.out.print("errado");
            break;
            case'B':
                System.out.print("errado");
                break;
            case 'C' :
                System.out.print("certo");
                break;
            case 'D' :
                 System.out.print("errado");
                break;
                case'E':
                    System.out.print("errado");
                break;
                default :
                System.out.print("Alterntaiva Invalida");
                break;
                    
                
                
                
    }
        
        
    }
    
    
    
    
    
    
    
}
