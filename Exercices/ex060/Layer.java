package dev.lpa;

import java.util.List;

public class Layer<T extends Mappable>{
    private List<T> list;

    public Layer(List<T> list){
        this.list = list;
    }
    public void renderLayer(){
        for(var mappable : list){
            System.out.println(mappable.render());
        }
    }
}
