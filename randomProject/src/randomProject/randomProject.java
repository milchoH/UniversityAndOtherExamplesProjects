package randomProject;
import org.uszeged.inf.optimization.algorithm.optimizer.local.*;
import org.uszeged.inf.optimization.data.*;
import org.uszeged.inf.optimization.functions.*;

public class randomProject {
	
	public static void main(String[] args){
		Unirandi.Builder localBuilder = new Unirandi.Builder();
		LocalOptimizer<Vector> local = localBuilder.build();
		
		
		
		local.setObjectiveFunction(new TestEvaluationFunc());
		local.setStartingPoint(new Vector(new double[]{1,4}));
		local.restart();
		local.run();
		
	}

}
