package eqsolve.solver;

import eqsolve.equation.Equation;
import eqsolve.equation.LinearEquation;

public class LinearSolver implements Solver {

    @Override
    public boolean canSolve(Equation eq) {
        return eq instanceof LinearEquation;
    }

    @Override
    public double[] solve(Equation eq) {
        if (!canSolve(eq)) throw new RuntimeException("I told ya dat I can't solve that darn thing!");
        return new double[]{-eq.getParam(1) / eq.getParam(0)};
    }

}
