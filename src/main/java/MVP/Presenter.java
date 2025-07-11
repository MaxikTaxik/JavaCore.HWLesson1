package MVP;

public class Presenter {
        private Calculator calculator = new Calculator();
        private Console console = new Console();
        public void run(){
                console.outMenuText("меню");
                console.outMenuText("просьба");
                console.setInput();
                calculator.setA(Integer.parseInt(console.getInput()));
                console.outMenuText("ввёл");
                console.outMenuText("просьба");
                console.setInput();
                calculator.setB(Integer.parseInt(console.getInput()));
                console.outMenuText("ввёл");
                console.outMenuText("действие");
                console.setInput();
                console.outMenuText("ввёл");
                calculator.execute(Integer.parseInt(console.getInput()));
                System.out.println(calculator.getResult());
        }
}
