package application;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Qual o tamanho de seu arranjo de genes: ");
	    int N= sc.nextInt();
	    sc.nextLine();
	    
	    String[] cadeia = new String[N];
	    
	    System.out.println("Digite o gene (por linha):");
	    for(int i = 0; i < N; i++) {
	    	cadeia[i] = sc.nextLine();
	    }
	    
	    System.out.println("Digite o gene para ser analisado: ");
	    String vgenetico = sc.nextLine();
	    
	    int contador = 0;
	    for (int i = 0; i < N; i++) {
            if (cadeia[i].equals(vgenetico)) {
                contador++ ;
            }
        }
	    
	    if(contador >= 0) {
	    	System.out.println("Achei o danado :)");
	    }
	    else if(contador == 1) {
	    	System.out.println("Ainda não é suficiente :(");
	    }
	    else{
	    	System.out.println("Sumiuu!!");
	    }
	    
	    sc.close();    
		
		

	}

}
