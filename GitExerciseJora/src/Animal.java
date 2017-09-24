import java.util.Date;

public abstract class Animal {



    /* Added this comment for exercise 13 of the git
        introduction exercises to see what git does with it. */

    /* Second comment added after having used git diff --cached to
        see the difference between staged and unstaged changes
     */

    /** Developer-defined attributes, to load in subclasses **/
    private String name;
    private String diet;
    private int averageAge;
    private String continent;

    /** Variable attributes **/
    private Date lastTimeFed;






    /****************************************************************************************/
    /********************** CONSTRUCTORS                                            *********/
    /****************************************************************************************/

    public Animal(){
        this.loadAndValidateAttributes();
    }




    /****************************************************************************************/
    /********************** INITIALIZATION & VALIDATION                             *********/
    /****************************************************************************************/


    public boolean loadAndValidateAttributes(){
        return loadAttributes() && validateAttributes();
    }

    public abstract boolean loadAttributes();

    public abstract boolean validateAttributes();



    /****************************************************************************************/
    /********************** GETTERS AND SETTERS                                     *********/
    /****************************************************************************************/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(int averageAge) {
        this.averageAge = averageAge;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Date getLastTimeFed(){ return lastTimeFed;}

    public void setLastTimeFed(Date lastTimeFed){ this.lastTimeFed = lastTimeFed;}


    /****************************************************************************************/
    /********************** FUNCTIONALITY                                           *********/
    /****************************************************************************************/

    public abstract void eatFood();





}
