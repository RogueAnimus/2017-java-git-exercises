public class Dog extends Animal {



    /* Added one comment to see if IntelliJ shows me a difference */


    public String petOwnerID;






    /**
     * Constructor
     */
    public Dog(){
        super();
    }

    /***************************************************/
    /***     LOADING AND VALIDATING                  ***/
    /***************************************************/

    /**
     * Dumb loading method
     * @return
     */
    @Override
    public boolean loadAttributes() {
        setName("Dog");
        setDiet("Pedigree");
        setAverageAge(10);
        setContinent("Any");
        return true;
    }

    /**
     * Dumb validation method
     * @return
     */
    @Override
    public boolean validateAttributes() {
        boolean output=false;
        if (!getName().equals("") && !getDiet().equals("") && getAverageAge() != 0 && !getContinent().equals("")){
            output=true;
        }
        return output;
    }


    /***************************************************/
    /***     GETTERS AND SETTERS                     ***/
    /***************************************************/

    public String getPetOwnerID() {
        return petOwnerID;
    }

    public void setPetOwnerID(String petOwnerID) {
        this.petOwnerID = petOwnerID;
    }


    /***************************************************/
    /***     FUNCTIONALITY                           ***/
    /***************************************************/


    /**
     * Dumb functionality
     */
    @Override
    public void eatFood() {
        // Go to food given by owner
        // Eat
    }
}
