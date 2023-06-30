package ordenacaoselectionsort;

public class OrdenacaoSelectionSort {

    public static void main(String[] args) {
        new OrdenacaoSelectionSort();
    }
    
    public OrdenacaoSelectionSort() {
        double vetnulo[] = null;
        
        if (!selectionSort_v01(vetnulo) ) {
           System.out.println("O vetor nulo 'vetnulo' não pode ser ordenado em selectionSort_v01."); 
        }
        
        try {
          selectionSort_v02(vetnulo);
        }
        catch(Exception ex ){
          System.out.println("O vetor nulo 'vetnulo' não pode ser ordenado em selectionSort_v02.\n");  
        }
        
        //declaramos um vetor:
        double vet[] = {4.5, 6.3, 1.2, 78.3, 0.15, 4.3};
        
        System.out.println("Vetor desordenado:");
        visualizar(vet);
        
        selectionSort_v03(vet); 
        
        //ou chamar a selectionSort_v02:
        /*
        try {
          selectionSort_v02(vet);
        }
        catch(Exception ex ){
          System.out.println("vet não pode ser ordenado em selectionSort_v02...\n");  
        }
        */
        
        System.out.println("Vetor ordenado:");
        visualizar(vet);
    }
    
    public boolean selectionSort_v01(double vetor []) {
        if (vetor == null) return false;   
        for (int i = 0; i < vetor.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < vetor.length; j++) {
                if ( vetor[j] < vetor[min] ) min = j;
            }
            double temp = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = temp;
        }
        return true;
    }
    
    public void selectionSort_v02(double vetor []) throws Exception {
        if (vetor == null) throw new Exception();     
        for (int i = 0; i < vetor.length - 1; i++) {
            //determina a posição min do menor valor encontrado  
            //entre as posições i+1 e vetor.length
            int min = i;
            for (int j = i+1 ; j < vetor.length; j++) {
                if ( vetor[j] < vetor[min] ) min = j;
            }
            //troca os valores do vetor:
            double temp = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = temp;
        }
    }
    
    public boolean selectionSort_v03(double vetor []) {
        if (vetor == null) return false;   
        for (int i = 0; i < vetor.length - 1; i++) {
            int min = i; 
            double menor = vetor[i];
            for (int j = i+1; j < vetor.length; j++) {
                if ( vetor[j] < menor ) {
                    min = j;
                    menor = vetor[j];
                }
            }
            //troca os valores vetor[i] com vetor[min]:
            double temp = vetor[i];
            vetor[i] = menor;
            vetor[min] = temp;
        }
        return true;
    }

    public void visualizar(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }
    
}
