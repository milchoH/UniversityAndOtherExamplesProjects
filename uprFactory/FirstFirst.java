package uprFactory;
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A34EE170-865C-354C-9081-290EBA49966D]
// </editor-fold> 
public class FirstFirst extends Namer {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7D672DF4-D664-6C64-C9FC-59137EC50C6C]
    // </editor-fold> 
	public FirstFirst (String s) {
		int i = s.lastIndexOf(" "); //find space
		if (i > 0) { //left is first name, right is last name
		first = s.substring(0, i).trim();
		last = s.substring(i+1).trim();
		}
		else {
		first = ""; // put all in last name if no space
		last = s;
		}
		}
		

}

