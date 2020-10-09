import java.util.Scanner;
public class grade {
    public static void main(String args[]) {
        System.out.println("Enter Marks: ");
        ABC S = new ABC();
        S.display();
    }
}
class ABC {
    Scanner A = new Scanner(System.in);
    int marks = A.nextInt();
    public void display() {
        if (marks < 50) {
            System.out.println("Fail");             /* fail (&lt;50) */
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D Grade");          /* D grade -marks&gt;=50 &amp;&amp; marks&lt;60 */
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C Grade");          /* C grade- marks&gt;=60 &amp;&amp; marks&lt;70 */
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B Grade");          /* B grade- marks&gt;=70 &amp;&amp; marks&lt;80 */
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A Grade");          /* A grade- marks&gt;=80 &amp;&amp; marks&lt;90 */
        } else {
            System.out.println("A+ Grade");         /* A+ grade- marks&gt;=90 &amp;&amp; marks&lt;100 */
        }
    }
}
