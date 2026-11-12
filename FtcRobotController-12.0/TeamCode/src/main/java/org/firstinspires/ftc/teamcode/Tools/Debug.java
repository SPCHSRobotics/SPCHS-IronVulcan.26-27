package org.firstinspires.ftc.teamcode.Tools;

import java.util.ArrayList;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Debug {
    private Telemetry tel;
    private ArrayList<String> tagList = new ArrayList<String>();

    private boolean Is_In_tagList(String tag){
        for (int i = 0; i != (tagList.size()); i++) {
            if (tagList.get(i) == tag) {
                return false;
            }
        }
        return true;
    }

    private void Append_tagList(String tag) {
        boolean unique = Is_In_tagList(tag);
        if (unique) {
            tagList.add(tag);
        } else {
            //Do nothing
        }
    }
    private boolean Is_Enabled(String tag){
        final String[] enabledTags = {
                "wheels"
        };
        for (int i = 0; i != (enabledTags.length); i++){
            if (enabledTags[i] == tag){
                return true;
            }
        }
        return false;
    }

    public void Tag_Print(String tag, String message){
        Append_tagList(tag);
        if (Is_Enabled(tag)){
            tel.addLine(message);
        }
    }
    public <T> void Tag_Print(String tag, String name, T variable){
        Append_tagList(tag);
        if (Is_Enabled(tag)){
            tel.addData(name, variable);
        }
    }
}
