import java.util.ArrayList;
import java.util.List;

public class Population {
    private List<Bird> population;//a list that stores all Birds
    private int generation;//the number of iterations that the entire population has endured

    /**
     * @param populationSize - the starting Population size
     * @param startingX - the x coordinate of where the Birds will start
     * @param startingY - the y coordinate of where the Birds will start
     * @param runLength - the number of frames that the Birds will run for
     */
    public Population(int populationSize, double startingX, double startingY, int runLength){
        population = new ArrayList<>();
        for(int i = 0 ; i < populationSize ; i++){
            population.add(new Bird(startingX, startingY,runLength));
        }
    }

    //==================================================================================================================

    /**
     * Calculates the fitness for all the Birds in population
     * Run some test for the Birds to get close to a set goal
     * The fitness needs to be related to the distance to the goal in some way
     */
    public void calculateFitness(){

    }

    /**
     * Kill of the worst 50% of the population (determined by the fitness score)
     *
     * P.S. - It isn't a good idea to kill off only the worst 50% - the whole reason genetic algorithms work
     * is because of random chance through mutations and new gene combinations - it is better for the lower 50%
     * to have a higher chance of dying off and the upper 50% having a higher chance of surviving, but anyone can die
     * This promotes a more genetically diverse population because sometimes the sucky genes work really well when
     * combined with other stuff
     */
    public void theReaping(){

    }

    /**
     * The surviving (and therefore genetically superior) Birds are tired from all the testing and need a break
     * This method will help them take a break by creating some children
     * Loop through the surviving population such that surviving Birds mate only with other surviving Birds (NOT NEW ONES)
      */
    public void sexPit(){

    }

    /**
     * Draws all the birds
     */
    public void draw(){

    }
}
