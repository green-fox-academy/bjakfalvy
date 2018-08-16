public class Counter {
    int num;
    int defValue;

    public Counter(){
        this.num = 0;
        this.defValue = 0;
    }
    public Counter(int number){
        this.num = number;
        this.defValue = number;
    }

    public void add(int i){
        this.num = i;
    }
    public void add(){
        this.num ++;
    }
    public int get(){
        return this.num;
    }
    public void reset(){
        this.num = this.defValue;
    }

}
