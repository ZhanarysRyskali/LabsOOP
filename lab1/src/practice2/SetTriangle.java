package practice2;

public class SetTriangle {
    public int width;
    public SetTriangle(int width){
        this.width = width;
    }
    public String toString(){
        StringBuilder convertstr = new StringBuilder();
        for(int i = 1; i<=width; i++) {
            for(int j = 1; j<=i; j++){
                convertstr.append("[*]");
            }
            convertstr.append("\n");
        }
        return convertstr.toString();
    }
}

