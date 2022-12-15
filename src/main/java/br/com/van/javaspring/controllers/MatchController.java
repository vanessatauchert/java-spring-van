package br.com.van.javaspring.controllers;

import br.com.van.javaspring.converter.NumberConverter;
import br.com.van.javaspring.exceptions.UnsupportedMathOperationException;
import br.com.van.javaspring.match.SimpleMath;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

import static br.com.van.javaspring.converter.NumberConverter.covertToDouble;
import static br.com.van.javaspring.converter.NumberConverter.isNumeric;


@RestController
public class MatchController {
    private static final AtomicLong counter  = new AtomicLong();
    private SimpleMath math = new SimpleMath();
    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.sum(NumberConverter.covertToDouble(numberOne), covertToDouble(numberTwo));
    }

    @RequestMapping(value="/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sub(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.sub(NumberConverter.covertToDouble(numberOne), covertToDouble(numberTwo));
    }

    @RequestMapping(value="/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double mult(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.mult(NumberConverter.covertToDouble(numberOne), covertToDouble(numberTwo));
    }

    @RequestMapping(value="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double div(@PathVariable("numberOne") String numberOne,
                       @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.div(NumberConverter.covertToDouble(numberOne), covertToDouble(numberTwo));
    }

    @RequestMapping(value="/med/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double med(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.med(NumberConverter.covertToDouble(numberOne), covertToDouble(numberTwo));
    }

    @RequestMapping(value="/sqr/{numberOne}", method=RequestMethod.GET)
    public Double sqr(@PathVariable("numberOne") String numberOne
                     ) throws Exception {
        if (!isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.sqr(NumberConverter.covertToDouble(numberOne));
    }



}
