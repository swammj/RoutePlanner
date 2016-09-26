package mainPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santunez
 */
public class Store {
    
    String index; //indice en el archivo de entrada
    XYCoordinates position;
    Double distance;    
    
    public Store(){
        
    }
    
    public Store (String index, XYCoordinates position){
        this.index=index;
        this.position=position;        
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public XYCoordinates getPosition() {
        return position;
    }

    public void setPosition(XYCoordinates position) {
        this.position = position;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }   
}
