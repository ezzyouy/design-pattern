package Builder;

import Builder.Builder.CDBuilder;

public class Test {
    public static void main(String[] args) {
        CDBuilder cdBuilder=new CDBuilder();
        CDType cdType1=cdBuilder.builderSony();
        cdType1.showItems();

        CDType cdType2=cdBuilder.builderSamsung();
        cdType2.showItems();
    }
}
