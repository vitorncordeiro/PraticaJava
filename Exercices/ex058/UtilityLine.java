package dev.lpa;

public class UtilityLine implements Mappable{
    private String label;
    private String iconType;
    private String utility;

    public UtilityLine(String label, String iconType, String utility){
        this.label = label;
        this.iconType = iconType;
        this.utility = utility;
    }
    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getType() {
        return "Line";
    }

    @Override
    public String getIconType() {
        return iconType;
    }
    @Override
    public String toJSON(){
        return """
                "label": "%s", "type": "%s", "marker": "%s", "utility": "%s" """
                .formatted(label, getType(), iconType, utility);
    }
}
