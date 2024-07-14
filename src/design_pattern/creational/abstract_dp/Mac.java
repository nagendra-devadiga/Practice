package design_pattern.creational.abstract_dp;

public class Mac implements UIFactory {

    @Override
    public Buttons createButtons() {
        return new MacButton();
    }
}
