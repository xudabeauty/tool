package com.xu.model;

public class TreeState {
    public static TreeState OPENED=new TreeState(false,true,false);
    public static TreeState CLOSED=new TreeState(false,false,false);
    
    private boolean selected=false;
    private boolean opended=false;
    private boolean disabled=false;
    
    public TreeState(){
        
    }

    public TreeState(boolean selected, boolean opended, boolean disabled) {
        this.selected = selected;
        this.opended = opended;
        this.disabled = disabled;
    }
    public boolean isSelected(){
        return selected;
    }
    public void setSelected(boolean selected){
        this.selected=selected;
    }
    public boolean isOpened(){
        return opended;
    }
    public void setOpened(boolean opened){
        this.opended=opened;
    }
    public boolean isDisable(){
        return disabled;
    }
    public void setDisabled(boolean disable){
        this.disabled=disable;
        
    }

}
