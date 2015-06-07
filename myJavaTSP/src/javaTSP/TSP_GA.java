package javaTSP;

/*
 * import java.io.BufferedReader;
 * import java.io.File;
 * import java.io.FileReader;
 * import java.io.IOException;
 * import java.io.Reader;
 * import java.util.ArrayList;
 * import java.util.List;
 */

/*
 * NAME: burma14
 * TYPE: TSP
 * COMMENT: 14-Staedte in Burma (Zaw Win)
 * DIMENSION: 14
 * EDGE_WEIGHT_TYPE: GEO
 * EDGE_WEIGHT_FORMAT: FUNCTION 
 * DISPLAY_DATA_TYPE: COORD_DISPLAY
 * NODE_COORD_SECTION
   1  16.47       96.10
   2  16.47       94.44
   3  20.09       92.54
   4  22.39       93.37
   5  25.23       97.24
   6  22.00       96.05
   7  20.47       97.02
   8  17.20       96.29
   9  16.30       97.38
  10  14.05       98.12
  11  16.53       97.38
  12  21.52       95.59
  13  19.41       97.13
  14  20.09       94.55
  
 * EOF
 * http://elib.zib.de/pub/mp-testdata/tsp/tsplib/tsp/burma14.tsp
 */

public class TSP_GA {

    public static void main(String[] args) {

        // Create and add our cities
        
    	City city = new City(16.47,96.10);    	
        TourManager.addCity(city);
        
        City city2 = new City(16.47,94.44);
        TourManager.addCity(city2);
        
        City city3 = new City(20.09,92.54);
        TourManager.addCity(city3);
        
        City city4 = new City(22.39,93.37);
        TourManager.addCity(city4);
        
        City city5 = new City(25.23,97.24);
        TourManager.addCity(city5);
        
        City city6 = new City(22.00,96.05);
        TourManager.addCity(city6);
       
        City city7 = new City(20.47,97.02);
        TourManager.addCity(city7);
        
        City city8 = new City(17.20,96.29);
        TourManager.addCity(city8);
       
        City city9 = new City(16.30,97.38);
        TourManager.addCity(city9);
        
        City city10 = new City(14.05,98.12);
        TourManager.addCity(city10);
        
        City city11 = new City(16.53,97.38);
        TourManager.addCity(city11);
       
        City city12 = new City(21.52,95.59);
        TourManager.addCity(city12);
       
        City city13 = new City(19.41,97.13);
        TourManager.addCity(city13);
        
        City city14 = new City(20.09,94.55);
        TourManager.addCity(city14);
       

        // Initialize population
        Population pop = new Population(50, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance());

        // Evolve population for 100 generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 100; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // Print final results
        System.out.println("Finished");
        System.out.println("Final distance: " + pop.getFittest().getDistance());
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
    }
}
