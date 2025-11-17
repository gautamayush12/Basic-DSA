package JavaConceptsPrac;

public class minStepsToReachEnd{

    //Brute-Force
    public static int minSteps(int start, int end){
        int steps = 0;
        int curr = start;
        while(curr<end){
            if(curr*2 <= end){
                curr*=2;
            }else{
                curr+=1;
            }
            steps++;
        }
        return steps;
    }

    //Greedy Reverse Approach
    public static int optimalGreedy(int start, int end){
        int steps = 0;
        int curr = end;
        while(curr>start){
            if(curr%2==0){
                curr=curr/2;
            }else{
                curr-=1;
            }
            steps++;
        }
        return steps + (start-curr);
    }


    //Recursion
    public static int minStepsRecursive(int start, int end){
        if(start == end){
            return 0;
        }
        if(start>end){
            return (start-end);
        }
        int option1 = minStepsRecursive(start+1, end);
        int option2 = minStepsRecursive(start*2, end);
        return 1 + Math.min(option1, option2);
    }
    public static void main(String[] args) {
        int a = optimalGreedy(1, 8);
        System.out.println(a);
    }
}