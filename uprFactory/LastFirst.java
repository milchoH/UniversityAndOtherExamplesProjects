package uprFactory;
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.DC25045F-0EEA-6634-45DA-1F6783C4BB86]
// </editor-fold> 
public class LastFirst extends Namer {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D8CE2980-B9CD-4B26-B6C3-930752C557F6]
    // </editor-fold> 
	public LastFirst (String s) {
		int i = s.indexOf(","); //find comma
		if (i > 0) { //left is last name, right is first name
		last = s.substring(0, i).trim();
		first = s.substring(i + 1).trim();
		}
		else {
			last = s; // put all in last name
			first = ""; // if no comma
			}
		}
	}

