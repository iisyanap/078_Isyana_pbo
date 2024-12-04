package behavioral_command;

public class RemoteControl {
    private Command onCommand;
    private Command offCommand;

    public void setOnCommand(Command command) {
        this.onCommand = command;
    }

    public void setOffCommand(Command command) {
        this.offCommand = command;
    }

    public void pressOnButton() {
        onCommand.execute();
    }

    public void pressOffButton() {
        offCommand.execute();
    }
}
