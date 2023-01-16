package com.disha.pentahoetl;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

public class KettleTransformationExample {

    public static void main(String[] args) {
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        try {
            KettleEnvironment.init();
            System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
            TransMeta transMeta = new TransMeta("etc/ktr/transformation.ktr");
            Trans trans = new Trans(transMeta);

            trans.execute(null);
            trans.waitUntilFinished();
            if(trans.getErrors() > 0){
                throw new Exception("ERRRRRRRRRRRRRRRRRRRRRoR");
            }
        } catch (Exception e){
e.printStackTrace();
        }
    }
}
