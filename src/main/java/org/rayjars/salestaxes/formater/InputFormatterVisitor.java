package org.rayjars.salestaxes.formater;

import org.rayjars.salestaxes.Basket;
import org.rayjars.salestaxes.Product;


public class InputFormatterVisitor implements FormatterVisitor {

    private StringBuilder builder;

    public InputFormatterVisitor(){
        builder = new StringBuilder();
        builder.append("INPUT :").append("\n");
    }

    public void visit(Integer index, Basket basket) {
        builder.append("Input "+index).append(":\n");
    }

    public void visit(Basket basket) {
       // Do nothing
    }

    public void visit(Product product) {
        builder.append("1")
                .append(" ")
                .append(product.getName())
                .append(" at ")
                .append(product.getPrice())
                .append("\n").toString();
    }

    public String format() {
        return builder.toString();  //To change body of implemented methods use File | Settings | File Templates.
    }

}
