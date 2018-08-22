public class Shifter implements CharSequence{
    private String sequence;
    private int shift;

Shifter(String sequence, int shift){
    this.sequence=sequence;
    this.shift=shift;
}
    @Override
    public int length() {
        return sequence.length();
    }

    @Override
    public char charAt(int index) {
        return sequence.charAt(index + shift);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return sequence.substring(start + shift, end + shift);
    }
}
