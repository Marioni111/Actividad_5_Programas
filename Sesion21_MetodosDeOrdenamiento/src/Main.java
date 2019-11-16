class MetodosOrdenamiento{
	
	public int busquedaBinaria(int numeros[], int elemento) {
		
		int centro, primero, valorCentro, ultimo;
		primero = 0;
		ultimo = numeros.length-1;
		
		while(primero <= ultimo) {
			centro = (primero + ultimo)/2;
			valorCentro = numeros[centro];
			System.out.println("Comparando " + elemento + " con" + numeros [centro]);
			
			if(elemento == valorCentro) {
				return valorCentro;
			}else if(elemento < valorCentro) {
				ultimo = centro - 1;
			}else {
				primero = centro +1;
			}
		}
		return -1;
	}
	
	public static void OrdenamientoBurbuja(int numeros[]){
		
		int vector[];
		
		for(int i = 0; i <= numeros.length; i++) {
			vector[i] = numeros[i];
		}
		
		int comparar = 0;
        int auxiliar, comparaciones = 0;
        int recorridos=0, intecambios = 0;
        
        mostrarVector(vector, "Vector Original");
        //Ejecución de tiempo
        
        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
               
            	if (vector[i] > vector[j]) {
                    
            		auxiliar = vector[i];
                    vector[i] = vector[j];
                    vector[j] = auxiliar;
                    intecambios++;
                }
            	
                comparaciones++;
            }
        }
        mostrarVector(vector, "Ordenado");
        System.out.println("Recorridos: " + recorridos);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios:  " + intecambios);
        comparaciones = 0;
	}
	
	public void ordenamientoShellSort(int A[]) {
		int salto, aux, i;
		boolean cambios;
		
		for (salto = A.length / 2; salto != 0; salto /= 2){
			cambios = true;
			while(cambios) { // Mientras se intercambia algun elemento
				cambios = false;
				for (i = salto; i < A.length; i++) { //Se da una pasada
					if(A[i - salto] > A[i]) { //Y si estan desordenados
						aux = A[i]; //se reordena
						A[i] = A[i - salto];
						A[i - salto] = aux;
						cambios = true; //Y se marca como cambio
					}//if
					
				}//for3
			}//for2
		}//for1
	}//metodo
	
	public void mostrarArreglo(int A[]) {
		for(int i = 0; i <A.length; i++) {
			System.out.println(A[i] + ", ");
		}
		System.out.println("n");
	}
	
	public static void insecionDirecta(int A[]) {
		
		int p, j;
		int aux;
		
		for (p = 1; p < A.length; p++) {
			
			aux = A[p];
			j = p -1;
			
			while((j >= 1) && (aux < A[j])) {
				
				A[j+1] = A[j];
				j--;
			}
			
			A[j + 1] = aux;
		}
	}
	
	public void mostrarVector(int vector[], String vectorOrdenado) {
        
		System.out.println("Vector " + vectorOrdenado);
        
		for (int i = 0; i < vector.length; i++) {
            
			System.out.print("[" + vector[i] + "] ");
        }
		
        System.out.println();
    }
}
public class Main {

	public static void main(String[] args) {

		int numeros[] = {34, 25, 12, 87, 9, 10, 34, 37, 24, 2};
		
		System.out.println("----------METODO DE BURBUJA----------");
		
		MetodosOrdenamiento.OrdenamientoBurbuja(numeros);
		
		//recorridos o pasadas
		//comparaciones
		//intercambios
		//tiempo de ejecucion
	}
}