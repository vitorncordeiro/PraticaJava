package dev.lpa;

public class River extends Line{
    private double extension;
    private double depth;

    public River(String name, String start, String mid, String end, double extension, double depth){
        super(name, start, mid, end);
        this.extension = extension;
        this.depth = depth;
    }

    public double getExtension() {
        return extension;
    }


    public double getDepth() {
        return depth;
    }
    @Override
    public String render(){
        String superR = super.render();
        String thisFields = "\n[Extension: %f], [Depth: %f]".formatted(extension, depth);
        return superR + thisFields;
    }
}
