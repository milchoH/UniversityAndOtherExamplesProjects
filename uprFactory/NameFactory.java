package uprFactory;
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A390CEF4-CD93-2273-BF9C-423252701DC0]
// </editor-fold> 
public class NameFactory {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C8BADEA8-4977-0D1D-6642-DD7753F4586C]
    // </editor-fold> 
    public NameFactory () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.80D8C85C-90E3-FC06-C8A6-D0D81995ED85]
    // </editor-fold> 
 
    public static Namer getNamer (String userInput) {
    	int i = userInput.indexOf(",");
    	if (i>0) return new LastFirst(userInput);
    	else return new FirstFirst(userInput);
    	}

}

