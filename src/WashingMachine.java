public class WashingMachine {
    private boolean isPowerOn;
    private String currentCycle;
    private boolean isRunning;

    public void powerOn(){
        isPowerOn = true;
    }
    public void powerOff(){
        isPowerOn = false;
    }
    public void selectCycle(String cycle){
        this.currentCycle = cycle;
    }
    public void start(){
        if (isRunning == true){
            System.out.println("it's already running");
        }
        else if (currentCycle == null) {
            System.out.println("selectCycle first!");
        }
        else {
            isRunning = true;
        }
    }
    public void stop(){
        isRunning = false;
    }

    public String getCurrentCycle() {
        return currentCycle;
    }
}
