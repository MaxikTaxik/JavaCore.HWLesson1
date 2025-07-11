package MVP;

class Calculator {

    private int a;
    private int b;
    private int result;

    public int getResult() {
        return result;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setResult(int result) {
        this.result = result;
    }

    void addition(){
        this.result = a + b;
    }

    void subtraction() {
        this.result = a - b;
    }

    void multiplication(){
        this.result = a * b;
    }

    void division(){
        this.result = a / b;
    }

    void execute (int operation){
        switch (operation)    {
            case 1:
                this.addition();
            case 2:
                this.subtraction();
            case 3:
                this.multiplication();
            case 4:
                this.division();
        }
    }


}
