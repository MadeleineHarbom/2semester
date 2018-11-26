package opgave4;

public class Calculator {
    public int result;

    public void add(int n){
        result = result + n;
    }

    public void subtract(int n){
        result = result -n;
    }

    public void multiply(int n){
        result = result*n;
    }

    public void divide(int n){
        result = result/n;
    }

    public void square(int n){
        result = n*n;
    }
    public void squareRoot(int n){
        result = (int)Math.sqrt(n); //GOER MIG PAEN
    }
    public void clear(){
        result = 0;
    }
    public void turnOn(){
        result = 0;
    }

    public void switchOff(){
        result = -1;
    }
    public int getResult(){
        return result;
    }
}
