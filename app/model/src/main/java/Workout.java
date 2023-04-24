public abstract class Workout {
    private int calorieCalc;
    //private String workout_Desc;
    //private int workout_Duration;
    private String workoutName;

    public Workout(int calPerRep, String workoutName){
        this.calorieCalc = calPerRep;
        //this.workout_Desc = workout_Desc;
        //this.workout_Duration = workout_Duration;
        this.workoutName = workoutName;
    }

    public int getCalorieCalc() {
        return calorieCalc;
    }

    public void setCalorieCalc(int calorieCalc) {
        this.calorieCalc = calorieCalc;
    }

    /*public String getWorkout_Desc() {
        return workout_Desc;
    }

    public void setWorkout_Desc(String workout_Desc) {
        this.workout_Desc = workout_Desc;
    }
*/
    /*public int getWorkout_Duration() {
        return workout_Duration;
    }

    public void setWorkout_Duration(int workout_Duration) {
        this.workout_Duration = workout_Duration;
    }
*/
    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }
}
