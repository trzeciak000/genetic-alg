package ga;

public class App {
	
	public static void main(String[] args) {
		
		GeneticAlgorithms geneticAlgorithms = new GeneticAlgorithms();
		
		Population population = new Population(10);
		population.initialize();
		
		int generationCounter = 0;
		
		while( generationCounter != Constants.SIMULATION_LENGTH) {
			
			++generationCounter;
			System.out.println("Generation: " + generationCounter + " - fittest is: " + population.getFittestIndividual().getFitness());
			System.out.println(population.getFittestIndividual().getFitnessResult() + "\n");
			population = geneticAlgorithms.evolvePopulation(population);
		}
		
		System.out.println("Solution found");
		System.out.println(population.getFittestIndividual().getFitnessResult());
	}
	
}
