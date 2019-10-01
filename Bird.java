public class Bird {
    private Vector pos;//the current position of the Bird
    private Vector vel;//the current velocity of the Bird
    private Vector acc;//the current acceleration of the Bird
    private Vector[] accelerations;//the motions added to the Bird at each frame update - acts as genes
    private double fitness;

    /**
     * This constructor is meant mostly for creating your initial population
     *
     * @param startingX - the starting x-coordinate of the bird
     * @param startingY - the starting y-coordinate of the bird
     * @param runLength - the number of frames that the Bird will last
     */

    public Bird(double startingX, double startingY, int runLength){
        pos = new Vector(startingX, startingY);
        vel = new Vector();
        acc = new Vector();
        accelerations = new Vector[runLength];
        fitness = 0;
        //make all starting Birds have random genes (accelerations)
    }

    /**
     * This constructor is meant more for breeding
     *
     * @param startingX - the starting x-coordinate of the bird
     * @param startingY - the starting y-coordinate of the bird
     * @param accelerations - the pre-determined accelerations/genes that this Bird will have
     */

    public Bird(double startingX, double startingY, Vector[] accelerations){
        pos = new Vector(startingX, startingY);
        vel = new Vector();
        acc = new Vector();
        this.accelerations = accelerations;
    }

    //==================================================================================================================

    //region Gets and Sets
    public Vector getPos() {
        return pos;
    }

    public void setPos(Vector pos) {
        this.pos = pos;
    }

    public Vector getVel() {
        return vel;
    }

    public void setVel(Vector vel) {
        this.vel = vel;
    }

    public Vector getAcc() {
        return acc;
    }

    public void setAcc(Vector acc) {
        this.acc = acc;
    }

    public Vector[] getAccelerations() {
        return accelerations;
    }

    public void setAccelerations(Vector[] accelerations) {
        this.accelerations = accelerations;
    }

    public double getFitness() {
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    //endregion

    //==================================================================================================================

    //draws the Bird - probably just a small circle
    public void draw(){

    }

    /**
     * @param x - the x-coordinate of some point
     * @param y - the y-coordinate of some point
     * @return  - the distance between the Bird and the point
     */

    public double distance(int x, int y){
        return Math.sqrt( Math.pow(pos.getX() - x, 2) + Math.pow(pos.getY() - y, 2) );
    }

    /**
     * This method will be used to create offspring given this Bird and some other mate
     *
     * @param mate - the other Bird that acts as a second parent
     * @return the offspring of the two parent Birds
     */
    public Bird mateWith(Bird mate){
        //randomly select genes from either parent

        //a small chance of mutation (I typically do 1/100, but you can do anything)

        //return the new Bird

        return null;
    }
}
