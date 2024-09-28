public class Data {
    private double sum;
    private double largest;
    private int count;
    public Data(){
        sum = 0;
        largest = Double.NEGATIVE_INFINITY;
        count = 0;
    }

    public void add_value(double value){
        sum += value;
        if(value>largest){
            largest = value;
        }
        count ++;
    }
    public double get_Average(){
        if(count == 0){
            return 0;
        }
        return sum / count;
    }
    public double getLargest(){
        if(count == 0){
            return 0;
        }
        return largest;
    }
}