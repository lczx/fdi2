package eqsolve.solver;

import eqsolve.equation.Equation;

public interface Solver {

    boolean canSolve(Equation eq);

    double[] solve(Equation eq);

}
