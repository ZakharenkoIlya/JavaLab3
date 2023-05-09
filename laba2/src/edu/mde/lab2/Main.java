package edu.mde.lab2;

import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final double A=0.5;
        final double B=-0.3;

        final Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x: ");
        final double x=scanner.nextDouble();
        final Function expressionFirst =
              Sum.of(
                      Power.of(
                              Abs.of(
                                      Sum.of(
                                              Multiplication.of(Const.of(A),Ctg.of(Linear.X)),
                                              Multiplication.of(Const.NEGATIVE_ONE,Multiplication.of(Const.of(B),Tg.of(Linear.X)))
                                      )
                              ), 0.5),
                      Power.of(Sum.of(Linear.X,Const.of(A)),3)
              )  ;
        final NumberFormat nf_1 = NumberFormat.getInstance();
        System.out.format("f1(x) = %s",
                expressionFirst.toPrettyString(nf_1)
        ).println();
        System.out.format("f'1(x) = %s",
                expressionFirst.derivative().toPrettyString(nf_1)
        ).println();
        System.out.format("f1(x) = %f",
                expressionFirst.calculate(x)
        ).println();
        System.out.format("f'1(x) = %f",
                expressionFirst.derivative().calculate(x)
        ).println();

        final Function expressionSecond =
                Multiplication.of(
                        Linear.X,
                        Power.of(Logn.of(
                                Abs.of(Sum.of(
                                        Multiplication.of(Const.of(A),Sin.of(Linear.X)),
                                        Multiplication.of(Const.of(B),Cos.of(Linear.X))
                                ))
                        ),2)
                )  ;
        final NumberFormat nf_2 = NumberFormat.getInstance();
        System.out.format("f2(x) = %s",
                expressionSecond.toPrettyString(nf_2)
        ).println();
        System.out.format("f'2(x) = %s",
                expressionSecond.derivative().toPrettyString(nf_2)
        ).println();
        System.out.format("f2(x) = %f",
                expressionSecond.calculate(x)
        ).println();
        System.out.format("f'2(x) = %f",
                expressionSecond.derivative().calculate(x)
        ).println();
    }

}