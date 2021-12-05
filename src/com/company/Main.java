package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        final Function expression =
                Difference.of(
                        Multiplication.of(
                                Const.of(2.0),
                                Pow.of(3,Cos.of(Linear.X,1),1)

                        ),

                        Abs.of(Multiplication.of(
                                Const.of(-3.0),
                                Tan.of(Pow.of(0.5, Linear.X, 1),1)))
                );
        final NumberFormat nf = NumberFormat.getInstance();
        System.out.format("f(x) = %s",expression.toPrettyString(nf)).println();
        System.out.format("f'(x) = %s",expression.derivative().toPrettyString(nf)).println();
        System.out.format("f(0.1) = %f",expression.calculate(1)).println();
        System.out.format("f'(0.1) = %f",expression.derivative().calculate(1)).println();

        final Function expression2 =
                Divide.of(
                        Multiplication.of(
                                Const.of(2.0),
                                Linear.X
                        ),

                        Pow.of(2, Ln.of(
                                Pow.of(
                                        3.0,
                                        Difference.of(
                                                Linear.X, Const.of(-3.0)), 1), 1), 1)
                );
        System.out.format("f(x) = %s",expression2.toPrettyString(nf)).println();
        System.out.format("f'(x) = %s",expression2.derivative().toPrettyString(nf)).println();
        System.out.format("f(0.1) = %f",expression2.calculate(1)).println();
        System.out.format("f'(0.1) = %f",expression2.derivative().calculate(1)).println();
    }
}


