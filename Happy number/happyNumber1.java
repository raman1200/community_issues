import java.util.HashSet;

public class happyNumber1 {
    public static void main(String[] args) {
        boolean res = isHappyNumber(19);
        System.out.println(res);
    }
    static int numSquareSum(int n)
{
    int squareSum = 0;
    while (n!= 0)
    {
        squareSum += (n % 10) * (n % 10);
        n /= 10;
    }
    return squareSum;
}
     // method return true if n is Happy Number

static boolean isHappyNumber(int n) {
    HashSet<Integer> st = new HashSet<>();
    while (true) {
       n = numSquareSum(n);
        if (n == 1)
            return true;
        if (st.contains(n))
            return false;
        st.add(n);
    }
}
}