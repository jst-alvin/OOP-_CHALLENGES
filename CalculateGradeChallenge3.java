public class CalculateGradeChallenge {
    private int Mathematics=90;
    private int English=88;
    private int Kiswahili=74;
    private int Biology=57;
    private int Physics=88;
    private int Chemistry=80;
    private int History=90;

    public String calculate_grade(int marks){
            if(marks >= 81){
                return "A";
            }
            else if(marks >= 74){
                return "A-";
            }
            else if(marks >= 67){
                return "B+";
            }
            else if(marks >= 62){
                return "B";
            }
            else if(marks >= 55){
                return "B-";
            }
            else if(marks >= 48){
                return "C+";
            }
            else if(marks >= 44){
                return "C-";
            }
            else if(marks >= 39){
                return "D+";

            } else if (marks >= 35) {
                return "D";

            }
            else if (marks >= 30){
                return "D-";
            }
            else{
                return "E";
            }

    }
    public int calculate_mean(){
        return (Mathematics+English+Kiswahili+Biology+Chemistry+Physics+History)/7;
    }

    public void display_results(){
        int mean = calculate_mean();
        String grade = calculate_grade(mean);
        System.out.println("The student got: " + mean + " which was a grade: "+grade);
    }

    public static void main(String[] args){

        CalculateGradeChallenge student = new CalculateGradeChallenge();
        student.display_results();
    }

    
    
}
