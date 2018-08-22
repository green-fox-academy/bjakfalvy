public class Gnirts implements CharSequence{
    private String something;

    Gnirts (String something){
        this.something = something;
    }

    @Override
    public int length() {
        return something.length();
    }

    @Override
    public char charAt(int index) {
        return something.charAt(something.length()-1-index); //hátulról kezdi
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return something.subSequence(something.length()-end, something.length()-start);
    }

}
