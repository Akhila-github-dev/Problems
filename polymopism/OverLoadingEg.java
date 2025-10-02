package polymopism;

public class OverLoadingEg {
	 public void searchCar(String manufacturer) {
         // finds cars from the desired manufacturer 
    }    
    public void searchCar(float topSpeed) { 
        // finds cars having the desired top speed  
    }
    public void searchCar(float topSpeed, String color) {
        // finds cars having the desired top speed and color   
    }
    
    public static void main(String[] args) {
    	OverLoadingEg showroom = new OverLoadingEg();
        
        showroom.searchCar("Nissan");                       
        showroom.searchCar(180.0f, "Blue");                  
        
        // Rest of the code
    }

}
