
public class WektoryRoznejDlugosciException extends Exception {
    private int vectorSize1;
    private int vectorSize2;
    public WektoryRoznejDlugosciException(int vectorSize1, int vectorSize2, String txt) {
        super(txt);
        this.vectorSize1 = vectorSize1;
        this.vectorSize2 = vectorSize2;
    }

    public int getVectorSize1() {
        return vectorSize1;
    }

    public int getVectorSize2() {
        return vectorSize2;
    }
}
