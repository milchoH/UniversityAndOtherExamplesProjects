package factory;

public class DinoFactory {
	public static Dinosaur createDino(int dinoHint)throws DinoException{
		Dinosaur result = null;
		switch(dinoHint){
		case Dinosaur.DINO_TREX:
			result = new TRex();
			break;
		case Dinosaur.DINO_PTERO:
			result = new Pterodactyl();
			break;
			
		default:
			throw new DinoException("dino not supported");
		}
		
		return result;
	}
}
