/**
 * Created by Huoyunren on 2016/10/27.
 */
class Poppet { }
public class BlankFinal {

    final int i = 0; // Initialized final
    final int j; // Blank final
    final Poppet p; // Blank final handle
    // Blank finals MUST be initialized
    // in the constructor:
    BlankFinal() {
        j = 1; // Initialize blank final
        p = new Poppet();
        System.out.println(j);
        System.out.println(p);
    }
    BlankFinal(int x) {
        j = x; // Initialize blank final
        p = new Poppet();
    }
    public static void main(String[] args) {
        BlankFinal bf = new BlankFinal();
    }

}
