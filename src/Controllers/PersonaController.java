package Controllers;
import Models.Persona;


public class PersonaController {

    public Persona[] sortByAgeSelection(Persona[] personas){
        int n = personas.length;
        for(int i = 0; i < n; i ++){
            int indice = i;
            for(int j = i+1; j< n; j++){
                if(personas[j].getEdad() < personas[indice].getEdad()){
                    indice = j;       
                } 
            }
            Persona temp = personas [indice];
            personas[indice] = personas[i];
            personas[i] = temp;
        } 
        return personas;
    }  

    public int searchBinaryByAge(Persona[] personas, int edad) {
        int inicio = 0;
        int menor = personas.length - 1;
            
            while (inicio <= menor) {
                int mitad = inicio + (menor-inicio)/2;
                if(personas[mitad].getEdad() == edad){
                    return mitad;
                }
                
                if(personas[mitad].getEdad() < edad) {
                    inicio = mitad + 1;
                } else {
                    menor = mitad -1;
                }
            }
            return -1; 
    }

    public Persona[] sortByNameWithInsertion(Persona[] personas) {
        int tamanio = personas.length;
 
        for(int i = 1; i < tamanio; i++){
            Persona personaAux = personas[i];
            int  j = i - 1;
            while(j >=0 && personas[j].getNombre().compareTo(personaAux.getNombre()) > 0 ){
                personas[j+1] = personas[j]; 
                j--; 
            }
            personas[j+1] = personaAux;
        }
        return personas;
    }
    public int searchBinaryByName(Persona[] personas, String nombre) {
        int inicio = 0;
        int menor = personas.length - 1;
            
            while (inicio <= menor) {
                int mitad = inicio + (menor-inicio)/2;
                if(personas[mitad].getNombre().compareTo(nombre) == 0){
                    return mitad;
                }
                
                if(personas[mitad].getNombre().compareTo(nombre) < 0) {
                    inicio = mitad + 1;
                } else {
                    menor = mitad -1;
                }
            }
            return -1; 
    }
    public void showPeople(Persona[] personas) {
        for(Persona person : personas){
            System.out.println("Nombre: " + person.getNombre() + " Edad: " + person.getEdad());
        }
    }´
    
}
