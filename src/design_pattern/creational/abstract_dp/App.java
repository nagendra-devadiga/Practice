package design_pattern.creational.abstract_dp;

public class App {

    Buttons buttons;

    public App(UIFactory uiFactory) {
        this.buttons = uiFactory.createButtons();
    }

    public void print() {
        buttons.type();
    }
}
