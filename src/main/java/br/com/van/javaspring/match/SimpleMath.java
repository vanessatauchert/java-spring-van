package br.com.van.javaspring.match;

public class SimpleMath {


    public Double sum( Double numberOne, Double numberTwo) throws Exception {
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne,Double numberTwo) throws Exception {
        return numberOne -numberTwo;
    }

    public Double mult(Double numberOne,Double numberTwo) throws Exception {
        return numberOne * numberTwo;
    }

    public Double div(Double numberOne,Double numberTwo) throws Exception {
        return numberOne / numberTwo;
    }

    public Double med(Double numberOne,Double numberTwo) throws Exception {
        return (numberOne + numberTwo) / 2;
    }

    public Double sqr(Double numberOne) throws Exception {
        return Math.sqrt (numberOne);
    }

}
