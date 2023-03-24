package Builder.Builder;

import Builder.CDType;
import Builder.Samsung;
import Builder.Sony;

public class CDBuilder {

    public CDType builderSony(){
        CDType cds=new CDType();
        cds.addItem(new Sony());
        return cds;
    }
    public CDType builderSamsung(){
        CDType cds=new CDType();
        cds.addItem(new Samsung());
        return cds;
    }
}
