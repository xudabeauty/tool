package com.xu.model;

import java.io.Serializable;

import com.sun.javafx.collections.MappingChange.Map;

public class JsTree implements Serializable {

    /**  */
    private static final long serialVersionUID = -964733543384515431L;
    protected String id;
    protected String parent ="#";
    protected String text="New Node";
    protected String  type="default";
    protected String icon;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public TreeState getState() {
        return state;
    }

    public void setState(TreeState state) {
        this.state = state;
    }

    public Map<String, String> getLi_attr() {
        return li_attr;
    }

    public void setLi_attr(Map<String, String> li_attr) {
        this.li_attr = li_attr;
    }

    public Map<String, String> getA_attr() {
        return a_attr;
    }

    public void setA_attr(Map<String, String> a_attr) {
        this.a_attr = a_attr;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    protected TreeState state;
    protected Map<String, String> li_attr;
    protected Map<String, String> a_attr;
    protected boolean children =false;
    
    public JsTree(String id){
        this.id=id;
    }
    @Override
    public int hashCode(){
        return super.hashCode();
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof JsTree){
            JsTree jsTree=(JsTree)obj;
            return this.id.equals(jsTree.getId());
        }
        return super.equals(obj);
    }
   
}
