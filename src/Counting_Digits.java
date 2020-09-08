import java.util.ArrayList;

public class Counting_Digits {
    private int digit_count;
    private int limit = 9999999;
    private int sd = 0;
    ArrayList<String> d = new ArrayList<String>();
    ArrayList<Integer> solutions = new ArrayList<Integer>();
    public Counting_Digits(){
        for (int i=1; i<=9; i++){
            d.add(Integer.toString(i));
        }
    }

    public int counting(String number, String digit){
        for(int i=0; i<number.length(); i++){
            if (number.charAt(i) == digit.charAt(0)){
                this.digit_count++;
            }
        }
        return this.digit_count;
    }

    public void main(){
        for (String j: d){
            this.solutions.clear();
            this.digit_count = 0;
            for (int i=0; i<limit; i++){
                int digit_count_result = counting(Integer.toString(i), j);
                if (digit_count_result == i){
                    solutions.add(i);
                }
            }
            for (int z: solutions){
                this.sd = z + this.sd;
            }
        }
        System.out.println(this.sd);
    }
}
