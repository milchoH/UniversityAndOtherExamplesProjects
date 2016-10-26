package project;
import org.uszeged.inf.optimization.algorithm.optimizer.local.*;
import org.uszeged.inf.optimization.data.*;
import org.uszeged.inf.optimization.functions.*;
import org.uszeged.inf.optimization.util.Logger;

public class randomProject {
	
	public static void main(String[] args){
		Unirandi.Builder localBuilder = new Unirandi.Builder();
		LocalOptimizer<Vector> local = localBuilder.build();
		TestEvaluationFunc f = new TestEvaluationFunc();
		
		Logger.setMinimumLogLevel(Logger.Level.TRACE);
		
		local.setObjectiveFunction(f);
		local.setLowerBoundOfSearchSpace(new Vector(new double[]{-10,-10}));
		local.setUpperBoundOfSearchSpace(new Vector(new double[]{10,10}));
		local.setStartingPoint(new Vector(new double[]{0.1,0.4}), 17);
		local.restart();
		
		local.run(); // distributed job
		
		System.out.println(local.getLocalOptimumValue() + " : " + local.getLocalOptimum());
		System.out.println(f.numOfEvaluations);
	}

}
