package design_pattern.creational.abstract_dp;

public class Windows implements UIFactory{

    @Override
    public Buttons createButtons() {
        return new WindowsButton();
    }
}
